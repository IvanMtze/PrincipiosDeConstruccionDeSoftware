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
public class MP3 implements IMedio{

    @Override
    public void play() {
        System.out.println("Iniciar play MP3 ");
    }

    @Override
    public void stop() {
        System.out.println("Detiene play MP3 ");
    }
    
}
