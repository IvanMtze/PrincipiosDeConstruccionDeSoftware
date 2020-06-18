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
public class MP4 implements IMedia{
    public void play(){
        System.out.println("Tocando el MP4 ");
    }    
    public void stop(){
        System.out.println("Deteniendo el MP4 ");
    }
}
