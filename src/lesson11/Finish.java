package lesson11;

public class Finish extends Exception{

    public Finish() {
        super();
    }

    @Override
    public String getMessage() {
        return "Exiting";
    }
}
