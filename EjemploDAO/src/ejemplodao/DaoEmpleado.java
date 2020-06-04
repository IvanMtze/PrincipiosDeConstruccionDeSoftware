/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodao;

import java.sql.Connection;

/**
 *
 * @author wuser
 */
public class DaoEmpleado {

   public boolean guardar(PojoEmpleado e){
       String sql ="insert into persona(clave, nombre, direccion, telefono) values"
       + "('"+e.getClave() + "', '" + e.getNombre() + "', '"
       + e.getDireccion() + "','"+e.getTelefono() +"')";
       ConexionDB conn = ConexionDB.getInstance();
       return conn.execute(sql);
   }
   
}
