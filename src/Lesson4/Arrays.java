package Lesson4;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(minimum(array));

        System.out.println(maximum(array));

        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        search(number, array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

    }

    public static void search(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                System.out.println("Number deleted");
                break;
            } else if (i == array.length - 1) {
                System.out.println("Number not found");
            }
        }
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i :
                array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i :
                array) {
            if (i > max) max = i;
        }
        return max;
    }
}