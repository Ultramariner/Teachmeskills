package lesson10;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private double experience;
    private Positions position;
    public final double BASERATE = 1000;

    public Employee(String firstName, String lastName, double experience, Positions position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return BASERATE * getExperience() * getPosition().getRate();
    }

    @Override
    public String toString() {
        return getPosition().getPosition() + " " + getFirstName() + " " + getLastName() + ", working experience " + getExperience() + " years, salary " + getSalary() + "$";
    }
}
