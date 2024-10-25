/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tennista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Tennista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Giocatore g1 = new Giocatore(1,"Matteo");
        Giocatore g2 = new Giocatore(1,"Sara");
        
        g1.start();
        g2.start();
        
        
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tennista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
