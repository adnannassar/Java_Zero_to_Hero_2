package Klausurvorbereitung.StudentsQuestions_Lösung.Arrays;

public class Aufgabe_006 {
    public static void main(String[] args) {
        char[][] feld = {
                { 'C', 'A', 'T', 'Z', 'T', 'C', 'O', 'G' },
                { 'C', 'T', 'A', 'T', 'C', 'A', 'A', 'A' },
                { 'W', 'R', 'R', 'Z', 'F', 'T', 'I', 'T' },
                { 'A', 'C', 'A', 'T', 'G', 'E', 'P', 'Z' },
                { 'C', 'A', 'T', 'G', 'I', 'K', 'L', 'O' }
        };

        char[] wort = { 'C', 'A', 'T' };

        System.out.println(anzahlwort(feld, wort)); // Output: 3
    }

    public static boolean wortAnStelle(char[][] feld, char[] wort, int z, int s) {
        // Prüfen, ob das Wort in der Matrix passt
        if (s + wort.length > feld[z].length) {
            return false;
        }

        // Überprüfen, ob die Zeichen in der Matrix
        // mit den Zeichen im Wort übereinstimmen
        for (int i = 0; i < wort.length; i++) {
            if (feld[z][s + i] != wort[i]) {
                return false;
            }
        }
        return true;
    }

    public static int anzahlwort(char[][] feld, char[] wort) {
        int count = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (wortAnStelle(feld, wort, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

}
