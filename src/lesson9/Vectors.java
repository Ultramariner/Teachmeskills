package lesson9;

import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {

        Vector[] vectors = new Vector[5];
        Vector temp;
        Scanner scanner = new Scanner(System.in);
        byte vector1, vector2;
        boolean run = true;
        initVectorArr(vectors);
        printVectorArr(vectors);
        while (run) {
            System.out.printf("What to do:%n1. Calculate multiplication%n2. Calculate addition%n3. Calculate subtraction%n4. Comparison%n");
            switch (scanner.nextByte()) {
                case 1:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    System.out.printf("Result is %f%n", vectors[0].getScalarMultiplication(vectors[vector1 - 1], vectors[vector2 - 1]));
                    break;
                case 2:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    temp = vectors[0].getVectorsAdd(vectors[vector1 - 1], vectors[vector2 - 1]);
                    System.out.print("Result is ");
                    temp.getInfo();
                    break;
                case 3:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    temp = vectors[0].getVectorsSub(vectors[vector1 - 1], vectors[vector2 - 1]);
                    System.out.print("Result is ");
                    temp.getInfo();
                    break;
                case 4:
                    System.out.println("Enter vectors numbers:");
                    vector1 = scanner.nextByte();
                    vector2 = scanner.nextByte();
                    if (vectors[0].compareVectors(vectors[vector1 - 1], vectors[vector2 - 1])) System.out.println("Vectors are identical");
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

    public static void initVectorArr(Vector[] vectors) {
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = getRand();
        }
        System.out.println("Array filled");
    }

    public static void printVectorArr(Vector[] vectors) {
        System.out.println("Array vectors:");
        for (Vector vector : vectors) {
            vector.getInfo();
        }
    }

    public static Vector getRand() {            //лень в Vector писать
        switch ((int) (Math.random() * 3 + 1)) {
            case 1:
                return new Vector(Math.random() * 9 + 1);
            case 2:
                return new Vector(Math.random() * 9 + 1, Math.random() * 9 + 1);
            case 3:
                return new Vector(Math.random() * 9 + 1, Math.random() * 9 + 1, Math.random() * 9 + 1);
            default:
                return null;
        }
    }
}
