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
    public ArrayList<Kinosaal> saele = new ArrayList<Kinosaal>();

    public Kinobuchungssystem() {

        initStuff();

        filmMachen("Ted", "11.2.2012", "94:11", saele.get(0));
        filmMachen("Poltergeist der Neue ;)", "5.5.2015", "77:33", saele.get(1));

        machReservierung(1, "078 790 23 77", saele.get(0).reihe.get(0).platz.get(0));
        machReservierung(2, "078 790 23 74", saele.get(0).reihe.get(2).platz.get(3));

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

    public void checkPlaetze() {
        for (Kinosaal saal : saele) {
            System.out.println("Saal " + saal.nummer + ": ");
            for (Reihe reihe : saal.reihe) {
                System.out.print(reihe.reihenNr + ": ");
                for (Platz platz : reihe.lieferePlätze()) {
                    if (platz.istPlatzFrei()) {
                        System.out.print("[ ]");
                    } else if (platz.istPlatzReserviert()) {
                        System.out.print("[-]");
                    } else if (platz.istPlatzVerkauft()) {
                        System.out.print("[X]");
                    } else {
                        System.err.print("[ERROR]");
                    }
                }
                System.out.println("");
            }
        System.out.println("");
        }
    }

    public void filmMachen(String filmName, String datum, String zeit, Kinosaal saal) {
        Vorstellung film = new Vorstellung(filmName, datum, zeit, saal);
        filme.add(film);
    }

    public Vorstellung zeigeVorstellung(int a) {
        return filme.get(a);
    }

    public void zeigeAlleVorstellung() {
        for (Vorstellung film : filme) {
            System.out.print("Film: ");
            System.out.print(film.filmName + ", ");
            System.out.print(film.datum + ", ");
            System.out.print(film.zeit + ", ");
            System.out.print("Saal " + film.saal.nummer);
            System.out.println("");
        }
    }

    public void machReservierung(int reservierungsNr, String telefonNummer, Platz p) {
        Reservierung lel = new Reservierung(reservierungsNr, telefonNummer, p);
        res.add(lel);
    }

    public void aendereReservierung(int reservierungsNr, String telefonNummer, Platz alt, Platz neu, int n) {
        alt.freiePlatz();
        Reservierung lel = new Reservierung(reservierungsNr, telefonNummer, neu);
        res.set(n, lel);

    }

    public void storniereReservierung(Platz alt, int n) {
        alt.freiePlatz();
        res.remove(n);

    }

    public int liefereBuchungNummer() {
        return naechsteBuchungsnummer;
    }

    public void kaufPlatz(Platz p) {
        if (!p.istPlatzVerkauft()) {
            p.verkaufePlatz();
        }

    }

}
