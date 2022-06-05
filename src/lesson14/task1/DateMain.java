package lesson14.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DateMain {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateSimple = new SimpleDateFormat("dd.MM.yyyy");
        Date dateDate = dateSimple.parse(scanner.nextLine());
        LocalDate date = dateDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(date.getDayOfWeek());
        System.out.println((9 - date.getDayOfWeek().getValue()) % 7);
    }
}
