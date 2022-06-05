package lesson15.task2;

import java.util.List;

public class Family {

    private String lastName;
    private String adress;
    private int salary;
    List<Children> children;

    public Family(String lastName, String adress, int salary, List<Children> children) {
        this.lastName = lastName;
        this.adress = adress;
        this.salary = salary;
        this.children = children;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }
}
