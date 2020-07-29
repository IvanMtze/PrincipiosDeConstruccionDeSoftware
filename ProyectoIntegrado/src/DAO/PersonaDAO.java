/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
        String sql = "insert into persona(clave,nombre,direccion,telefono,departamento) values ("
                + pojo.getClave() + "," + pojo.getNombre() + "," + pojo.getDireccion() + ","
                + pojo.getTelefono() + "," + ")";
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
                "' ,departamento = '"+pojo.getDepartamento()+" ' ";
        res=con.execute(sql);
        return res;
    }

    @Override
    public boolean buscar(Persona pojo) {
        boolean res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="select * from persona where clave = '"+pojo.getClave()+"'";
        res=con.execute(sql);
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
