package lesson10;

import lesson10.impl.Employee;
import lesson10.impl.Positions;

public class Worker extends Employee {

    public Worker(String firstName, String lastName, double experience, Positions position) {
        super(firstName, lastName, experience, position);
    }
}
