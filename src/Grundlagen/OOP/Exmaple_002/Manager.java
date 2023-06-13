package Grundlagen.OOP.Exmaple_002;

public class Manager extends Mitarbeiter{
    private double festgehalt, provision, umsatz;
    public Manager(String name,
                   double festgehalt,
                   double provision,
                   Abteilung abt) {
        super(name, abt);
        this.festgehalt = festgehalt ;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public double berechneGehalt() {
        return 0;
    }
}
