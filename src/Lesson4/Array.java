package Lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        boolean check = true;
        int length = 0;
        while (check) {
            length = scanner.nextInt();
            if (length > 0) check = false;
            else System.out.println("Wrong value, try again");
        }
        int[] array = new int[length];         //Почему здесь ругается что length не инициализирована если в 12 строке написано "int length;", хотя оно инциализируется чуть позже?
        arrayInit(array);
        arrayPrintInt(array);

        System.out.println("\nTask 0");
        System.out.println("Enter which number to search:");
        int numberSearch = scanner.nextInt();
        arraySearch(numberSearch, array);

        System.out.println("\nTask 1");
        System.out.println("Enter which number to delete:");
        int numberDelete = scanner.nextInt();
        arrayDelete(numberDelete, array);
        arrayPrintInt(array);

        System.out.println("\nTask 2");
        System.out.println("Minimum element of array is " + arrayMinimum(array));
        System.out.println("Maximum element of array is " + arrayMaximum(array));
        System.out.println("Average element of array is " + arrayAverage(array));

        System.out.println("\nTask 3");
        length = 5;
        int[] arrayFirst = new int[length];
        int[] arraySecond = new int[length];
        arrayInit(arrayFirst);
        arrayInit(arraySecond);
        System.out.print("arrayFirst");
        arrayPrintInLine(arrayFirst);
        System.out.print("arraySecond");
        arrayPrintInLine(arraySecond);
        System.out.println("arrayFirst average is " + arrayAverage(arrayFirst));
        System.out.println("arraySecond average is " + arrayAverage(arraySecond));
        if (arrayAverage(arrayFirst) > arrayAverage(arraySecond)) System.out.println("arrayFirst average is bigger");
        else if (arrayAverage(arrayFirst) < arrayAverage(arraySecond))
            System.out.println("arraySecond average is bigger");
        else System.out.println("arrayFirst average and arraySecond average is equal");

        System.out.println("\nTask 4");
        check = true;
        while (check) {
            length = scanner.nextInt();
            if (length > 5 && length <= 10) check = false;
            else System.out.println("Wrong value, try again");
        }
        int[] arrayExtraFirst = new int[length];
        int[] arrayExtraSecond = new int[length];
        arrayInit(arrayExtraFirst);
        System.out.print("arrayExtraFirst");
        arrayPrintInLine(arrayExtraFirst);
        arrayTransferEven(arrayExtraFirst, arrayExtraSecond);
        System.out.print("arrayExtraSecond");
        arrayPrintInLine(arrayExtraSecond);

        System.out.println("\nTask 5");
        check = true;
        while (check) {
            length = scanner.nextInt();
            if (length > 0) check = false;
            else System.out.println("Wrong value, try again");
        }
        int[] arrayExtraThird = new int[length];
        arrayInit(arrayExtraThird);
        System.out.print("arrayExtraThird");
        arrayPrintInLine(arrayExtraThird);
        arrayDeleteOdd(arrayExtraThird);
        System.out.print("arrayExtraThird");
        arrayPrintInLine(arrayExtraThird);

        System.out.println("\nTask 6");
        String[] arrayExtraString = new String[] { "Дмитрий", "Олег", "Оксана", "Владимир", "Алина", "Ксения", "Глеб" };
        System.out.print("arrayExtraString");
        arrayPrintInLine(arrayExtraString);
        Arrays.sort(arrayExtraString);          //Надеюсь не нужно было изобретать велосипед
        System.out.print("arrayExtraString");
        arrayPrintInLine(arrayExtraString);

        System.out.println("\nTask 7");
        check = true;
        while (check) {
            length = scanner.nextInt();
            if (length > 0) check = false;
            else System.out.println("Wrong value, try again");
        }
        int[] arrayExtraSort = new int[length];
        arrayInit(arrayExtraSort);
        System.out.print("arrayExtraSort");
        arrayPrintInLine(arrayExtraSort);
        sortIntArray(arrayExtraSort);              //Вспомнил что методы должны с глагола начинаться
        System.out.print("arrayExtraSort");
        arrayPrintInLine(arrayExtraSort);

        scanner.close();
    }

    public static void arrayInit(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void arrayPrintInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void arrayPrintInLine(int[] array) {
        System.out.print("[" + array.length + "] = { " + array[0]);
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print(" }\n");
    }

    public static void arrayPrintInLine(String[] array) {
        System.out.print("[" + array.length + "] = { " + array[0]);
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print(" }\n");
    }

    public static void arraySearch(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Number " + number + " was found");
                break;
            } else if (i == array.length - 1) System.out.println("Number " + number + " not found");
        }
    }

    public static void arrayDelete(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                System.out.println("Number " + number + " was deleted");
            } else if (i == array.length - 1) {
                System.out.println("Number " + number + " not found");
            }
        }
    }

    public static void arrayDeleteOdd(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
    }

    public static int arrayMinimum(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int arrayMaximum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static double arrayAverage(int[] array) {
        double aver = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            aver += array[i];
        }
        aver /= (i - 1);
        return aver;
    }

    public static void arrayTransferEven(int[] array1, int[] array2) {
        int j = 0;
        for (int i : array1) {
            if (i % 2 == 0) {
                array2[j] = i;
                j++;
            }
        }
    }

    public static void sortIntArray(int[] array) {
        boolean check = true;
        int help;
        while (check) {
            check = false;
            if (array.length > 1) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        help = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = help;
                        check = true;
                    }
                }
            }
        }
    }
}