package Grundlagen.Aufgaben.Solutions;

import Grundlagen.Array.TwoDim.Printer;

public class Blatt_003 {
    public static void main(String[] args) {

        Printer.print2dArray(erzeugeFeldEinfach(7));
    }

    private static char[][] erzeugeFeldEinfach(int size) {
        char[][] array = new char[size][size];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '0';
                if (counter > 1 && counter <= 3) {
                    array[i][j] = '1';
                }
            }
            counter++;
        }
        return array;
    }


    public static int[][] fuelleMatrix(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j - i;
            }
        }
        return array;
    }

    public static char[][] fuelleArrayMitA(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    array[i][j] = 'A';
                } else if (j % 2 == 0 && i % 2 != 0) {
                    array[i][j] = 'A';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

    public static char[][] fuelleArrayMitBAndC(int size) {
        char[][] array = new char[size][size];
        int middle = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= middle && j <= middle && i + j == middle) {
                    array[i][j] = 'B';
                } else if (i >= middle && j >= middle && i + j == array.length + (middle - 1)) {
                    array[i][j] = 'B';
                } else if (i < middle && j > middle && j - i == middle) {
                    array[i][j] = 'C';
                }
                else if (i > middle && j < middle && i - j == middle) {
                    array[i][j] = 'C';
                }
                else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

    private static char[][] erzeugeFeldOAndU(int size) {
        char[][] array = new char[size][size];
        ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < array.length / 2) {
                    array[i][j] = 'O';
                }
                if (i == array.length / 2) {
                    array[i][j] = '=';
                }
                if (i > array.length / 2) {
                    array[i][j] = 'U';
                }
            }

        }
        return array;
    }

    private static char[][] erzeugeFeldOAndUAndATOP(int size) {
        char[][] array = new char[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < array.length / 2) {
                    array[i][j] = 'O';
                }
                if (i < array.length / 2 && j < array.length - i - 1 && j > i) {
                    array[i][j] = 'A';
                }

                if (i == array.length / 2) {
                    array[i][j] = '=';
                }
                if (i > array.length / 2) {
                    array[i][j] = 'U';
                }
            }

        }
        return array;
    }
}
