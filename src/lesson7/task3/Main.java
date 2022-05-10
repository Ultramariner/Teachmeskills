package lesson7.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String docNumber, type, name, code;
        Date docDate = new Date();
        Date startDate, endDate;
        int quantity, sum;

        while (check) {
            System.out.println("Choose operation (1. Save document   2. Print document   3. Exit):");
            switch (scanner.nextByte()) {
                case 1:
                    System.out.println("Choose document type (1. Goods contract   2. Employee contract   3. Consignment):");
                    switch (scanner.nextByte()) {        //можно ли было сделать проще?
                        case 1:
                            scanner.nextLine();
                            System.out.println("Enter document number:");
                            docNumber = scanner.nextLine();
                            System.out.println("Enter goods type:");
                            type = scanner.nextLine();
                            System.out.println("Enter goods quantity:");
                            quantity = scanner.nextInt();
                            Register.saveDocument(docNumber, docDate, type, quantity);
                            System.out.println("Document saved\n");
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Enter document number:");
                            docNumber = scanner.nextLine();
                            System.out.println("Enter employee contract begin date:");
                            startDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
                            System.out.println("Enter employee contract end date:");
                            endDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
                            System.out.println("Enter employee name:");
                            name = scanner.nextLine();
                            Register.saveDocument(docNumber, docDate, startDate, endDate, name);
                            System.out.println("Document saved\n");
                            break;
                        case 3:
                            scanner.nextLine();
                            System.out.println("Enter document number:");
                            docNumber = scanner.nextLine();
                            System.out.println("Enter consignment sum:");
                            sum = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter consignment code:");
                            code = scanner.nextLine();
                            Register.saveDocument(docNumber, docDate, sum, code);
                            System.out.println("Document saved\n");
                            break;
                        default:
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter document number:");
                    docNumber = scanner.nextLine();
                    Register.printDocument(docNumber);
                    break;
                default:
                    System.out.println("Exit");
                    check = false;
                break;
            }
        }
        scanner.close();
    }
}
