package Grundlagen.Aufgaben.Solutions.Blatt_000;

import java.util.Random;
import java.util.Scanner;

public class Blatt_000 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // zahlenVon1Bis10();
        doFakultät();
        //prime();
        fibo();
        // erratenVon1Bis100();
        // summeGeradeZahlen();
        // listeVonZahlen();
        // vokalen();
        //ggt();
        //umkehren();


    }

    public static void zahlenVon1Bis10() {
        System.out.println("Zahlen von 1 bis 10 mithilfe einer for-Schleife: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }

    public static int fakultät(int n) {
        int fak = 1;
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        return fak;
    }

    public static void doFakultät(){
        System.out.println("\n\nFakultät einer eingegebenen Zahl: ");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int n = scanner.nextInt();
        int fak = fakultät(n);
        System.out.println("Fakultät von " + n + " = " + fak);
    }

    //TODO --> function
    public static void prime() {
        System.out.println("\nPrimzahl ist oder nicht:");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int m = scanner.nextInt();
        int anzahlTeiler = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                anzahlTeiler++;
            }
        }
        if (anzahlTeiler == 2) {
            System.out.println(m + " ist eine Primzahl");
        } else {
            System.out.println(m + " ist keine Primzahl");
        }
    }

    //TODO --> parameter
    public static void fibo() {
        System.out.println("\nFibo until bound");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int bound = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 0; i < bound - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void erratenVon1Bis100() {

        System.out.println("\n\nNummer Erraten");
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int counter = 0;
        do {
            counter++;
            System.out.print("Geben Sie eine Zahl zwischen 1 und 100 ein: ");
            userGuess = scanner.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Zu hoch!");
            } else if (userGuess < numberToGuess) {
                System.out.println("Zu niedrig!");
            } else {
                System.out.println("Richtig! Die Zahl war " + userGuess + " die wurde nach " + counter + " Versuche gefunden!");
            }
        } while (userGuess != numberToGuess);
    }

    //TODO --> function & parameter
    public static void summeGeradeZahlen() {
        System.out.println("\n\nSumme gerade Zahlen in einem Bereich");
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int start = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int end = scanner.nextInt();
        int summe = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                summe += i;
                if (i == end) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " + ");
                }
            }
        }
        System.out.println("\nSummer gerade Zahlen zwischen " + start + " und " + end + " = " + summe);
    }

    public static void listeVonZahlen() {

        System.out.println("\n\nListe von Zahlen:");
        System.out.print("Bitte geben Sie die Anzahl von Zahlen ein: ");
        int anzahlNummern = scanner.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= anzahlNummern; i++) {
            System.out.print("Bitte geben Sie Zahl " + i + " ein: ");
            int nr = scanner.nextInt();
            if (nr > 0) {
                positiveCount++;
            } else if (nr < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Anzahl der positiven Zahlen: " + positiveCount);
        System.out.println("Anzahl der negative Zahlen: " + negativeCount);
        System.out.println("Anzahl der null Zahlen: " + zeroCount);
    }

    //TODO --> parameter
    public static void vokalen() {

        System.out.println("\n\nVokalen");
        System.out.print("Bitte geben Sie ein Text ein: ");
        String text = scanner.next();
        int vocalCounter = 0;
        int constantCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'i' || text.charAt(i) == 'ö' || text.charAt(i) == 'U' || text.charAt(i) == 'I' || text.charAt(i) == 'Ö' || text.charAt(i) == 'ü' || text.charAt(i) == 'ä' || text.charAt(i) == 'Ü' || text.charAt(i) == 'Ä') {
                vocalCounter++;
            } else {
                constantCounter++;
            }
        }
        System.out.println("Anzahl der Vokalen: " + vocalCounter);
        System.out.println("Anzahl der Konstanten: " + constantCounter);


    }

    //TODO --> function
    public static void ggt() {
        System.out.println("\n\nGGT");
        System.out.print("Bitte geben die erste Zahl ein: ");
        int nr1 = scanner.nextInt();
        System.out.print("Bitte geben die zweite Zahl ein: ");
        int nr2 = scanner.nextInt();
        int ggt = 1;
        for (int i = 1; i <= nr1 && i <= nr2; i++) {
            if (nr1 % i == 0 && nr2 % i == 0) {
                ggt = i;
            }
        }
        System.out.println("GGT von " + nr1 + " und " + nr2 + " ist " + ggt);
    }

    //TODO --> function
    public static void umkehren() {

        System.out.println("\n\nUmkehren von String Zahl");
        System.out.print("Bitte geben eine Zahl ein: ");
        String number = scanner.next();
        System.out.println("Forward: " + number);
        System.out.print("Backward: ");
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }

        System.out.println("\n\nUmkehren von int Zahl");
        System.out.print("Bitte geben eine Zahl ein: ");
        int number1 = scanner.nextInt();
        System.out.println("Forward:  " + number1);
        int reservedNumber = 0;
        while (number1 != 0) {
            reservedNumber = reservedNumber * 10 + number1 % 10;
            number1 = number1 / 10;
        }
        System.out.println("Backward: " + reservedNumber);
    }

}
