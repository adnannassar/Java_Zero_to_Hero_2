package Grundlagen.Operators;

public class Operators {
    public static void main(String[] args) {
        // = + - * / % > < >= <= == != ++ -- += -= *= /* %= && ||
        int x = 10;
        int y = 3;
        int result = ++x + y++;
        System.out.println("Result of Add = " + result);
        result = x + y;
        System.out.println("Result of Add = " + result);

        boolean isCorrect =  (x == 11) && (x > y);
        boolean isCorrect2 = (x == 11) || (y > x);
        System.out.println(isCorrect);
        System.out.println(isCorrect2);
    }
}
