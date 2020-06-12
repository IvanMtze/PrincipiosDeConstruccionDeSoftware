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
public class ReproducirMultimedia {
    
    
    
    public void play(IMedio medio){
        medio.play();
    }
    public void stop(IMedio medio){
        medio.stop();
    }
}
