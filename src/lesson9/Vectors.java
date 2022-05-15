package lesson9;

import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {

        Vector[] vectors = new Vector[5];
        Vector temp;
        Scanner scanner = new Scanner(System.in);
        byte vector1, vector2;
        boolean run = true;
        Vector.initVectorArr(vectors);
        Vector.printVectorArr(vectors);
        while (run) {
            System.out.printf("What to do:%n1. Calculate multiplication%n2. Calculate addition%n3. Calculate subtraction%n4. Comparison%n");
            switch (scanner.nextByte()) {
                case 1:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    System.out.printf("Result is %f%n", Vector.getScalarMultiplication(vectors[vector1 - 1], vectors[vector2 - 1]));
                    break;
                case 2:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    temp = Vector.getVectorsAdd(vectors[vector1 - 1], vectors[vector2 - 1]);
                    System.out.print("Result is ");
                    temp.getInfo();
                    break;
                case 3:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    temp = Vector.getVectorsSub(vectors[vector1 - 1], vectors[vector2 - 1]);
                    System.out.print("Result is ");
                    temp.getInfo();
                    break;
                case 4:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    if (Vector.compareVectors(vectors[vector1 - 1], vectors[vector2 - 1])) System.out.println("Vectors are identical");
                    else System.out.println("Vectors are different");
                    break;
                default:
                    System.out.println("Exit");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}
