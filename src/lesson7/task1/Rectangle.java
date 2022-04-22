package lesson7.task1;

public class Rectangle extends Triangle{

    private double side2;

    public Rectangle(String name, double side1, double side2) {
        super(name, side1);
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return (super.getSide() + side2) * 2;
    }

    @Override
    public double getSquare() {
        return super.getSide() * side2;
    }
}
