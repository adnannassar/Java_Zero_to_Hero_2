package Grundlagen.OOP.Assosation;

public class Auftrag {
    private int nummer, anzahlStunden = 1, stundensatz = 180;
    private String art, auftragsdatum;

    public Auftrag(String datum){
        this.auftragsdatum = datum;
    }

    public void setAnzahlStunden(int anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    public void setStundensatz(int stundensatz) {
        this.stundensatz = stundensatz;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getNummer() {
        return nummer;
    }

    public int getAnzahlStunden() {
        return anzahlStunden;
    }

    public int getStundensatz() {
        return stundensatz;
    }

    public String getArt() {
        return art;
    }

    public String getAuftragsdatum() {
        return auftragsdatum;
    }
}
