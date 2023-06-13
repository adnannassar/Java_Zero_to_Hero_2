package Grundlagen.OOP.Exmaple_002;

public class Abteilung {
    private String bezeichnung;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnzahlMitarbeiter() {
        return 0;
    }

    public void addMitarbeiter() {

    }

    public Mitarbeiter getMitarbeiter() {
        return null;
    }

    public double berechneGehaltskosten() {
        return 0.0;
    }
}
