package lesson6.task1;

public class CreditCard {

    private String accountNumber;
    private double money;

    public CreditCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void getInfo() {
        System.out.printf("Account number is %s, account balance is %.2f%n%n", getAccountNumber(), getMoney());
    }

    public double getMoney() {
        return money;
    }
    public void setDepositMoney(double money) {
        this.money += money;
    }

    public void setWithdrawMoney(double money) {
        this.money -= money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}
