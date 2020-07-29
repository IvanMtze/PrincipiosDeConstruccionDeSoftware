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
public class Reproductor {
    public void reproducir(IMedia media){
        media.reproducir();
    }
    public void detener(IMedia media){
        media.detener();
    }
    public void siguiente(IMedia media){
        media.siguiente();
    }
    public void anterior(IMedia media){
        media.anterior();
    }
}
