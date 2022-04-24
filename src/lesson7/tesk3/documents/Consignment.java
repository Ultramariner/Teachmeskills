package lesson7.tesk3.documents;

import lesson7.tesk3.impl.Document;

import java.util.Date;

public class Consignment extends Document {

    int sum;
    String code;

    public Consignment() {
    }

    public Consignment(String docNumber, Date date, int sum, String code) {
        super(docNumber, date);
        this.sum = sum;
        this.code = code;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void printDoc() {
        System.out.printf("Document number %s per date %td.%2$tm.%2$tY of department %s for sum of %d%n%n", getDocNumber(), getDate(), getCode(), getSum());
    }
}
