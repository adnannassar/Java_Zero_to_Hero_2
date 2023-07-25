package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_001 {

    public static void main(String[] args) {
        int[][] feld = {
                {0, 1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29}
        };

        int[][] teilfeld = getTeilfeld(feld, 1, 3, 3, 2);
        if (teilfeld != null) {
            for (int i = 0; i < teilfeld.length; i++) {
                for (int j = 0; j < teilfeld[i].length; j++) {
                    System.out.print(teilfeld[i][j] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Ergibt ein Teilfeld die Summe 42? " + (teilErgibt42(feld) ? "Ja" : "Nein"));



    }

    public static int summe(int[][] feld) {
        int sum = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                sum += feld[i][j];
            }
        }
        return sum;
    }
    public static int[][] getTeilfeld(int[][] feld, int i, int j, int z, int s) {
        // Prüfen, ob Teilfeld in Arraygrenzen passt
        if (i + z > feld.length || j + s > feld[0].length) {
            return null;
        }
        // Teilfeld erzeugen
        int[][] teilfeld = new int[z][s];
        for (int a = 0; a < z; a++) {
            for (int b = 0; b < s; b++) {
                teilfeld[a][b] = feld[i + a][j + b];
            }
        }
        return teilfeld;
    }


    public static boolean teilErgibt42(int[][] feld) {
        // Durchgehen des Arrays und Teile erstellen, die in Feldgrenzen passen
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[0].length; j++) {
                for (int z = 1; i + z <= feld.length; z++) {
                    for (int s = 1; j + s <= feld[0].length; s++) {
                        int[][] teilfeld = getTeilfeld(feld, i, j, z, s);
                        if (teilfeld != null && summe(teilfeld) == 42) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}

