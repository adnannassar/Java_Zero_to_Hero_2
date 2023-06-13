package Grundlagen.OOP.Exmaple_002;

public abstract class Mitarbeiter {
    private String name;
    private static int personalnummer, anzahlMitarbeiter;

    public Mitarbeiter(String name, Abteilung abt) {
        this.name = name;
    }

    public abstract double berechneGehalt();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonalnummer() {
        return personalnummer;
    }
    public Abteilung getAbteilung(){
        return null;
    }
}
