package lesson8.task1;

import lesson8.task1.impl.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Phone phone1 = new Phone();
        phone1.getInfo();
        System.out.println("Enter second phone model and number");
        Phone phone2 = new Phone(scanner.nextLine(), scanner.nextLong());
        phone2.getInfo();
        System.out.println("Enter third phone number, model and weight");
        scanner.nextLine();       //nextLine after nextLong
        Phone phone3 = new Phone(scanner.nextLine(), scanner.nextLong(), scanner.nextInt());
        phone3.getInfo();
        phone1.receiveCall("Teacher");
        phone2.receiveCall("Teacher", 257486375);
        phone3.sendMessage(259354836, 337453745, 291238540, 442387503);
        scanner.close();
    }
}
