package Lesson3;

import java.util.Scanner;

public class Extra {

    public static void main(String[] args) {

        System.out.println("Task 1");
        int first = 0;
        int second = 1;
        int next;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < 10; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much you deposited: ");
        float money = scanner.nextFloat();
        System.out.print("Enter for how many month you deposited: ");
        byte month = scanner.nextByte();
        for (int i = 0; i < month; i++) {
            money *= 1.07;
        }
        System.out.println("Your final sum will be: " + money);

        System.out.println("Task 3");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }

}
