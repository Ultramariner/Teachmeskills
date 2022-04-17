package lesson5.task3;

import myUtil.ArrayFunctions;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int dim11, dim12, dim21, dim22;
        System.out.println("Enter first array number of strings:");
        dim11 = ArrayFunctions.checkLength();
        System.out.println("Enter first array number of columns:");
        dim12 = ArrayFunctions.checkLength();
        System.out.println("Enter second array number of strings:");
        dim21 = ArrayFunctions.checkLength();
        System.out.println("Enter second array number of columns:");
        dim22 = ArrayFunctions.checkLength();
        int[][] array1 = new int[dim11][dim12];
        int[][] array2 = new int[dim21][dim22];
        if (array1[0].length != array2.length) {
            System.out.println("Arrays cannot be multiplied");
            return;
        }
        int[][] arrayFinal = new int[array1.length][array2[0].length];

        ArrayFunctions.initArray(array1);
        System.out.println("Your first array is:");
        ArrayFunctions.printArray(array1);
        ArrayFunctions.initArray(array2);
        System.out.println("Your second array is:");
        ArrayFunctions.printArray(array2);

        ArrayFunctions.multiplyArrays(array1, array2, arrayFinal);
        System.out.println("Your multiplied array is:");
        ArrayFunctions.printArray(arrayFinal);
    }
}
