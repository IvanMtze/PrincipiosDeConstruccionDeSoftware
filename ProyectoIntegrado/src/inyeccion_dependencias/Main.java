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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reproductor rep = new Reproductor();
        MP4 video = new MP4();
        MP3 musica = new MP3();
        
        rep.reproducir(video);
        rep.detener(video);
        rep.siguiente(video);
        rep.anterior(video);
        
        System.out.println("");
        
        rep.reproducir(musica);
        rep.detener(musica);
        rep.siguiente(musica);
        rep.anterior(musica);
        
        
    }
    
}
