package Grundlagen.OOP.Example_003;

public class Telefon {
    private int id;
    private String rufnummer;

    public Telefon(int id, String rufnummer) {
        this.id = id;
        this.rufnummer = rufnummer;
    }

    public int getId() {
        return id;
    }

    public String getRufnummer() {
        return rufnummer;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Rufnummer: " + rufnummer;
    }



}

