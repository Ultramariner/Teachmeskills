package lesson10;

import lesson10.impl.Employee;

public class DeepSearch {

    public static boolean search (Employee employee1, Employee employee2) {
        boolean check = false;
        if (employee2 instanceof Director) {
            for (int i = 0; i < ((Director) employee2).getAssigned().size() && !check; i++) {
                if (compare(employee1, ((Director) employee2).getAssigned().get(i))) {
                    check = true;
                    break;
                }
                if (((Director) employee2).getAssigned().get(i) instanceof Director) {
                    check = search(employee1, ((Director) employee2).getAssigned().get(i));
                }
            }
        }
        else {
            System.out.println("Workers dont have assigned employees");
            return false;
        }
        return check;
    }

    public static boolean compare (Employee employee1, Employee employee2) {
        return (employee1.getFirstName().equals(employee2.getFirstName()) && employee1.getLastName().equals(employee2.getLastName()) && employee1.getExperience() == (employee2.getExperience()) && employee1.getPosition().getPosition().equals(employee2.getPosition().getPosition()));
    }
}
