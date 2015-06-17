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
public class Kinobuchungssystem {
    private int naechsteBuchungsnummer;
    private ArrayList<Vorstellung> filme = new ArrayList<Vorstellung>();
    private ArrayList<Reservierung> res = new ArrayList<Reservierung>();
    
    
    public void filmMachen(String filmName, String datum, String zeit,Kinosaal saal){
        Vorstellung film = new Vorstellung(filmName,datum,zeit,saal);
        filme.add(film);
    }
 

    public Vorstellung zeigeVorstellung(int a){
       return filme.get(a);
    }
    public void machReservierung(int reservierungsNr, String telefonNummer){
        Reservierung lel = new Reservierung( reservierungsNr,  telefonNummer);
        res.add(lel);
    }
       public int liefereBuchung() {
        return naechsteBuchungsnummer;
    }
 
}
