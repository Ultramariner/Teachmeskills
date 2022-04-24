package lesson7.task1;

import lesson7.task1.impl.Figure;

public class Triangle extends Figure {

    private double side;        //взял равносторонний чтобы упростить расчёты и наследование прямоугольника было заметнее

    public Triangle(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public double getSquare() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
