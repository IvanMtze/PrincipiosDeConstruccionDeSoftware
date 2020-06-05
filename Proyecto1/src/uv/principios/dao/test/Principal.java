/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.dao.test;
import uv.principios.dao.*;

/**
 *
 * @author oswaldo
 */
public class Principal {
    public static void main(String[] args){
        IDAOGeneral daop=FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
        Persona p=new Persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("av.1");
        p.setTelefono("777");
        
        Departamento dep=new Departamento();
        dep.setClave("01");
        p.setDepartamento(dep);
        
        daop.guardar(p):
    }
}
