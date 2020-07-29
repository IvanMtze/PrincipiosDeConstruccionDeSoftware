/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCP;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wuser
 */
public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket sc = null;
        final int PORT = 5000;
        DataInputStream input;
        DataOutputStream output;
        
        
        try{
            server = new ServerSocket(PORT);
            while (true){
                sc = server.accept();
                input = new DataInputStream(sc.getInputStream());
                output = new DataOutputStream(sc.getOutputStream());
                
                String message = input.readUTF();
                output.writeUTF("Hello");
                sc.close();
            }
            
        }catch(Exception e){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null, e);
        }
    }

}
