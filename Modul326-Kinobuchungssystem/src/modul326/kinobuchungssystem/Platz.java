/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul326.kinobuchungssystem;

/**
 *
 * @author Timothe
 */

public class Platz {

   
    public enum platzStatus {
        FREI, RESERVIERT, VERKAUFT
    }
    
    public int platzNr;
    public int reservierungsNr;
    
    public Platz(int platzNr) {
        this.platzNr = platzNr;
     
    }
    public void lieferePlatzNR(){
        
    }
    public void istPlatzFrei(){
        
    }
    public void istPlatzVerkauft(){
        
    }
    public void reservierePlatz(){
        
    }
    public void verkaufePlatz(){
        
    }
    
}
