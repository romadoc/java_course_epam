package module2.part4_decomposition;
/*
 Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Main7 {
    public static void main(String[] args) {
      int[]array = startArrayConstructor();
      factorialSum(array, "Factorial's sum (1...9): ");

    }

    private static int[] startArrayConstructor(){
        int[] array = new int[9];
        for (int i = 0; i < array.length; i ++){
            array[i] = i+1;

        }
        return array;
    }

    private static int factorialCounter(int a){
        int rezult = 1;
        for(int i = 1; i < a; i++){
            rezult = rezult * i;
        }
        return rezult;

    }private static void factorialSum(int[]arrayIn, String s){
        int sum = 0;
        for (int i = 0; i < arrayIn.length; i++){
            sum = sum + factorialCounter(arrayIn[i]);
        }
        System.out.print(s + sum);
    }
}



