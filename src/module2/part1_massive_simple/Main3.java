package module2.part1_massive_simple;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Main3 {

    static int countNegativeValue = 0;
    static int countPositiveValue = 0;
    static int countZeroValue = 0;

    public static void main(String[] args) {
        int n;
        n = 20;
        int[] massive = new int[n];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 200 - 100);
            System.out.print(" " + massive[i] + "; ");
        }

        System.out.println();

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 0) {
                countZeroValue = countZeroValue + 1;
            } else if (massive[i] > 0) {
                countPositiveValue = countPositiveValue + 1;
            } else countNegativeValue = countNegativeValue + 1;

        }
        System.out.println("положительных элементов: " + countPositiveValue);
        System.out.println("нулевых элементов: " + countZeroValue);
        System.out.println("отрицательных элементов: " + countNegativeValue);
    }

}
