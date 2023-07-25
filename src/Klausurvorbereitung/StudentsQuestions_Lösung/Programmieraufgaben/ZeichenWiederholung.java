package Klausurvorbereitung.StudentsQuestions_Lösung.Programmieraufgaben;

public class ZeichenWiederholung {

    public static void main(String[] args) {
        System.out.println(wiederhole("abc", 3));  // Output: abcabcabc
        System.out.println(berechnePräfix("abac", 2));  // Output: ab
        System.out.println(istWiederholt("abab"));  // Output: true
        System.out.println(istMehrfachWiederholt("ababab"));  // Output: true
    }

    // Methode 1
    public static String wiederhole(String w, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(w);
        }
        return sb.toString();
    }

    // Methode 2
    public static String berechnePräfix(String w, int i) {
        if (i <= w.length()) {
            return w.substring(0, i);
        } else {
            return w;
        }
    }

    // Methode 3
    public static boolean istWiederholt(String w) {
        int len = w.length();
        if (len % 2 != 0) {
            return false;
        } else {
            String firstHalf = w.substring(0, len / 2);
            String secondHalf = w.substring(len / 2);
            return firstHalf.equals(secondHalf);
        }
    }

    // Methode 4
    public static boolean istMehrfachWiederholt(String w) {
        int len = w.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                String pattern = w.substring(0, i);
                boolean valid = true;
                for (int j = i; j < len; j += i) {
                    if (!w.substring(j, j + i).equals(pattern)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) return true;
            }
        }
        return false;
    }
}
