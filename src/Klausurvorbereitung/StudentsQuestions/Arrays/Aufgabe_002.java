package Klausurvorbereitung.StudentsQuestions.Arrays;

public class Aufgabe_002 {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        print(transpose(array));

    }


    private static int[][] transpose(int[][] feld) {
        int spalte = feld[0].length;
        int zeile = feld.length;
        int[][] erg = new int[spalte][zeile];

        for (int i = 0; i < spalte; i++) {
            for (int j = 0; j < zeile; j++) {
                erg[i][j] = feld[j][i];
            }
        }
        return erg;
    }


    private static void print(int[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }

}
