package Grundlagen.Aufgaben.Solutions.Blatt_003;

import Grundlagen.Array.TwoDim.Printer;

public class PascalTriangle {

    public static void createPascal(int size) {
        int[][] triangle = new int[size][];
        for (int i = 0; i < size; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
       Printer.print2dArray(triangle);
    }

    public static void main(String[] args) {
        createPascal(5);
    }
}
