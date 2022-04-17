package myUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctions {

    public static int checkLength() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int length = 0;
        while (check) {
            length = scanner.nextInt();
            if (length > 0) check = false;
            else System.out.println("Wrong value, try again");
        }
        return length;
    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
        }
    }

    public static void initArray(int[][] array) {
        for (int[] ints : array) {
            initArray(ints);
        }
    }

    public static void initArray(int[][][] array) {
        for (int[][] ints : array) {
            initArray(ints);
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = { ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) System.out.print(", ");
            }
            System.out.print(" }");
            if (i != array.length - 1) System.out.println(";");
            else System.out.println(".\n");
        }
    }

    public static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = {");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{ ");
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]);
                    if (k != array[i][j].length - 1) System.out.print(", ");
                }
                System.out.print(" }");
                if (j != array[i].length - 1) System.out.print(", ");
            }
            System.out.print("}");
            if (i != array.length - 1) System.out.println(";");
            else System.out.println(".\n");
        }
    }

    public static void multiplyArrays(int[][] array1, int[][] array2, int[][] arrayFinal) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                        arrayFinal[i][j] += (array1[i][k] * array2[k][j]);
                }
            }
        }
    }

    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {             //Интересная замена от IDEA, стоит ли использовать её чаще вместо обычного перебора через fori?
                sum += anInt;
            }
        }
        return sum;
    }

    public static void sortArray(int[][] array) {
        for (int[] ints : array) {
            Arrays.sort(ints);
        }
    }
}
