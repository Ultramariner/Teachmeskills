package lesson6.extra.task1;

public class HDD {

    private String brand;
    private int size;
    private String type;

    public HDD() {
    }

    public HDD(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        return ("HDD brand is " + getBrand() + ", its size is " + getSize() + " GB and its type is " + getType() + "\n\n");
    }
}
