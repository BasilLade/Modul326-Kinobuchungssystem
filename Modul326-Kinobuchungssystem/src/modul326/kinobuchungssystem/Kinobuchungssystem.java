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

    public Kinobuchungssystem() {

         
         Kinosaal saal1 = new Kinosaal(1);
         Kinosaal saal2 = new Kinosaal(2);
         
         Reihe reihe1 = new Reihe(1);
         Reihe reihe2 = new Reihe(2);
         Reihe reihe3 = new Reihe(3);
         Reihe reihe4 = new Reihe(4);
         
         Platz platz1 = new Platz(1);
         Platz platz2 = new Platz(2);
         Platz platz3 = new Platz(3);
         Platz platz4 = new Platz(4);
         Platz platz5 = new Platz(5);
         Platz platz6 = new Platz(6);
         Platz platz7 = new Platz(7);
         Platz platz8 = new Platz(8);
         
         
  
         saal1.ReiheEinfuegen(reihe1);
         saal1.ReiheEinfuegen(reihe2);
         saal2.ReiheEinfuegen(reihe3);
         saal2.ReiheEinfuegen(reihe4);
         
        reihe1.PlatzEinfuegen(platz1);
        reihe1.PlatzEinfuegen(platz2);
        reihe2.PlatzEinfuegen(platz3);
        reihe2.PlatzEinfuegen(platz4);
        reihe3.PlatzEinfuegen(platz5);
        reihe3.PlatzEinfuegen(platz6);
        reihe4.PlatzEinfuegen(platz7);
        reihe4.PlatzEinfuegen(platz8);
        
        
         filmMachen("derp","derp","derp", saal2);
         filmMachen("derp","derp","derp", saal1);
         
         machReservierung(1, "078 790 23 77",platz1);
         machReservierung(2, "078 790 23 74",platz5);
         
         kaufPlatz(platz2);
         kaufPlatz(platz3);
         
         
         checkPlätze(platz1,platz2,platz3,platz4,platz5,platz6,platz7,platz8);
    }
    
    
    
    public void checkPlätze(Platz platz1,Platz platz2,Platz platz3,Platz platz4,Platz platz5,Platz platz6,Platz platz7,Platz platz8){
        if(platz1.istPlatzReserviert()){
             System.out.println("Platz 1 ist reserviert");
         }
        if(platz2.istPlatzReserviert()){
             System.out.println("Platz 2 ist reserviert");
         }
        if(platz3.istPlatzReserviert()){
             System.out.println("Platz 3 ist reserviert");
         }
        if(platz4.istPlatzReserviert()){
             System.out.println("Platz 4 ist reserviert");
         }
        if(platz5.istPlatzReserviert()){
             System.out.println("Platz 5 ist reserviert");
         }
        if(platz6.istPlatzReserviert()){
             System.out.println("Platz 6 ist reserviert");
         }
        if(platz7.istPlatzReserviert()){
             System.out.println("Platz 7 ist reserviert");
         }
        if(platz8.istPlatzReserviert()){
             System.out.println("Platz 8 ist reserviert");
         }
        if(platz1.istPlatzVerkauft()){
             System.out.println("Platz 1 ist Verkauft");
         }
        if(platz2.istPlatzVerkauft()){
             System.out.println("Platz 2 ist Verkauft");
         }
        if(platz3.istPlatzVerkauft()){
             System.out.println("Platz 3 ist Verkauft");
         }
        if(platz4.istPlatzVerkauft()){
             System.out.println("Platz 4 ist Verkauft");
         }
        if(platz5.istPlatzVerkauft()){
             System.out.println("Platz 5 ist Verkauft");
         }
        if(platz6.istPlatzVerkauft()){
             System.out.println("Platz 6 ist Verkauft");
         }
        if(platz7.istPlatzVerkauft()){
             System.out.println("Platz 7 ist Verkauft");
         }
        if(platz8.istPlatzVerkauft()){
             System.out.println("Platz 8 ist Verkauft");
         }
        if(platz1.istPlatzFrei()){
             System.out.println("Platz 1 ist Frei");
         }
        if(platz2.istPlatzFrei()){
             System.out.println("Platz 2 ist Frei");
         }
        if(platz3.istPlatzFrei()){
             System.out.println("Platz 3 ist Frei");
         }
        if(platz4.istPlatzFrei()){
             System.out.println("Platz 4 ist Frei");
         }
        if(platz5.istPlatzFrei()){
             System.out.println("Platz 5 ist Frei");
         }
        if(platz6.istPlatzFrei()){
             System.out.println("Platz 6 ist Frei");
         }
        if(platz7.istPlatzFrei()){
             System.out.println("Platz 7 ist Frei");
         }
        if(platz8.istPlatzFrei()){
             System.out.println("Platz 8 ist Frei");
         }
        
    }
    
    public void filmMachen(String filmName, String datum, String zeit,Kinosaal saal){
        Vorstellung film = new Vorstellung(filmName,datum,zeit,saal);
        filme.add(film);
    }
 

    public Vorstellung zeigeVorstellung(int a){
       return filme.get(a);
    }
    
    public void machReservierung(int reservierungsNr, String telefonNummer, Platz p){
        Reservierung lel = new Reservierung( reservierungsNr,  telefonNummer, p);
        res.add(lel);
    }
    
    public int liefereBuchungNummer() {
        return naechsteBuchungsnummer;
    }
    
    public void kaufPlatz(Platz p){
        p.verkaufePlatz();
    }
 
}
