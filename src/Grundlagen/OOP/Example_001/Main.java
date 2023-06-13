package Grundlagen.OOP.Example_001;


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("My Triangle ", "Green", 5);
        Square square = new Square("Sqaure", "Yellow", 3);
        Rectangle rectangle = new Rectangle("Rectangle", "Red", 2, 4);
        Circle circle = new Circle("Circle", "Blue", 3.2f);
        FlächePrinter.printFläche(triangle);
        FlächePrinter.printFläche(square);
        FlächePrinter.printFläche(rectangle);
        FlächePrinter.printFläche(circle);
    }
}
