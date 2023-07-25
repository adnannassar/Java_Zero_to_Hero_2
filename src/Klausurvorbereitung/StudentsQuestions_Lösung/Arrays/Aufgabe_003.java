package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_003 {
    public static void main(String[] args) {
        int[] feld = {3, 2, 1, 4};
        char[][] erg = diagramm(feld);
        for (int i = 0; i < erg.length; i++) {
            for (int j = 0; j < erg[i].length; j++) {
                System.out.print(erg[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] diagramm(int[] feld) {
        int max = 0;
        for (int value : feld) {
            if (value > max) {
                max = value;
            }
        }

        char[][] diagramm = new char[feld.length][max];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < max; j++) {
                if (j < feld[i]) {
                    diagramm[i][j] = '*';
                } else {
                    diagramm[i][j] = '-';
                }
            }
        }
        return diagramm;
    }

}
