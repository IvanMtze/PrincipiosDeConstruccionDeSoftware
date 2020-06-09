/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.ConexionDB;

/**
 *
 * @author oswaldo
 */
public class DepartamentoDAO implements IDAOGeneral<Departamento>{
    
    @Override
    public boolean guardar(Departamento pojo){
        boolean res=false;
       ConexionDB con=ConexionDB.getInstance();
       String sql="insert into departamento(clave,nombre) values (" +
               pojo.getClave() + "," + pojo.getClave() + ")";
       res=con.execute(sql);
       return res;
    }
}
