package lesson6.extra.task1;

public class Computer {

    private String model;
    private double cost;
    private RAM ram;
    private HDD hdd;

    public Computer(String model, double cost) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String model, double cost, String ramModel, int ramSize, String hddModel, int hddSize, String hddType) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM(ramModel, ramSize);
        this.hdd = new HDD(hddModel, hddSize, hddType);
    }

    public double getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram.getInfo();
    }

    public String getHdd() {
        return hdd.getInfo();
    }

    public void getInfo() {
        System.out.printf("Computer model %s with price %.2f components are:%nRAM: %s%nHDD: %s", getModel(), getCost(), getRam(), getHdd());
    }
}
