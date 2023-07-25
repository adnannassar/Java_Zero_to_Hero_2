package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_004 {
    public static void main(String[] args) {
        char[][] result = treppe(5);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static char[][] treppe(int n) {
        int rows = n;
        int cols = 2 * n - 1;

        char[][] arr = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < i || j >= i + n) {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = '*';
                }
            }
        }
        return arr;
    }


}
