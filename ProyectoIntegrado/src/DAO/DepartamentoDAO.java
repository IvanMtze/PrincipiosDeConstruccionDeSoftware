/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import utils.ConexionDB;

/**
 *
 * @author oswaldo
 */
public class DepartamentoDAO implements IDAOGeneral<Departamento>{

    @Override
    public boolean guardar(Departamento pojo) {
        boolean res;
       ConexionDB con=ConexionDB.getInstance();
       String sql="insert into departamento(nombre) values ('" + pojo.getNombre()+ "')";
       res=con.execute(sql);
       return res;
    }

    @Override
    public boolean editar(Departamento pojo) {
        boolean res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="update departamento set nombre='"+pojo.getNombre()+
                "' where clave= '"+pojo.getClave()+"'";
        res=con.execute(sql);
        return res;
    }

    @Override
    public ResultSet buscar(Departamento pojo) {
        ResultSet res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="select * from departamento where clave = '"+pojo.getClave()+"'";
        res=con.select(sql);
        return res;
    }

    @Override
    public boolean eliminar(Departamento pojo) {
        boolean res;
        ConexionDB con=ConexionDB.getInstance();
        String sql="delete from departamento where clave = '"+pojo.getClave()+"'";
        res=con.execute(sql);
        return res;
    }
    
}
