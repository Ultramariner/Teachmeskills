package lesson6.extra.task2;

import java.util.Scanner;

public class Work {      //Надеюсь что верно понял задание и хотол бы узнать у кого из всех получилась лучшая реализация данного задания

    public static void main(String[] args) {

        Atm atm = new Atm(1000, 1000, 1000);
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Choose operation (1. Deposit     2. Withdraw)");
            switch (scanner.nextByte()) {
                case 1:
                    System.out.println("How much 20s you deposit?");
                    atm.setDepositAmount_20(scanner.nextInt());
                    System.out.println("How much 50s you deposit?");
                    atm.setDepositAmount_50(scanner.nextInt());
                    System.out.println("How much 100s you deposit?");
                    atm.setDepositAmount_50(scanner.nextInt());
                    atm.getTotalAmount();
                    break;
                case 2:
                    System.out.println("How much you want to withdraw?");
                    check = !atm.setWithdraw(scanner.nextInt());
                    atm.getTotalAmount();
                    break;
                default:
                    check = false;
                    System.out.println("No such operation");
                    break;
            }
        }
        scanner.close();
    }
}
