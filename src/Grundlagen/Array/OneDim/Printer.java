package Grundlagen.Array.OneDim;

public class Printer {
    public static void print(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
