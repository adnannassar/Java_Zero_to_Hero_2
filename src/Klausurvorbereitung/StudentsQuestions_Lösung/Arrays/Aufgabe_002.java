package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_002 {

    public static void main(String[] args) {
        int[][] feld = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] transpos = berechneTransponierte(feld);

        for (int i = 0; i < transpos.length; i++) {
            for (int j = 0; j < transpos[i].length; j++) {
                System.out.print(transpos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] berechneTransponierte(int[][] feld) {
        int rows = feld.length;
        int cols = feld[0].length;

        int[][] transpos = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpos[i][j] = feld[j][i];
            }
        }
        return transpos;
    }
}
