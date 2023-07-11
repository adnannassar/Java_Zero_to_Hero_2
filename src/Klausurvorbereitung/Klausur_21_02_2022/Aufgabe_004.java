package Klausurvorbereitung.Klausur_21_02_2022;

public class Aufgabe_004 {

}

class Gebäude {
    private Putzplan putzplan;
    private Fenster[] fensters = new Fenster[100];

    public Gebäude(Putzplan putzplan) {
        this.putzplan = putzplan;
    }

    public Putzplan getPutzplan() {
        return putzplan;
    }

    public void setPutzplan(Putzplan putzplan) {
        this.putzplan = putzplan;
    }

    public Fenster[] getFensters() {
        return fensters;
    }

    public void setFensters(Fenster[] fensters) {
        this.fensters = fensters;
    }

    public boolean allFensterGeputzt() {
        for (int i = 0; i < fensters.length; i++) {
            if (!this.fensters[i].equals(this.putzplan.getEintrag(i))) {
                return false;
            }
        }
        return true;
    }
}

class Fenster {
    private int fläche;

    public Fenster(int fläche) {
        this.fläche = fläche;
    }

    public int getFläche() {
        return fläche;
    }

    public void setFläche(int fläche) {
        this.fläche = fläche;
    }
}

class Putzplan {
    private Eintrag[] einträge = new Eintrag[100];


    public void setEinträge(Eintrag[] einträge) {
        this.einträge = einträge;
    }

    public Eintrag getEintrag(int i) {
        if (i >= 0 && i < einträge.length) {
            return einträge[i];
        }
        return null;
    }
}

abstract class Eintrag {
    private String name, firma;

    public Eintrag(String name, String firma) {
        this.name = name;
        this.firma = firma;
    }

    public abstract int getKosten();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}

class Bodenreinigung extends Eintrag {
    public Bodenreinigung(String name, String firma) {
        super(name, firma);
    }

    @Override
    public int getKosten() {
        return 1570;
    }
}

class FensterReinigung extends Eintrag {
    private int kostenProQuadratMeter;
    private Fenster[] fensters = new Fenster[100];

    public FensterReinigung(String name, String firma, int kostenProQuadratMeter) {
        super(name, firma);
        this.kostenProQuadratMeter = kostenProQuadratMeter;
    }

    public int getKostenProQuadratMeter() {
        return kostenProQuadratMeter;
    }

    public void setKostenProQuadratMeter(int kostenProQuadratMeter) {
        this.kostenProQuadratMeter = kostenProQuadratMeter;
    }

    public Fenster[] getFensters() {
        return fensters;
    }

    public void setFensters(Fenster[] fensters) {
        this.fensters = fensters;
    }

    @Override
    public int getKosten() {
        int cost = 0;
        int gesamtFläche = 0;
        for (int i = 0; i < fensters.length; i++) {
            gesamtFläche += fensters[i].getFläche();
        }
        return kostenProQuadratMeter * gesamtFläche;
    }
}

