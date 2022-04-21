package lesson6.task1;

import java.util.Scanner;

public class CardsCreation {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("13572468", Math.random() * 100);
        CreditCard card2 = new CreditCard("12345678", Math.random() * 100);
        CreditCard card3 = new CreditCard("87654321", Math.random() * 100);

        card1.getInfo();
        card2.getInfo();
        card3.getInfo();

        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("Choose card");
            switch (scanner.nextByte()) {
                case 1:
                    operate(card1);
                    card1.getInfo();
                    break;
                case 2:
                    operate(card2);
                    card2.getInfo();
                    break;
                case 3:
                    operate(card3);
                    card3.getInfo();
                    break;
                default:
                    System.out.println("Exit");
                    check = false;
                    break;
            }
        }
        scanner.close();
    }

    private static void operate (CreditCard card) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation to do? (1. Deposit   2. Withdraw)");
        switch (scanner.nextByte()) {
            case 1:
                System.out.println("How much to deposit?");
                card.setDepositMoney(scanner.nextDouble());
                break;
            case 2:
                System.out.println("How much to withdraw?");
                card.setWithdrawMoney(scanner.nextDouble());
                break;
            default:
                System.out.println("Wrong value");
                break;
        }
    }
}
