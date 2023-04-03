package Grundlagen.Controlstructure.Conditional;

public class If {

    public static void main(String[] args) {
        int x = 10;
        if (x > 2) {
            System.out.println("Ja");
        }
        System.out.println(".................");

        int y = 10;
        if (y > 20) {
            System.out.println("Ja");
        } else {
            System.out.println("Nein");
        }
        System.out.println(".................");

        int z = -100;
        if (z > 0) {
            System.out.println("Positive");
        } else if (z == 0) {
            System.out.println(" = 0 ");
        } else {
            System.out.println("Negative");
        }
        System.out.println(".................");
    }
}
