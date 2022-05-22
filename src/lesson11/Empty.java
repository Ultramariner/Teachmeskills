package lesson11;

public class Empty extends Exception{

    public Empty() {
        super();
    }

    @Override
    public String getMessage() {
        return "Memory is empty";
    }
}
