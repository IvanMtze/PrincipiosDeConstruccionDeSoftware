/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojthread;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author oswaldo
 */
public class Reloj extends Thread{
    private JTextField txtMinutos,txtSegundos;
    private boolean isRun=false, intento=false;
    private long s=0,m=0;

    public Reloj(JTextField txtMinutos, JTextField txtSegundos){
        this.txtMinutos=txtMinutos;
        this.txtSegundos=txtSegundos;
        isRun=true;
    }
    
    public synchronized void detener(){
        isRun=false;
    }
    
    private void primerMinuto(){
        if(s==60 && intento==false){
            m=1;
            txtSegundos.setText("0");
        }
    }
    
    private void reiniciar(){
        if(m==60 && s==60){
            m=0;
            s=0;
            intento=false;
        }
    }
    
    private void incrementarMinutos() throws InterruptedException{
        if(s==60){
            txtSegundos.setText("0");
            Thread.sleep(1000);
            s=1;
            txtMinutos.setText(String.valueOf(m));
            txtSegundos.setText(String.valueOf(s));
            m++;
            intento=true;
        }
    }
    
    @Override
    public void run(){
        while(isRun){
            try{
                primerMinuto();
                txtSegundos.setText(String.valueOf(s));
                incrementarMinutos();
                Thread.sleep(1000);
                s++;
                reiniciar();
            }catch(InterruptedException ex){
                 Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
