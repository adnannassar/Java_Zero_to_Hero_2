package Grundlagen.OOP.Example_001;

public class Circle extends Form {
    private float radius;

    public Circle(String name, String color, float radius) {
        super(name, color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFläche() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
}
