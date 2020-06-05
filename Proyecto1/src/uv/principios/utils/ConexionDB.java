/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oswaldo
 */
public class ConexionDB {
    private static ConexionDB con=null;
    private Connection connection=null;
    public static ConexionDB getInstance(){
        if(con==null){
            con=new ConexionDB();
        }
        return con;
    }
    
    private ConexionDB(){
        System.out.println("Se creo una instancia");
        String url="jdbc:postgresql://localhost:5432/proyecto1";
        String uname ="postgreSQL";
        String password="2107";
        try{
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(url,uname,password);
        } catch(SQLException e){
            System.err.println("Problema de conexion\n"+e);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public boolean execute(String sql){
        boolean res=false;
        try{
            Statement st= connection.createStatement();
            st.execute(sql);
            res=true;
        }catch(Exception e){
            
        }
        return res;
    }
}
