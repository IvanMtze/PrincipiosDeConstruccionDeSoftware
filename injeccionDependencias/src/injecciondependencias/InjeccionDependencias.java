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
public class InjeccionDependencias {

    public static void main(String[] args) {
        Reproductor rep = new Reproductor();
        MP4 video = new MP4();
        rep.play(video);
        rep.stop(video);
    }
    
}
