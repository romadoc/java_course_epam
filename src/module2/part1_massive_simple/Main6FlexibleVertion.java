package module2.part1_massive_simple;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.


public class Main6FlexibleVertion {
    public static void main(String[] args) {

     primeCheck();

    }
    public static int [] massiveGenerator(){

        int [] massive = new int[(int) (Math.random()*50)];
        for (int i = 0; i < massive.length; i++){
            massive[i] = (int) (Math.random()*20);
        }
        return massive;
    }

    public static void primeCheck(){
        int sum;
        sum = 0;
        int [] massiveOut = massiveGenerator();

        for (int num = 0; num < massiveOut.length; num++) {
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
                sum = massiveOut[num] + sum;

            }

        }
        System.out.println("sum: " + sum);

    }


}
