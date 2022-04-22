package lesson7.task1;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        String[] array = new String[5];
        fillArray(array);
        Figure figure1;
        initFigure(figure1, array, 0);
    }


    public static void fillArray(String[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d figure", i);
/*            switch (scanner.nextLine()) {
                case
            }*/
        }
    }

    public static void initFigure(Figure figure, String array, byte i) {
/*        switch (array[i]) {
            case Triangle:
                break;
            case Rectangle:
                break;
            case Circle:
                break;
            default:
                break;
        }*/
    }
}
