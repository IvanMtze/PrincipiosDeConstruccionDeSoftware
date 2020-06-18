/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injecciondependencias;

/**
 *
 * @author wuser
 */
public class Reproductor {
    public void play(IMedia media){
        media.play();
    }
    public void stop(IMedia media){
        media.stop();
    }
}
