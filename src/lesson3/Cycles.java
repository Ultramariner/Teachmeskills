package lesson3;

import java.util.Scanner;

public class Cycles {

    public static void main(String[] args) {

        System.out.println("Task 1");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int result = 0;
        if (number > 0) {
            int cursor = 1;
            while (cursor <= number) {
                result += cursor;
                cursor++;
            }
            System.out.println("Sum is " + result);
        }

        System.out.println("Task 4");
        int counterplus = 7;
        while (counterplus < 99) {
            System.out.println(counterplus);
            counterplus += 7;
        }

        System.out.println("Task 5");
        int counterminus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(counterminus);
            counterminus -= 5;
        }

        System.out.println("Task 6");
        for (int i = 10; i <= 20; i++) {
            System.out.println((int)Math.pow(i, 2));
        }

    }

}
