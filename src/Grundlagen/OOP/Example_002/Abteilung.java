package Grundlagen.OOP.Example_002;

public class Abteilung {
    private String bezeichnung;
    private Mitarbeiter[] mitarbeiters;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.mitarbeiters = new Mitarbeiter[15];
    }


    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        for (int i = 0; i < mitarbeiters.length; i++) {
            if (mitarbeiters[i] == null) {
                mitarbeiters[i] = mitarbeiter;
                break;
            }
        }
    }

    public Mitarbeiter getMitarbeiter(int i) {
        return this.mitarbeiters[i];
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnzahlMitarbeiter() {
        int anzahlCounter = 0;
        for (int i = 0; i < mitarbeiters.length; i++) {
            if (mitarbeiters[i] != null) {
                anzahlCounter++;
            }
        }
        return anzahlCounter;
    }


    public double berechneGehaltskosten() {
        double summe = 0.0;
        for (int i = 0; i < mitarbeiters.length; i++) {
            if(mitarbeiters[i] != null){
                summe += mitarbeiters[i].berechneGehalt();
            }

        }
        return summe;
    }
}
