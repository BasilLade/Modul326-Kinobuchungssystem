package modul326.kinobuchungssystem;

public class Main {

    public static void main(String[] args) {
        Kinobuchungssystem system = new Kinobuchungssystem();

        gui gui = new gui(system);
        //gui.setSize(552, 219);
        gui.setVisible(true);
    }

}
