package lesson7.task3;

import lesson7.task3.documents.Consignment;
import lesson7.task3.documents.EmployeeContract;
import lesson7.task3.documents.GoodsContract;
import lesson7.task3.impl.Document;

import java.util.Date;
import java.util.Objects;

public class Register {

    static Document[] documents = new Document[10];

    public static void saveDocument(String docNumber, Date date, String type, int quantity) {
        int i = 0;
        while (documents[i] != null) {
            i++;
        }
        if (i >= 10) return;
        documents[i] = new GoodsContract(docNumber, date, type, quantity);
    }

    public static void saveDocument(String docNumber, Date date, Date startDate, Date endDate, String name) {
        int i = 0;
        while (documents[i] != null) {
            i++;
        }
        if (i >= 10) return;
        documents[i] = new EmployeeContract(docNumber, date, startDate, endDate, name);
    }

    public static void saveDocument(String docNumber, Date date, int sum, String code) {
        int i = 0;
        while (documents[i] != null) {
            i++;
        }
        if (i >= 10) return;
        documents[i] = new Consignment(docNumber, date, sum, code);
    }

    public static void printDocument(String docNumber) {
        for (Document i : documents) {
            if (i != null && Objects.equals(i.getDocNumber(), docNumber)) {
                i.printDoc();
            }
        }
    }
}
