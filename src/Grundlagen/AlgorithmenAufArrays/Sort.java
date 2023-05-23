package Grundlagen.AlgorithmenAufArrays;

import Grundlagen.Array.OneDim.Printer;

public class Sort {
    public static void main(String[] args) {
        int[] array = {10, 30, 1, 5, 2, 7};
        System.out.print("Before: ");
        Printer.print(array);
        bubbleSort(array);
        System.out.print("After:  ");
        Printer.print(array);

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SwapClass.swap(array, j, j + 1);
                }
            }
        }
    }

}
