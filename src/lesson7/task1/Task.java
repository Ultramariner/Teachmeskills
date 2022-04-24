package lesson7.task1;

import lesson7.task1.impl.Figure;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Figure[] array = new Figure[5];
        fillArray(array);
        calculatePerimeter(array);
        calculateSquare(array);
    }


    public static void fillArray(Figure[] array) {

        Scanner scanner = new Scanner(System.in);        //не могу закрыть сканер вместе с потоком, как обходить такое?
        double side1, side2;
        String name;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d figure:%n", i + 1);
            name = scanner.nextLine();
            switch (name) {
                case "Triangle":
                    System.out.println("Enter triangle side:");
                    side1 = scanner.nextDouble();
                    scanner.nextLine();                //чтобы корректно отрабатывало считываение следующего имени, без этого сразу считывается пустая строка
                    array[i] = new Triangle(name, side1);
                    break;
                case "Rectangle":
                    System.out.println("Enter rectangle side 1:");
                    side1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter rectangle side 2:");
                    side2 = scanner.nextDouble();
                    scanner.nextLine();
                    array[i] = new Rectangle(name, side1, side2);
                    break;
                case "Circle":
                    System.out.println("Enter circle radius:");
                    side1 = scanner.nextDouble();
                    scanner.nextLine();
                    array[i] = new Circle(name, side1);
                    break;
                default:
                    System.out.println("Invalid figure");
                    i--;
                    break;
            }
        }
    }

    public static void calculatePerimeter(Figure[] array) {

        double sum = 0;
        for (Figure i : array) {
            sum += i.getPerimeter();
        }
        System.out.println("Total sum of perimeters is " + sum);
    }

    public static void calculateSquare(Figure[] array) {

        double sum = 0;
        for (Figure i : array) {
            sum += i.getSquare();
        }
        System.out.println("Total sum of areas is " + sum);
    }
}
