package lesson6.extra.task1;

public class ComputerCreation {

    public static void main(String[] args) {

        Computer computer1 = new Computer("HP", 1999.9);
        Computer computer2 = new Computer("Lenovo", 2999.9, "Cruicial", 4096, "Seagate", 1024, "SSD");

        computer1.getInfo();
        computer2.getInfo();
    }
}
