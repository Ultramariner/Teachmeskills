package lesson7.task1.impl;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getSquare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
