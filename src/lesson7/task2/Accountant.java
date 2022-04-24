package lesson7.task2;

import lesson7.task2.impl.Employee;

public class Accountant implements Employee {

    private String name;
    private String position;
    private int salary;
    private int rank;

    @Override
    public String getName() { return this.name; }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(String position) { this.position = position; }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRank() { return this.rank; }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
