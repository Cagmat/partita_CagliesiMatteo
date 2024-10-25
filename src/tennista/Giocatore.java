/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tennista;

/**
 *
 * @author user
 */
public class Giocatore extends Thread {
    private String nome;
    private int idGiocatore;

    public Giocatore(int idGiocatore, String nome) {
        this.nome = nome;
        this.idGiocatore = idGiocatore;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("il giocatore: "+ nome+ " - id:" + idGiocatore + " -- colpo numero: " +i);
            Thread.yield();
            
            //messaggio
        }
    }
    
    
}
