package lesson14.task2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        FunctionalInterface processer = null;
        switch (input) {
            case 12:
                processer = (value) -> {
                    StringBuilder temp = new StringBuilder();
                    temp.append(value);
                    temp.reverse();
                    return temp.toString();
                };
                break;
            case 3:
                processer = (value) -> {return factorial((Integer) value);};
                break;
            default:
                break;
        }
        System.out.println(processer.ProcessInfo(input));
    }

    static Integer factorial(Integer number){
        if (number == 0)
            return 1;
        else
            return (number * factorial(number - 1));
    }
}
