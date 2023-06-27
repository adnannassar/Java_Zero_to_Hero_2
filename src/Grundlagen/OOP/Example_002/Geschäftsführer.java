package Grundlagen.OOP.Example_002;

public class Geschäftsführer extends Manager {
    /*
    * zulage = 5000€
    * */

    private double zulage;

    public Geschäftsführer(String name, double festgehalt, double provision, double zulage, Abteilung abt) {
        super(name, festgehalt, provision, abt);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt(){
        return super.berechneGehalt() + zulage;
    }
}
