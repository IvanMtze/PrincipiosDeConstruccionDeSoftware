/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobserv;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oswaldo
 */
public class HiloCliente extends Observable implements Runnable{
    private boolean isStoped=false;
    private Socket cliente=null;
    private BufferedReader receptor=null;
    private PrintWriter emisor=null;
    
    public HiloCliente(Socket cliente){
        this.cliente=cliente;
        InputStreamReader isr;
        try {
            isr = new InputStreamReader(cliente.getInputStream());
            receptor = new BufferedReader(isr);
            emisor = new PrintWriter(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized void stoped(){
        isStoped=true;  
    }
    @Override
    public void run(){
        while(!isStoped){
            try {
                setChanged();
                
                emisor.write("Hola mundo \n");
                emisor.flush();
                notifyObservers("Valor");
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
