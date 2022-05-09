package lesson7.task3.impl;

import java.util.Date;

public abstract class Document {

    private String docNumber;
    private Date date;

    public Document() {
    }

    public Document(String docNumber, Date date) {
        this.docNumber = docNumber;
        this.date = date;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract void printDoc();
}
