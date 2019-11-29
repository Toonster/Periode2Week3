package be.kdg.prog1.ootech.week3.shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
