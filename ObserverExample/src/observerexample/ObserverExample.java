/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

/**
 *
 * @author wuser
 */
public class ObserverExample {

    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();
        
        Student bob = new Student();
        Student joe = new Student();
        
        board.addObserver(joe);
        board.addObserver(bob);
        
        board.setMessage("More Homework!");
    }
    
}
