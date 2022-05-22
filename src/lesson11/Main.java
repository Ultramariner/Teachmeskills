package lesson11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserInputService input = new UserInputService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program started");

        while (true) {
            try {
                input.processingInput(scanner.nextLine());
            } catch (Finish finish) {
                System.out.println(finish.getMessage());
                break;
            } catch (Empty empty) {
                System.out.println(empty.getMessage());
            } catch (Full full) {
                System.out.println(full.getMessage());
            }
        }
    }
}
