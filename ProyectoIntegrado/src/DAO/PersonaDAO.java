/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import utils.ConexionDB;

/**
 *
 * @author oswaldo
 */
public class PersonaDAO implements IDAOGeneral<Persona> {

    @Override
    public boolean guardar(Persona pojo) {
        boolean res;
        ConexionDB con = ConexionDB.getInstance();
        String sql = "insert into persona(nombre,direccion,telefono,departamento) values ('"
                + pojo.getNombre() + "','" + pojo.getDireccion() + "','"
                + pojo.getTelefono()+"','"+pojo.getDepartamento().getClave()+ "')";
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean editar(Persona pojo) {
        boolean res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="update persona set nombre= '"+pojo.getNombre()+
                "',telefono= '"+pojo.getTelefono()+
                "' ,direccion = ' "+pojo.getDireccion()+
                "' ,departamento = '"+pojo.getDepartamento()+"'"+
                "where clave = '"+pojo.getClave()+"'";
        res=con.execute(sql);
        return res;
    }

    @Override
    public ResultSet buscar(Persona pojo) {
        ResultSet res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="select * from persona where clave = '"+pojo.getClave()+"'";
        res=con.select(sql);
        return res;
    }

    @Override
    public boolean eliminar(Persona pojo) {
        boolean res;
        ConexionDB con= ConexionDB.getInstance();
        String sql="delete from persona where clave = '"+pojo.getClave()+"'";
        res=con.execute(sql);
        return res;
    }
}
