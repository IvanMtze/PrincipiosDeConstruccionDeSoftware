/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wuser
 */
public class Conection {

    private static Connection conn;
    private static Conection conection;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    // Constructor
    private Conection() {
        String url = "jdbc:postgresql://localhost:5432/EmpleadoEjemplo?user=postgres&password=2408";
        String driver = "org.postgresql.Driver";
        String usuario = "postgres";
        String password = "2408";

        conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // Fin constructor

    private Connection getConnection() {
        return conn;
    }

    /**
     * This is the implementation of the singleton. We are using it to get a connection to the dababase
     * @return Connection to the database
     */
    public static Conection getInstance() {
        if (conn == null) {
            conection = new Conection();
        }
        return conection;
    }

    /**
     * This method executes a query that doesn't have a result. 
     * @param  query
     * @return Boolean, the stage of the query
     */
    public boolean execute(String query) {
        boolean bool = false;
        try {
            Statement st = Conection.getInstance().getConnection().createStatement();
            bool = st.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }

    /**
     * This methods executes a select query. Use it only and only if you need a select query
     * @param query
     * @
     * @return ResultSet, the resultSet of the query. Return null if a SQLException has been thrown
     */
    public ResultSet query(String query) {
        ResultSet rs = null;
        try {
            Statement st = Conection.getInstance().getConnection().createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public boolean execute(TransactionDB query) {
        
        return query.execute(getConnection());
    }
}
