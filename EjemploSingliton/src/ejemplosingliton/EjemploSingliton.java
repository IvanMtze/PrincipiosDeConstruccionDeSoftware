/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingliton;

import java.sql.Connection;

/**
 *
 * @author wuser
 */
public class EjemploSingliton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con=null;
        
        con = Conection.getConnection();
        System.out.println(con);
        
        con = Conection.getConnection();
        System.out.println(con);
        
        con = Conection.getConnection();
        System.out.println(con);
        
        con = Conection.getConnection();
        System.out.println(con);
        
    }
    
}
