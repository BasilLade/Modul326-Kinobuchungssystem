package modul326.kinobuchungssystem;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Timothe & Fabian
 */
public class Kinobuchungssystem {

    private int naechsteBuchungsnummer;
    private ArrayList<Vorstellung> filme = new ArrayList<Vorstellung>();
    private ArrayList<Reservierung> res = new ArrayList<Reservierung>();
    public ArrayList<Kinosaal> saele = new ArrayList<Kinosaal>();

    public Kinobuchungssystem() {

        initStuff();

        filmMachen("Ted", "11.2.2012", "94:11", saele.get(0));
        filmMachen("Poltergeist der Neue ;)", "5.5.2015", "77:33", saele.get(1));

        machReservierung("078 790 23 77", saele.get(0).reihe.get(0).platz.get(0));
        machReservierung("078 790 23 74", saele.get(0).reihe.get(2).platz.get(3));

        kaufPlatz(saele.get(0).reihe.get(1).platz.get(2));
        kaufPlatz(saele.get(0).reihe.get(3).platz.get(0));

    }

    private void initStuff() {
        Kinosaal saal1 = new Kinosaal(1);
        Reihe saal1reihe1 = new Reihe(1);
        Platz saal1reihe1platz1 = new Platz(1);
        saal1reihe1.PlatzEinfuegen(saal1reihe1platz1);
        Platz saal1reihe1platz2 = new Platz(2);
        saal1reihe1.PlatzEinfuegen(saal1reihe1platz2);
        Platz saal1reihe1platz3 = new Platz(3);
        saal1reihe1.PlatzEinfuegen(saal1reihe1platz3);
        Platz saal1reihe1platz4 = new Platz(4);
        saal1reihe1.PlatzEinfuegen(saal1reihe1platz4);
        saal1.ReiheEinfuegen(saal1reihe1);

        Reihe saal1reihe2 = new Reihe(2);
        Platz saal1reihe2platz1 = new Platz(5);
        saal1reihe2.PlatzEinfuegen(saal1reihe2platz1);
        Platz saal1reihe2platz2 = new Platz(6);
        saal1reihe2.PlatzEinfuegen(saal1reihe2platz2);
        Platz saal1reihe2platz3 = new Platz(7);
        saal1reihe2.PlatzEinfuegen(saal1reihe2platz3);
        Platz saal1reihe2platz4 = new Platz(8);
        saal1reihe2.PlatzEinfuegen(saal1reihe2platz4);
        saal1.ReiheEinfuegen(saal1reihe2);

        Reihe saal1reihe3 = new Reihe(3);
        Platz saal1reihe3platz1 = new Platz(9);
        saal1reihe3.PlatzEinfuegen(saal1reihe3platz1);
        Platz saal1reihe3platz2 = new Platz(10);
        saal1reihe3.PlatzEinfuegen(saal1reihe3platz2);
        Platz saal1reihe3platz3 = new Platz(11);
        saal1reihe3.PlatzEinfuegen(saal1reihe3platz3);
        Platz saal1reihe3platz4 = new Platz(12);
        saal1reihe3.PlatzEinfuegen(saal1reihe3platz4);
        saal1.ReiheEinfuegen(saal1reihe3);

        Reihe saal1reihe4 = new Reihe(4);
        Platz saal1reihe4platz1 = new Platz(13);
        saal1reihe4.PlatzEinfuegen(saal1reihe4platz1);
        Platz saal1reihe4platz2 = new Platz(14);
        saal1reihe4.PlatzEinfuegen(saal1reihe4platz2);
        Platz saal1reihe4platz3 = new Platz(15);
        saal1reihe4.PlatzEinfuegen(saal1reihe4platz3);
        Platz saal1reihe4platz4 = new Platz(16);
        saal1reihe4.PlatzEinfuegen(saal1reihe4platz4);
        saal1.ReiheEinfuegen(saal1reihe4);
        saele.add(saal1);

        Kinosaal saal2 = new Kinosaal(2);
        Reihe saal2reihe1 = new Reihe(5);
        Platz saal2reihe1platz1 = new Platz(17);
        saal2reihe1.PlatzEinfuegen(saal2reihe1platz1);
        Platz saal2reihe1platz2 = new Platz(18);
        saal2reihe1.PlatzEinfuegen(saal2reihe1platz2);
        Platz saal2reihe1platz3 = new Platz(19);
        saal2reihe1.PlatzEinfuegen(saal2reihe1platz3);
        Platz saal2reihe1platz4 = new Platz(20);
        saal2reihe1.PlatzEinfuegen(saal2reihe1platz4);
        saal2.ReiheEinfuegen(saal2reihe1);

        Reihe saal2reihe2 = new Reihe(6);
        Platz saal2reihe2platz1 = new Platz(21);
        saal2reihe2.PlatzEinfuegen(saal2reihe2platz1);
        Platz saal2reihe2platz2 = new Platz(22);
        saal2reihe2.PlatzEinfuegen(saal2reihe2platz2);
        Platz saal2reihe2platz3 = new Platz(23);
        saal2reihe2.PlatzEinfuegen(saal2reihe2platz3);
        Platz saal2reihe2platz4 = new Platz(24);
        saal2reihe2.PlatzEinfuegen(saal2reihe2platz4);
        saal2.ReiheEinfuegen(saal2reihe2);

        Reihe saal2reihe3 = new Reihe(7);
        Platz saal2reihe3platz1 = new Platz(25);
        saal2reihe3.PlatzEinfuegen(saal2reihe3platz1);
        Platz saal2reihe3platz2 = new Platz(26);
        saal2reihe3.PlatzEinfuegen(saal2reihe3platz2);
        Platz saal2reihe3platz3 = new Platz(27);
        saal2reihe3.PlatzEinfuegen(saal2reihe3platz3);
        Platz saal2reihe3platz4 = new Platz(28);
        saal2reihe3.PlatzEinfuegen(saal2reihe3platz4);
        saal2.ReiheEinfuegen(saal2reihe3);

        Reihe saal2reihe4 = new Reihe(8);
        Platz saal2reihe4platz1 = new Platz(29);
        saal2reihe4.PlatzEinfuegen(saal2reihe4platz1);
        Platz saal2reihe4platz2 = new Platz(30);
        saal2reihe4.PlatzEinfuegen(saal2reihe4platz2);
        Platz saal2reihe4platz3 = new Platz(31);
        saal2reihe4.PlatzEinfuegen(saal2reihe4platz3);
        Platz saal2reihe4platz4 = new Platz(32);
        saal2reihe4.PlatzEinfuegen(saal2reihe4platz4);
        saal2.ReiheEinfuegen(saal2reihe4);
        saele.add(saal2);

    }

    /**
     * Made by Fabian Gysel
     */
    public void checkPlaetze() {
        JFrame popUp = new JFrame();
        JLabel text = new JLabel("<html>");
        for (Kinosaal saal : saele) {
            text.setText(text.getText() + "Saal " + saal.nummer + ": <br>");
            for (Reihe reihe : saal.reihe) {
                text.setText(text.getText() + reihe.reihenNr + ": ");
                for (Platz platz : reihe.lieferePlätze()) {
                    if (platz.istPlatzFrei()) {
                        text.setText(text.getText() + "<font color='green'>[" + platz.getPlatzNRWithNull() + "]</font>");
                    } else if (platz.istPlatzReserviert()) {
                        text.setText(text.getText() + "<font color='blue'>[" + platz.getPlatzNRWithNull() + "]</font>");
                    } else if (platz.istPlatzVerkauft()) {
                        text.setText(text.getText() + "<font color='red'>[" + platz.getPlatzNRWithNull() + "]</font>");
                    } else {
                        text.setText(text.getText() + "[ERROR]");
                    }
                }
                text.setText(text.getText() + "<br>");
            }
            text.setText(text.getText() + "<br>");
        }
        text.setText(text.getText() + "<font color='green'>[??] Freier Platz</font><br>");
        text.setText(text.getText() + "<font color='blue'>[??] Reservierter Platz</font><br>");
        text.setText(text.getText() + "<font color='red'>[??] Besetzter Platz</font><br>");
        text.setText(text.getText() + "</html>");
        popUp.add(text);
        popUp.setVisible(true);
        popUp.pack();
    }

    public void filmMachen(String filmName, String datum, String zeit, Kinosaal saal) {
        Vorstellung film = new Vorstellung(filmName, datum, zeit, saal);
        filme.add(film);
    }

    public Vorstellung zeigeVorstellung(int a) {
        return filme.get(a);
    }

    /**
     * Made by Fabian Gysel
     */
    public void zeigeAlleVorstellung() {
        JFrame popUp = new JFrame();
        JLabel text = new JLabel("<html>");
        for (Vorstellung film : filme) {
            text.setText(text.getText() + "Film: ");
            text.setText(text.getText() + film.filmName + ", ");
            text.setText(text.getText() + film.datum + ", ");
            text.setText(text.getText() + film.zeit + ", ");
            text.setText(text.getText() + "Saal " + film.saal.nummer);
            text.setText(text.getText() + "<br>");
        }
        text.setText(text.getText() + "</html>");
        popUp.add(text);
        popUp.setVisible(true);
        popUp.pack();
    }

    public void machReservierung(String telefonNummer, Platz p) {
        Reservierung reservierung = new Reservierung(telefonNummer, p);
        res.add(reservierung);
    }

    public void aendereReservierung(String telefonNummer, Platz alt, Platz neu, int n) {
        alt.setPlatzToFrei();
        Reservierung neueReservierung = new Reservierung(telefonNummer, neu);
        res.set(n, neueReservierung);

    }

    public void storniereReservierung(Platz alt, int n) {
        alt.setPlatzToFrei();
        res.remove(n);

    }

    public int liefereBuchungNummer() {
        return naechsteBuchungsnummer;
    }

    public String[] getPlaetzeASarray() {
        String[] plaetze = new String[32];
        int i = 0;
        for (Kinosaal saal : saele) {
            for (Reihe reihe : saal.reihe) {
                for (Platz platz : reihe.lieferePlätze()) {

                    int saalNummer = Integer.parseInt(saal.getNummer());
                    int reiheNummer = reihe.reihenNr;
                    int platzNummer = platz.platzNr;
                    
                    if (saalNummer == 2) {
                        reiheNummer = reiheNummer - 4;
                        platzNummer = platzNummer - 16;
                    }
                    if (reiheNummer == 2) {
                        platzNummer = platzNummer - 4;
                    } else if (reiheNummer == 3) {
                        platzNummer = platzNummer - 8;
                    } else if (reiheNummer == 4) {
                        platzNummer = platzNummer - 12;
                    }
                    if(platz.istPlatzFrei()) {
                        plaetze[i] = "<html>-"+platz.platzNr+"-<font color='green'>Saal " + saalNummer + "  |   Reihe " + reiheNummer + "  |   Platz " + platzNummer + "</font></html>";
                    } else if(platz.istPlatzReserviert()) {
                        plaetze[i] = "<html>-"+platz.platzNr+"-<font color='blue'>Saal " + saalNummer + "  |   Reihe " + reiheNummer + "  |   Platz " + platzNummer + "</font></html>";
                    } else if(platz.istPlatzVerkauft()) {
                        plaetze[i] = "<html>-"+platz.platzNr+"-<font color='red'>Saal " + saalNummer + "  |   Reihe " + reiheNummer + "  |   Platz " + platzNummer + "</font></html>";
                    }
                    i++;
                }
            }
        }
        return plaetze;
    }

    public void kaufPlatz(Platz platz) {
        if (!platz.istPlatzVerkauft()) {
            platz.setPlatzToVerkauft();
        } else {
            JFrame popUp = new JFrame();
            JLabel text = new JLabel("Platz ist nicht verfügbar");
            popUp.add(text);
            popUp.setVisible(true);
            popUp.pack();
        }

    }

    public String[] getReservierungenASarray() {
        String[] reservierungen = new String[32];
        int i = 0;
        for (Reservierung reservierung : res) {

            reservierungen[i] = "Reservierung " + reservierung.telefonNummer;
            i++;
        }
        return reservierungen;
    }

}
