package TempForTesting;

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("IntegerZahl eingen");
        int zahl = sc.nextInt();
        int erg = 1;
        for (int i = 2; i <= zahl; i++) {
            erg *= i;
        }
        System.out.println("Die Fakultät von " + zahl + " ist " + erg);
    }
}
