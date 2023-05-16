package Grundlagen.Array.TwoDim;

public class DrawTester {
    public static void main(String[] args) {
        char[][] arrayX = Draw.drawX(9);
        Printer.print2dArray(arrayX);

        System.out.println("\n");
        char[][] arrayPlus = Draw.drawPlus(9);
        Printer.print2dArray(arrayPlus);

        System.out.println("\n");
        char[][] arrayXPlus = Draw.drawXPlus(9);
        Printer.print2dArray(arrayXPlus);

        System.out.println("\n");
        char[][] arrayXAndOneToFour = Draw.drawXAndOneToFour(9);
        Printer.print2dArray(arrayXAndOneToFour);

    }
}
