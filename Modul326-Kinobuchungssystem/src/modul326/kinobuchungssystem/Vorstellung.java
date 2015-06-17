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
public class Vorstellung {
    public String filmName;
    public String datum;
    public String zeit;
    public Kinosaal saal;

    public Vorstellung(String filmName, String datum, String zeit,Kinosaal saal) {
        this.filmName = filmName;
        this.datum = datum;
        this.zeit = zeit;
        this.saal = saal;
    }
    

    
    
    public Kinosaal liefereKinosaal(){
        return this.saal;
    }
}
