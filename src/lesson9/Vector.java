package lesson9;

public class Vector {

    private double x;
    private double y;
    private double z;
    private final byte dim;
    private final String vec;

    public Vector() {
        this.dim = 0;
        vec = "";
    }

    public Vector(double x) {
        this.x = x;
        this.dim = 1;
        vec = "This is 1 dimension vector";
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.dim = 2;
        vec = "This is 2 dimension vector";
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = 3;
        vec = "This is 3 dimension vector";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public byte getDim() {
        return dim;
    }

    public String getVec() {
        return vec;
    }

    public double getLength() {
        switch (getDim()) {
            case 1:
                return this.x;
            case 2:
                return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.y, 2));
            case 3:
                return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2));
            default:
                return 0;
        }
    }

    public static double getScalarMultiplication(Vector vectorA, Vector vectorB) {
        if (vectorA.getDim() == vectorB.getDim()) {
            switch (vectorA.getDim()) {
                case 1:
                    return vectorA.getX() * vectorB.getX();
                case 2:
                    return vectorA.getX() * vectorB.getX() + vectorA.getY() * vectorB.getY();
                case 3:
                    return vectorA.getX() * vectorB.getX() + vectorA.getY() * vectorB.getY() + vectorA.getZ() * vectorB.getZ();
                default:
                    return 0;
            }
        }
        else return 0;
    }

    public static Vector getVectorsAdd(Vector vectorA, Vector vectorB) {
        if (vectorA.getDim() == vectorB.getDim()) {
            switch (vectorA.getDim()) {
                case 1:
                    return new Vector(vectorA.getX() + vectorB.getX());
                case 2:
                    return new Vector(vectorA.getX() + vectorB.getX(), vectorA.getY() + vectorB.getY());
                case 3:
                    return new Vector(vectorA.getX() + vectorB.getX(), vectorA.getY() + vectorB.getY(), vectorA.getZ() + vectorB.getZ());
                default:
                    return null;
            }
        }
        else return null;
    }

    public static Vector getVectorsSub(Vector vectorA, Vector vectorB) {
        if (vectorA.getDim() == vectorB.getDim()) {
            switch (vectorA.getDim()) {
                case 1:
                    return new Vector(vectorA.getX() - vectorB.getX());
                case 2:
                    return new Vector(vectorA.getX() - vectorB.getX(), vectorA.getY() - vectorB.getY());
                case 3:
                    return new Vector(vectorA.getX() - vectorB.getX(), vectorA.getY() - vectorB.getY(), vectorA.getZ() - vectorB.getZ());
                default:
                    return null;
            }
        }
        else return null;
    }

    public static boolean compareVectors(Vector vectorA, Vector vectorB) {
        if (vectorA.getDim() == vectorB.getDim()) {
            switch (vectorA.getDim()) {
                case 1:
                    return vectorA.getX() == vectorB.getX();
                case 2:
                    return vectorA.getX() == vectorB.getX() && vectorA.getY() == vectorB.getY();
                case 3:
                    return vectorA.getX() == vectorB.getX() && vectorA.getY() == vectorB.getY() && vectorA.getZ() == vectorB.getZ();
                default:
                    return false;
            }
        }
        else return false;
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

    public static Vector getRand() {
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

    public void getInfo() {
        switch (getDim()) {
            case 1:
                System.out.printf("%s { %f}%n", getVec(), getX());
                break;
            case 2:
                System.out.printf("%s { %f, %f}%n", getVec(), getX(), getY());
                break;
            case 3:
                System.out.printf("%s { %f, %f, %f}%n", getVec(), getX(), getY(), getZ());
                break;
            default:
                break;
        }
    }
}
