package lesson6.extra.task1;

public class RAM {

    private String brand;
    private int size;

    public RAM() {
    }

    public RAM(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getInfo() {
        return ("RAM brand is " + getBrand() + " and its size is " + getSize() + " MB");   //как можно изменить метод не прибегая к if-else если, к примеру, brand = null после вызова конструктора по умолчанию
    }
}