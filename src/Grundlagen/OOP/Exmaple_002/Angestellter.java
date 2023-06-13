package Grundlagen.OOP.Exmaple_002;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt, ortZuschlag, zulage;

    public Angestellter(String name,
                        double grundgehalt,
                        double ortZuschlag,
                        double zulage,
                        Abteilung abt) {
        super(name, abt);
        this.grundgehalt = grundgehalt;
        this.ortZuschlag = ortZuschlag;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return 0;
    }
}
