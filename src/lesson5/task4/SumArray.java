package lesson5.task4;

import myUtil.ArrayFunctions;

public class SumArray {

    public static void main(String[] args) {
        int dim1, dim2;
        System.out.println("Enter dimension 1 length:");
        dim1 = ArrayFunctions.checkLength();
        System.out.println("Enter dimension 2 length:");
        dim2 = ArrayFunctions.checkLength();
        int[][] array = new int[dim1][dim2];
        ArrayFunctions.initArray(array);
        System.out.println("Your array is:");
        ArrayFunctions.printArray(array);
        System.out.println("Sum of all array elements is " + ArrayFunctions.sumArray(array));
    }
}
