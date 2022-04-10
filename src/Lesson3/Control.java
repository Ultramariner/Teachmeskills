package Lesson3;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.print("Enter month number: ");
        Scanner scanner = new Scanner(System.in);
        byte month = scanner.nextByte();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is autumn");
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }

        System.out.println("Task 2");
        System.out.print("Enter month number: ");
        month = scanner.nextByte();
        if (month == 1 || month == 2 || month == 12) System.out.println("It is winter");
        else if (month == 3 || month == 4 || month == 5) System.out.println("It is spring");
        else if (month == 6 || month == 7 || month == 8) System.out.println("It is summer");
        else if (month == 9 || month == 10 || month == 11) System.out.println("It is autumn");
        else System.out.println("Incorrect number");

        System.out.println("Task 3");
        System.out.print("Enter number: ");
        int evenOdd = scanner.nextInt();
        if (evenOdd % 2 == 0) System.out.println("Your number is even");
        else System.out.println("Your number is odd");

        System.out.println("Task 4");
        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();
        if (temperature > -5) System.out.println("It is warm outside");
        else if (temperature > -20) System.out.println("It is ok outside");
        else System.out.println("It is cold outside");

        System.out.println("Task 5");
        System.out.print("Enter rainbow color number: ");
        byte rainbow = scanner.nextByte();
        switch (rainbow) {
            case 1:
                System.out.println("Color is red");
                break;
            case 2:
                System.out.println("Color is orange");
                break;
            case 3:
                System.out.println("Color is yellow");
                break;
            case 4:
                System.out.println("Color is green");
                break;
            case 5:
                System.out.println("Color is blue");
                break;
            case 6:
                System.out.println("Color is indigo");
                break;
            case 7:
                System.out.println("Color is violet");
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }

    }

}
