package Grundlagen.OOP.Assosation;

public class Kunde {
    private String firmenname;
    private String firmenadresse;
    private int auftragssumme;

    private Auftrag[] auftrags = new Auftrag[5];

    public void ändern(String name, String adresse) {
        this.firmenname = name;
        this.firmenadresse = adresse;
    }

    public void addAuftrag(Auftrag auftrag, int index) {
        auftrags[index] = auftrag;
    }

    public Auftrag getAuftrag(int index) {
        if (auftrags[index] != null) {
            return auftrags[index];
        } else {
            return new Auftrag("0.0.0");
        }
    }

    public String getFirmenname() {
        return firmenname;
    }


    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getFirmenadresse() {
        return firmenadresse;
    }

    public void setFirmenadresse(String firmenadresse) {
        this.firmenadresse = firmenadresse;
    }

    public int getAuftragssumme() {
        return auftragssumme;
    }

    public void setAuftragssumme(int auftragssumme) {
        this.auftragssumme = auftragssumme;
    }
}
