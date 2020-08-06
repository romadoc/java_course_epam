package module2.part1_massive_simple;

public class Main6FlexibleVertion {
    public static void main(String[] args) {
     printMassiveIndex();
     primeCheck();

    }
    public static int [] mass(){

        int [] massive = new int[(int) (Math.random()*50)];
        for (int i = 0; i < massive.length; i++){
            massive[i] = (int) (Math.random()*20);
        }
        return massive;
    }
    public static void printMassiveIndex(){
        int [] generatedMassive;
        generatedMassive = mass();
        int indexOfElements;
        indexOfElements = 0;
        for (int i = 0; i < generatedMassive.length; i++){
            indexOfElements = i;

        }
    }
    public static void primeCheck(){
        int sum;
        sum = 0;

        for (int num = 0; num < mass().length; num++) {
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
                sum = mass()[num] + sum;
               // System.out.println(num + "Simple");

            }
          //  else {
          //      System.out.println("Combined");
          //  }
        }
        System.out.println("sum: " + sum);

    }




}
