package Grundlagen.Controlstructure;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= -5; i--) {
            int nr1 = i;
            if (nr1 != 0) {
                int result = 100 / nr1;
                System.out.println(100 + " / (i) " + nr1 + " = " + result);
            }else{
                System.out.println(100 + " / (i) " + nr1 + " = " + "Undefined");
            }
        }
    }
}
