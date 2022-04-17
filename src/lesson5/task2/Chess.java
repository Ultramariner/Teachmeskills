package lesson5.task2;

public class Chess {

    public static void main(String[] args) {
        String[][] array = new String[8][8];
        paintChess(array);
        printChess(array);
    }

    public static void paintChess(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) array[i][j] = "W";          //Можно ли в String хранить и цвет фона\текста чтобы выводить чёрную букву на белом фоне и белую букву на чёрном фоне? Если да, то как?
                else array[i][j] = "B";
            }
        }
    }

    public static void printChess(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
