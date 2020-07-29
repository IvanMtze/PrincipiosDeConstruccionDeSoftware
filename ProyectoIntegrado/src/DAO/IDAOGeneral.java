/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author oswaldo
 */
public interface IDAOGeneral<T> {
    public boolean guardar(T pojo);
    public boolean editar(T pojo);
    public ResultSet buscar(T pojo);
    public boolean eliminar(T pojo);
    
}
