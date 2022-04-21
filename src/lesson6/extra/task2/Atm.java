package lesson6.extra.task2;

public class Atm {

    private int amount_20;
    private int amount_50;
    private int amount_100;

    public Atm(int amount_20, int amount_50, int amount_100) {
        this.amount_20 = amount_20;
        this.amount_50 = amount_50;
        this.amount_100 = amount_100;
    }

    public int getAmount_20() {
        return amount_20;
    }

    public void setDepositAmount_20(int amount_20) {
        this.amount_20 += amount_20;
    }

    public void setWithdrawAmount_20(int amount_20) {
        this.amount_20 -= amount_20;
    }

    public int getAmount_50() {
        return amount_50;
    }

    public void setDepositAmount_50(int amount_50) {
        this.amount_50 += amount_50;
    }

    public void setWithdrawAmount_50(int amount_50) {
        this.amount_50 -= amount_50;
    }

    public int getAmount_100() {
        return amount_100;
    }

    public void setDepositAmount_100(int amount_100) {
        this.amount_100 += amount_100;
    }

    public void setWithdrawAmount_100(int amount_100) {
        this.amount_100 -= amount_100;
    }

    public int getSum() {
        return getAmount_20() * 20 + getAmount_50() * 50 + getAmount_100() * 100;
    }

    public void getTotalAmount() {
        System.out.printf("Banknotes in the ATM:%n20s: %d%n50s: %d%n100s: %d%n", getAmount_20(), getAmount_50(), getAmount_100());
    }

    public boolean setWithdraw(int amount) {
        int twenty;
        int fifty = 0;
        int hundred;
        if (amount % 10 == 0 && amount >= 20 && amount != 30 && amount < getSum()) {        //лень алгоритм списания купюр разного номинала придумывать, но условие подходит
            if (amount % 20 == 10) {
                fifty = 1;
                setWithdrawAmount_50(fifty);
                amount -= 50;
            }
            hundred = amount / 100;
            setWithdrawAmount_100(hundred);
            amount -= 100 * hundred;
            twenty = amount / 20;
            setWithdrawAmount_20(twenty);
            System.out.printf("Withdrawed %d 20s, %d 50s and %d 100s%n", twenty, fifty, hundred);
            return true;
        }
        else {
            System.out.println("Incorrect amount");
            return false;
        }
    }
}
