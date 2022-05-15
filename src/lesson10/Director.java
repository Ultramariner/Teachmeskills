package lesson10;

import lesson10.impl.Employee;
import lesson10.impl.Positions;

import java.util.ArrayList;

public class Director extends Employee {

    private ArrayList<Employee> assigned;

    public Director(String firstName, String lastName, double experience, Positions position) {
        super(firstName, lastName, experience, position);
        assigned = new ArrayList<>();
    }

    public ArrayList<Employee> getAssigned() {
        return assigned;
    }

    public boolean checkAssigned (Employee employee){
        boolean check = true;
        for (int i = 0; i < getAssigned().size(); i++) {
            if (getAssigned().get(i) == employee) {
                check = false;
                break;
            }
        }
        return check;
    }

    public String getAssignedToString() {
        StringBuilder str = new StringBuilder();
        if (getAssigned().size() > 0) {
            for (Employee temp : getAssigned()) {
                str.append(temp.toString());
                str.append(",\n");
            }
            str.delete(str.length() - 2, str.length() - 1);
        }
        else str.append("none");
        return str.toString();
    }

    public void assignEmployee(Employee employee) {
        if (checkAssigned(employee)) getAssigned().add(employee);
        else System.out.println("Employee already assigned");
    }

    @Override
    public double getSalary() {
        return BASERATE * getExperience() * getPosition().getRate() * (getAssigned().size() + 1);
    }

    public String toStringAssigned() {
        return getPosition().getPosition() + " " + getFirstName() + " " + getLastName() + ", working experience " + getExperience() + " years, salary " + getSalary() + "$, assigned employees:\n" + getAssignedToString();
    }
}
