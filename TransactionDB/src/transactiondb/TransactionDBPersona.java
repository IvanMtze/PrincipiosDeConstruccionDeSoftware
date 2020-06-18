/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactiondb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wuser
 */
public class TransactionDBPersona extends TransactionDB<Persona>{
    private Persona p;

    public TransactionDBPersona(Persona t) {
        super(t);
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    @Override
    public boolean execute(Connection db) {
        String sql = "INSERT INTO PERSONA (clave, nombre, direccion, telefono) VALUES (?,?,?,?";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(0, p.getClave());
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDireccion());
            ps.setString(3, p.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDBPersona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
