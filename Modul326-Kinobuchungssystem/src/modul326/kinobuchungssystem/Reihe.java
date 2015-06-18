/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul326.kinobuchungssystem;

import java.util.ArrayList;

/**
 *
 * @author Timothe
 */
public class Reihe {

   
    public int reihenNr;
    public ArrayList<Platz> platz = new ArrayList<Platz>();
    
    public Reihe(int reihenNr) {
        this.reihenNr = reihenNr;
    }
     public void ReiheEinfuegen(Platz a){
        this.platz.add(a);
    }
    public ArrayList<Platz> lieferePlätze(){
        return this.platz;
    }
}
