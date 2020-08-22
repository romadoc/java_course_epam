package module2.part2_multi_massive;

/*
   Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
   которых число 5 встречается три и более раз.
 */
public class Main11 {
    public static void main(String[] args) {
        int[][] array;
        array = matrixConstructor();
        printMatrix(array);
        desition(array);

    }

    private static int[][] matrixConstructor() {
        int[][] array = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }
        return array;
    }

    private static void printMatrix(int[][] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void desition(int[][] arrayIn) {

        System.out.println();
        System.out.print("Index(es) of strings: ");
        for (int i = 0; i < arrayIn.length; i++) {
            int counter = 0;

            for (int j = 0; j < arrayIn[i].length; j++) {
                if (arrayIn[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {

                System.out.print(i + "; ");
            }
        }

    }

}
