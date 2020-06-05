/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.dao;
import uv.principios.utils.ConexionDB;
/**
 *
 * @author oswaldo
 */
public class PersonaDAO implements IDAOGeneral<Persona> {
    
    @Override 
    public boolean guardar(Persona pojo){
        boolean res=false;
        ConexionDB con=ConexionDB.getInstanse();
        String sql="insert into persona(clave,nombre,direccion,telefono,departamento) values (" +
               pojo.getClave() + "," + pojo.getNombre() + ","+pojo.getDireccion()+","+
                pojo.getTelefono()+","+")";
        res=con.execute(sql);
        return res;
    }
        
}
