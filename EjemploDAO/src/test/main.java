package test;

import dao.Departamento;
import dao.FactoryDAO;
import dao.IDAOGeneral;
import dao.Persona;

public class main {
    public static void main(String[] args){
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
        Persona p = new Persona();
        p.setClave("02");
        p.setNombre("Fulano");
        p.setDireccion("Avenida 25");
        p.setTelefono("271113232");
        Departamento dep = new Departamento();
        dep.setClave("01");
        p.setDepartamento(dep);
        if(daop.guardar(p))
            System.out.println("Guardado con éxito");
        else
            System.out.println("Error al guardar");

    }
}