package lesson11;

public class Full extends Exception{

    public Full() {
        super();
    }

    @Override
    public String getMessage() {
        return "Memory is full";
    }
}