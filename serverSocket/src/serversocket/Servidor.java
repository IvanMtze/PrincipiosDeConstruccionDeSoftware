/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wuser
 */
public class Servidor {

    public static void main(String[] args) {
        ServerSocket serverSocket;
        boolean run = true;

        try {
            serverSocket = new ServerSocket(5000);
            int idSession = 0;
            while (run) {
                Socket cliente = serverSocket.accept();
                System.out.println("new connection: "+cliente);
                
                Server conection = new Server(cliente, idSession);
                conection.start();
                idSession++;
            }
        } catch (Exception ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
