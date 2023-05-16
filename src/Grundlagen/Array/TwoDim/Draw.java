package Grundlagen.Array.TwoDim;

public class Draw {
    public static char[][] drawX(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

    public static char[][] drawPlus(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length / 2 || i == array.length / 2) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

    public static char[][] drawXPlus(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length / 2 || i == array.length / 2 || i == j || i + j == array.length - 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

    public static char[][] drawXAndOneToFour(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i < array.length / 2 && j > i && j < array.length - 1 - i) {
                    array[i][j] = '1';
                } else if (i > array.length / 2 && j < i && j > array.length - 1 - i) {
                    array[i][j] = '3';
                } else if (j < array.length / 2 && i > j && i < array.length - 1 - j) {
                    array[i][j] = '4';
                } else {
                    array[i][j] = '#';
                }
            }
        }
        return array;
    }
}
