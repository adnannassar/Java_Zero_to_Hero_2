package Grundlagen.OOP.Exmaple_002;

public class Angestellter extends Mitarbeiter {

    /*
     * grundgehalt = 4000€
     * ortZuschlag = 500€ if berlin
     * überstundenzuschlag = 300€ if hamburg
     * ortZuschlag = 600€ if münchen
     * zulage = 150€
     * */
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
        return grundgehalt + ortZuschlag + zulage;
    }
}
