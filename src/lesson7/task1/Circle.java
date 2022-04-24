package lesson7.task1;

import lesson7.task1.impl.Figure;

public class Circle extends Figure {

    private double radius;
    private final double PI = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public double getSquare() {
        return Math.pow(radius, 2) * PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
