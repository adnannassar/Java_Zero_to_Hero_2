package TempForTesting;

import java.util.Scanner;
public class Vokale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe eines Wortes");
        String wort = sc.nextLine();
        int vokalcounter = 0;
        int konsonantencounter = 0;
        for(int i = 0; i< wort.length(); i++){
            char v = wort.charAt(i);
            if(v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U' ||
                    v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' ){
                vokalcounter++;

            }if((v >= 'A' && v <= 'Z') || (v >= 'a' && v <= 'z')){
                konsonantencounter++;
            }
        }
        System.out.println("Anzahl vokale = " + vokalcounter);
        System.out.println("Anzahl Konsonanten = " + konsonantencounter);
    }
}

