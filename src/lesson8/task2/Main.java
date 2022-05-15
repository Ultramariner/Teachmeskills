package lesson8.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Patient[] patients = new Patient[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Enter patients name, doctors id and comment:");
            patients[i] = new Patient(scanner.nextLine(), Byte.parseByte(scanner.nextLine()), scanner.nextLine());
            patients[i].getInfo();
        }
    }
}
