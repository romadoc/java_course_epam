package module2.part4_decomposition;

import java.util.Scanner;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */
public class Main14 {
    public static void main(String[] args) {

        int k;
        k = inputDigit("Type k: >");
        solver(k);

    }

    private static int inputDigit(String s) {
        int x = 0;
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(s);
        }
        x = scanner.nextInt();
        return x;
    }

    private static int digitCouter(int x) {
        int n = x;
        int countDigits = 0;
        for (; n != 0; n = n / 10) {

            countDigits++;

        }

        return countDigits;

    }

    private static int[] arrayDigConstructor(int k, int digLenght) {
        int number = k;
        int[] array = new int[digLenght];//длина массива = количество цифр в числе "к"

        for (int i = 0; i < array.length; i++) {

            int rezult = 0;
            rezult = number % 10;
            number = number / 10;
            array[i] = rezult;
        }


        return array;
    }

    private static void solver(int k) {
         System.out.print("Amstrong's digits: ");

            for(int i = 0; i <= k; i++){ //перебор от 1 до к
                int[]arraySubTemp = arrayDigConstructor(i, digitCouter(i)); //созд-е временного массива составляющих чисел от 1 до i
                double sum = 0;
                for (int j = 0; j < arraySubTemp.length; j++) { // перебор массива от 0 до i

                   sum =  (Math.pow(arraySubTemp[j], digitCouter(i))) + sum;
                   if(sum == i){
                       System.out.print(i + "; ");
                   }

                }
            }

    }

    private static void printArray(int[] array, String s) {
        System.out.print(s);
        for (int elem : array) {
            System.out.print(elem + "; ");
        }
    }

}


