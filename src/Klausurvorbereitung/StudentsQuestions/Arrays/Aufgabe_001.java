package Klausurvorbereitung.StudentsQuestions.Arrays;

public class Aufgabe_001 {
    public static void main(String[] args) {
        int array[][] = {{0, 1, 2, 3, 4, 5}, {6, 7, 8, 9, 10, 11}, {12, 13, 14, 15, 16, 17}, {18, 19, 20, 21, 22, 23}, {24, 25, 26, 27, 28, 29},};

        int[][] erg = getTeilfeld(array, 1, 3, 3, 2);
        if (erg != null) {
            print(erg);
        }

        System.out.println();
        System.out.println(teilErgibt(array, 42));
    }

    private static int summe(int[][] feld) {
        int summ = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                summ += feld[i][j];
            }
        }
        return summ;
    }

    private static int[][] getTeilfeld(int[][] feld, int i, int j, int z, int s) {
        if (i + z > feld.length || j + s > feld[0].length) {
            return null;
        }
        int[][] erg = new int[z][s];
        for (int a = 0; a < z; a++) {
            for (int b = 0; b < s; b++) {
                erg[a][b] = feld[i + a][j + b];
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

    private static boolean teilErgibt(int[][] feld, int n) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                for (int z = 1; i + z <= feld.length; z++) {
                    for (int s = 1; j + s <= feld[0].length; s++) {
                        int[][] zwischenErg = getTeilfeld(feld, i, j, z, s);
                        if (zwischenErg != null && summe(zwischenErg) == n) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
