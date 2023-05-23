package Grundlagen.AlgorithmenAufArrays;

public class SwapClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int temp = x;
        x = y; // x = 20
        y = temp; // y = 10

        System.out.println(x); // 20
        System.out.println(y); // 10
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
