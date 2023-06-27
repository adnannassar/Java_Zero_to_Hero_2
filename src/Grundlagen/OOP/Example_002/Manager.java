package Grundlagen.OOP.Example_002;

public class Manager extends Mitarbeiter {
    private double festgehalt, provision, umsatz;
    /*
        festgehalt = 6500€
        provision = 500€
        umsatz = 3000€
     * */

    public Manager(String name,
                   double festgehalt,
                   double provision,
                   Abteilung abt) {
        super(name, abt);
        this.festgehalt = festgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public double berechneGehalt() {
        return festgehalt + provision + umsatz;
    }
}
