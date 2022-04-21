package lesson5.task1;

import java.util.Scanner;
import myUtil.ArrayFunctions;

public class ThreeDimArrayInc {

    public static void main(String[] args) {
        int dim1, dim2, dim3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimension 1 length:");
        dim1 = ArrayFunctions.checkLength();
        System.out.println("Enter dimension 2 length:");
        dim2 = ArrayFunctions.checkLength();
        System.out.println("Enter dimension 3 length:");
        dim3 = ArrayFunctions.checkLength();
        int[][][] array = new int[dim1][dim2][dim3];
        ArrayFunctions.initArray(array);
        System.out.println("Your array is:");
        ArrayFunctions.printArray(array);

        System.out.println("Enter your number:");
        int increase = scanner.nextInt();
        increaseArray(increase, array);
        System.out.println("Result array is:");
        ArrayFunctions.printArray(array);
        scanner.close();
    }

    public static void increaseArray(int number, int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
    }
}
