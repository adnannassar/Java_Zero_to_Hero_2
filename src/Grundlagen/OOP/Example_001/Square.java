package Grundlagen.OOP.Example_001;

public class Square extends Form {
    private int length;

    public Square(String name, String color, int length) {
        super(name, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double berechneFläche() {
        return length * length;
    }
}
