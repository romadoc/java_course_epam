package module2.part1_massive_simple;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Main1 {
    static int k = 4;

    public static void main(String[] args) {

        fillAndPrint();

    }

    static void fillAndPrint() {
        int[] massive = new int[20];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
        }
        System.out.println("числа, кратные К (при К = 4): ");
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] % k == 0) {
                System.out.print(" " + massive[j] + "; ");
            }
        }
    }


}


