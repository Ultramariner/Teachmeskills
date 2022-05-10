package lesson8.task1.impl;

public class Phone {

    private long number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String model, long number) {
        this.number = number;
        this.model = model;
    }

    public Phone(String model, long number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getInfo() {
        System.out.printf("Phone number %d, model %s, weights %dg%n", getNumber(), getModel(), getWeight());
    }

    public void receiveCall(String name) {
        System.out.printf("%s is calling%n", name);
    }

    public void receiveCall(String name, long number) {
        System.out.printf("%d, %s is calling%n", number, name);
    }

    public void sendMessage(long i, long...arg) {
        System.out.printf("Message will be send to: %d", i);
        for (long j: arg) {
            System.out.printf(", %d", j);
        }
    }
}
