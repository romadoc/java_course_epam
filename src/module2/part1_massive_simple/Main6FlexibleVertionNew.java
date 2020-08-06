package module2.part1_massive_simple;

public class Main6FlexibleVertionNew {
    public static void main(String[] args) {

        int[] array = massiveGenerator();
        int intTrue;
        int forCount;
        forCount = 0;

        for (int i = 0; i < array.length; i++) {
            intTrue = checkIsPrime(i);
            forCount = forCount + intTrue;
        }
        printRezult(forCount);

    }

    private static int[] massiveGenerator() {

        int[] massive = new int[(int) (Math.random() * 50)];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 20);
        }
        return massive;
    }

    private static int checkIsPrime(int x) {

        int inputDigit;
        inputDigit = x;
        int truIndex;
        truIndex = 0;

        for (int num = 0; num < inputDigit; num++) {
            int temp;
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {

                truIndex = num;

            }

        }
        return truIndex;
    }

    private static void printRezult(int x) {

        System.out.println(" Sum in prime digits' cells : " + x);
    }


}
