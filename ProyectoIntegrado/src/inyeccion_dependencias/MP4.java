/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inyeccion_dependencias;

/**
 *
 * @author oswaldo
 */
public class MP4 implements IMedia{

    @Override
    public void reproducir() {
        System.out.println("Iniciar MP4");
    }

    @Override
    public void detener() {
        System.out.println("Detener MP4");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente MP4");
    }

    @Override
    public void anterior() {
        System.out.println("Anterior MP4");
    }
    
}
