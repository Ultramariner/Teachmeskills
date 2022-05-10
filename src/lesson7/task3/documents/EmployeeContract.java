package lesson7.task3.documents;

import lesson7.task3.impl.Document;

import java.util.Date;

public class EmployeeContract extends Document {

    Date startDate;
    Date endDate;
    String name;

    public EmployeeContract() {
    }

    public EmployeeContract(String docNumber, Date date, Date startDate, Date endDate, String name) {
        super(docNumber, date);
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printDoc() {
        System.out.printf("Document number %s per date %td.%2$tm.%2$tY for employee %s on a period from %td.%4$tm.%4$tY to %td.%5$tm.%5$tY%n%n", getDocNumber(), getDate(), getName(), getStartDate(), getEndDate());
    }
}
