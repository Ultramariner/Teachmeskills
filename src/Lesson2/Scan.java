package Lesson2;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        System.out.println("Enter your username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String spaces = "";
        for (int i = 0; i < 19 - username.length(); i++) {
            spaces += " ";
        }
        System.out.println("Hello, " + username + "!");
        System.out.println("What is your credit card number, " + username + "?");
        String cardNumber = scanner.nextLine();
        System.out.println("------------------------\n|                      |\n|   " + cardNumber + "   |\n|                      |\n|   " + username + spaces + "|\n|                      |\n------------------------");
        scanner.close();
    }

}
