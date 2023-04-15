package TempForTesting;

import java.util.Scanner;
import java.util.Random;

public class FuenfteAufgabe {
    public static void main(String[] args) {
        Random random = new Random();
        int zufallZ = random.nextInt(100);
        Scanner sc = new Scanner(System.in);

        boolean erraten = true;
        while (erraten) {
            System.out.println("Eingabe Zahl zwischen 1 und 100");
            int eingabe = sc.nextInt();

            if (eingabe < zufallZ) {
                System.out.println("Zahl ist zuniedrig");
            } else {
                System.out.println("Zahl ist zu Hoch");
            }
            if (eingabe == zufallZ) {
                System.out.println("Bingo!");
                break;
            }

        }
    }
}
