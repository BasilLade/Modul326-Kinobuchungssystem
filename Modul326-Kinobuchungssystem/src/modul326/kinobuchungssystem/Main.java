/**
 * Mit dem Kinobuchungssystem sollen Tickets gebucht/reserviert werden
 * 
 * @version 0.0.1
 */
package modul326.kinobuchungssystem;

/**
 *
 * @author Basil
 */
public class Main {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
         Platz platz1 = new Platz(1);
         Platz platz2 = new Platz(2);
         Platz platz3 = new Platz(3);
         Platz platz4 = new Platz(4);
         Kinosaal saal1 = new Kinosaal();
         Kinosaal saal2 = new Kinosaal();
         Vorstellung film1 = new Vorstellung("derp","derp","derp",saal1);
         Vorstellung film2 = new Vorstellung("derp","derp","derp",saal2);
        
    }
    
}  
