package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        String firstName, lastName, position;
        double experience;
        byte appointedTo, appointed, info, searchWho, searchWhere;


        while (run) {
            printEmployees(employees);
            System.out.println("Choose options:\n1. Add employee\n2. Assign employee\n3. Print info\n4.Search assigned employees\n5. Finish");
            switch (Byte.parseByte(scanner.nextLine())) {
                case 1:
                    System.out.println("Enter employee first name");
                    firstName = scanner.nextLine();
                    System.out.println("Enter employee last name");
                    lastName = scanner.nextLine();
                    System.out.println("Enter employee working experience");
                    experience = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter employee position");
                    position = scanner.nextLine();
                    if (position.equals("Worker")) employees.add(new Worker(firstName, lastName, experience, Positions.WORKER));
                    else if (position.equals("Director")) employees.add(new Director(firstName, lastName, experience, Positions.DIRECTOR));
                    break;
                case 2:
                    System.out.println("Who to appoint?");
                    appointed = (byte) (Byte.parseByte(scanner.nextLine()) - 1);
                    System.out.println("Appoint to who?");
                    appointedTo = (byte) (Byte.parseByte(scanner.nextLine()) - 1);
                    if (employees.get(appointedTo) instanceof Director) ((Director) employees.get(appointedTo)).assignEmployee(employees.get(appointed));
                    else System.out.println("Cannot appoint to Worker");
                    break;
                case 3:
                    System.out.println("Who's info to print?");
                    info = (byte) (Byte.parseByte(scanner.nextLine()) - 1);
                    if (employees.get(info) instanceof Director) System.out.println(((Director) employees.get(info)).toStringAssigned());
                    else System.out.println(employees.get(info).toString());
                    break;
                case 4:
                    System.out.println("Which employee to search?");
                    searchWho = (byte) (Byte.parseByte(scanner.nextLine()) - 1);
                    System.out.println("Whose assigners to check?");
                    searchWhere = (byte) (Byte.parseByte(scanner.nextLine()) - 1);
                    if (DeepSearch.search(employees.get(searchWho), employees.get(searchWhere))) System.out.println("Employee found");
                    else System.out.println("Employee not found");
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();   //как обходить закрытие нескольких (System.in) сканеров?
    }

    public static void printEmployees(ArrayList<Employee> employee) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < employee.size(); i++) {
            str.append(i + 1);
            str.append(". ");
            str.append(employee.get(i).toString());
            str.append("\n");
        }
        System.out.println(str);
    }
}
