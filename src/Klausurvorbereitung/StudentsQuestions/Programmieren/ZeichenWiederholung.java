package Klausurvorbereitung.StudentsQuestions.Programmieren;

public class ZeichenWiederholung {

    public static void main(String[] args) {
        System.out.println(wiederhole("abc", 3));
        System.out.println(berechnePräfix("abcd", 2));
        System.out.println(istwiederholt("abcabc")); // true
        System.out.println(istwiederholt("abcdbc")); // flase
    }

    private static String wiederhole(String w, int n) {
        String erg = "";
        for (int i = 0; i < n; i++) {
            erg += w;
        }
        return erg;
    }

    private static String berechnePräfix(String w, int i) {
        String erg = "";
        for (int a = 0; a < i; a++) {
            erg += w.charAt(a);
        }
        return erg;
    }

    private static boolean istwiederholt(String w) {
        for (int i = 0; i < w.length() / 2; i++) {
            if (w.charAt(i) != w.charAt(i + w.length() / 2)) {
                return false;
            }
        }
        return true;
    }
}
