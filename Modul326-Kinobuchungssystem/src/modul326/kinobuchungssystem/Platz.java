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
    public platzStatus stat;
    public int platzNr;
    public int reservierungsNr;
    
    
    public Platz(int platzNr) {
        this.stat = platzStatus.FREI;
        this.platzNr = platzNr;
     
    }
    
    public String getPlatzNRWithNull() {
        if(platzNr < 10) {
            return "0" + platzNr;
        } else {
            return "" + platzNr;
        }
    }

    public int lieferePlatzNR() {
        return platzNr;
    }
    
    public boolean istPlatzFrei(){
        if(stat.equals(platzStatus.FREI)){
            return true;
        } else {
            return false;
        }
    }
    public boolean istPlatzReserviert(){
        if(stat.equals(platzStatus.RESERVIERT)){
            return true;
        } else {
            return false;
        }
    }
    public boolean istPlatzVerkauft(){
        if(stat.equals(platzStatus.VERKAUFT)){
            return true;
        } else {
            return false;
        }
    }
    public void setPlatzToReserviert(){
        this.stat = platzStatus.RESERVIERT;
    }
    public void setPlatzToFrei(){
        this.stat = platzStatus.FREI;
    }
    public void setPlatzToVerkauft(){
        this.stat = platzStatus.VERKAUFT;
    }
    
}
