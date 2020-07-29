/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author oswaldo
 */
public interface IDAOGeneral<T> {
    public boolean guardar(T pojo);
    public boolean editar(T pojo);
    public boolean buscar(T pojo);
    public boolean eliminar(T pojo);
    
}
