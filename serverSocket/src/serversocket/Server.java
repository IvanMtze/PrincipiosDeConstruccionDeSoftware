/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wuser
 */
public class Server extends Thread{
    private Socket socket;
    private int idSessio;
    public Server(Socket socket, int id) {
        this.socket = socket;
        this.idSessio = id;
    }
    
    public void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {    
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader receptor = new BufferedReader(inputStreamReader);
            
            PrintWriter emisor = new PrintWriter(socket.getOutputStream());
            String msg = receptor.readLine();
            System.out.println("El Cliente "+this.idSessio+" dice: " + msg);
            if (msg.equals("Hola")) {
                emisor.println("Hola we\n Adios we");
                emisor.flush();
            }else{
                emisor.println("No te entiendo, tas tonto\nAdios we");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconnectar();
    }
}
