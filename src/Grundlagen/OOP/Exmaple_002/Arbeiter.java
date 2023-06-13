package Grundlagen.OOP.Exmaple_002;

public class Arbeiter extends Mitarbeiter {
    private double stundenLohn, anzahlStunden,
    überstundenzuschlag, anzahlÜberstunden;
    public Arbeiter(String name,
                    double stundenLohn,
                    double anzahlStunden,
                    double überstundenzuschlag,
                    Abteilung abt) {
        super(name, abt);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
        this.überstundenzuschlag = überstundenzuschlag;
    }


    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }


    @Override
    public double berechneGehalt() {
        return 0;
    }
}
