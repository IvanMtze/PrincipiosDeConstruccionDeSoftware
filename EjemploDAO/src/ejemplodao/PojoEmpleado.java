/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodao;

/**
 *
 * @author wuser
 */
public class PojoEmpleado {
    
    private String clave;
    
    private String direccion;
    
    private String nombre;

    private String telefono;

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Get the value of clavee
     *
     * @return the value of clavee
     */
    public String getClave() {
        return clave;
    }

    /**
     * Set the value of clavee
     *
     * @param clavee new value of clavee
     */
    public void setClavee(String clave) {
        this.clave = clave;
    }

}
