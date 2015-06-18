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
public class Kinosaal {
    public int nummer;
    public ArrayList<Reihe> reihe = new ArrayList<Reihe>();

    public Kinosaal(int nummer) {
        this.nummer = nummer;
    }
    
    public void ReiheEinfuegen(Reihe a){
        this.reihe.add(a);
    }
    
    public ArrayList<Reihe> liefereReihen(){
        return this.reihe;
    }
}
