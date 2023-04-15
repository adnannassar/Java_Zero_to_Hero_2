package TempForTesting;

import java.util.Scanner;
public class SechsteAufgabe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int zahl = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= zahl; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Die Summer aller geraden Zahlen ist: " + sum);
    }

}
