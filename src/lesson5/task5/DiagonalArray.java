package lesson5.task5;

import myUtil.ArrayFunctions;

public class DiagonalArray {

    public static void main(String[] args) {
        int dim1;
        System.out.println("Enter dimension 1 and 2 length:");
        dim1 = ArrayFunctions.checkLength();
        int[][] array = new int[dim1][dim1];
        ArrayFunctions.initArray(array);
        System.out.println("Your array is:");
        ArrayFunctions.printArray(array);
        System.out.println("Diagonals of the array are:");
        printDiagonals(array);
    }

    public static void printDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i]);
            if (i == array.length - 1) System.out.println();
            else System.out.print(", ");
        }
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            System.out.print(array[i][j]);
            if (i == 0) System.out.println();
            else System.out.print(", ");
        }
    }
}
