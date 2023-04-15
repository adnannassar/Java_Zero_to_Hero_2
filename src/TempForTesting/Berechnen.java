package TempForTesting;

import java.util.Scanner;
public class Berechnen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        double zahl = sc.nextDouble();
        if (zahl % 2 == 0){
            System.out.println("Zahl ist keine Primzahl");

        }
        else {
            System.out.println("Zahl ist Primzahl");
        }
    }
}
