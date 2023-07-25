package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_005 {
    public static void main(String[] args) {
        int[][] feld = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(testeQuadrate(feld, 15));  // Output: false
        System.out.println(testeQuadrate(feld, 14));  // Output: true
    }

    public static boolean testeQuadrate(int[][] feld, int s) {
        for (int i = 0; i < feld.length - 1; i++) {
            for (int j = 0; j < feld[i].length - 1; j++) {
                int sum = feld[i][j] + feld[i][j + 1] + feld[i + 1][j] + feld[i + 1][j + 1];
                if (sum == s) {
                    return true;
                }
            }
        }
        return false;
    }

}
