package lesson12.task2;

import lesson12.task1.User;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder actor1 = new StringBuilder();
        StringBuilder actor2 = new StringBuilder();
        byte actor = 0;

        try (BufferedReader read = new BufferedReader(new FileReader("D:/test.txt"));
             BufferedWriter writeActor1 = new BufferedWriter(new FileWriter("D:/test1.txt"));
             BufferedWriter writeActor2 = new BufferedWriter(new FileWriter("D:/test2.txt"))) {
            String temp = read.readLine();
            while (temp != null) {
                if (temp.indexOf("Romeo:") == 0) {
                    actor = 1;
                    actor1.append(temp).append('\n');
                } else if (temp.indexOf("Juliet:") == 0) {
                    actor = 2;
                    actor2.append(temp).append('\n');
                } else if (actor == 1) {
                    actor1.append(temp).append('\n');
                }
                else {
                    actor2.append(temp).append('\n');
                }
                temp = read.readLine();
            }
            writeActor1.write(actor1.toString());
            writeActor2.write(actor2.toString());
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}