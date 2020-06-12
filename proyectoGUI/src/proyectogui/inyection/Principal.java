/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.inyection;

/**
 *
 * @author oswaldo
 */
public class Principal {
    public static void main(String[]args){
        MP3 mp3=new MP3();
        ReproducirMultimedia rep=new ReproducirMultimedia();
        rep.play(mp3);
    }
}
