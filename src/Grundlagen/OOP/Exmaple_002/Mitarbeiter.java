package Grundlagen.OOP.Exmaple_002;

public abstract class Mitarbeiter {
    private String name;
    private int personalnummer;
    private static int anzahlMitarbeiter;
    private Abteilung abt;

    public Mitarbeiter(String name, Abteilung abt) {
        this.name = name;
        this.abt = abt;
        anzahlMitarbeiter++;
        personalnummer = anzahlMitarbeiter;
    }

    public abstract double berechneGehalt();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public Abteilung getAbteilung() {
        return this.abt;
    }
}
