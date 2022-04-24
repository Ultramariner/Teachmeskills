package lesson7.tesk3.documents;

import lesson7.tesk3.impl.Document;

import java.util.Date;

public class GoodsContract extends Document {

    String type;
    int quantity;

    public GoodsContract() {
    }

    public GoodsContract(String docNumber, Date date, String type, int quantity) {
        super(docNumber, date);
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void printDoc() {
        System.out.printf("Document number %s per date %td.%2$tm.%2$tY for %d goods type of %s%n%n", getDocNumber(), getDate(), getQuantity(), getType());
    }
}
