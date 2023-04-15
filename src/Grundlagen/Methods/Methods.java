package Grundlagen.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        calculator('+');
        int beleg = add(10, 20);
        System.out.println(beleg - 5);
    }

    public static void calculator(char operation) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NR1: ");
        int nr1 = sc.nextInt();
        System.out.print("NR2: ");
        int nr2 = sc.nextInt();
        int result = 0;
        switch (operation) {
            case '+':
                result = nr1 + nr2;
                break;
            case '-':
                result = nr1 - nr2;
                break;
            case '*':
                result = nr1 * nr2;
                break;
            case '/':
                result = nr1 / nr2;
                break;
        }
        System.out.println("Result = " + result);
        System.out.println("....................................");
    }

    public static int add(int a, int b) {
        int result = a + b;
        return a + b;
    }


}
