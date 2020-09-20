package module2.part4_decomposition;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

 */
public class Main15 {
    public static void main(String[] args) {
        int[] array = arrayRundomGenerator(20);
        printArray(array, "start array");

        solver(array);
    }

    private static int[] arrayRundomGenerator(int x) {
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5000);
        }
        return array;
    }

    private static void printArray(int[] arrayIn, String s) {
        System.out.print(s + ": ");
        for (int elem : arrayIn) {
            System.out.print(elem + "; ");
        }
    }

    private static void solver(int[] arrayIn) {
        System.out.println();
        System.out.print("Answer: ");
        for (int i = 0; i < arrayIn.length; i++) {
            List<Integer> list = arrayConstructor(arrayIn[i]);
            boolean flag = true;
            for (int j = 1; j < list.size(); j++) {


                if (list.get(j) <= list.get(j - 1)) {
                    flag = false;

                    break;
                }

            }
            if (flag) {
                System.out.print(" ");
                for (int k = 0; k < list.size(); k++) {
                    System.out.print(list.get(k));
                }
            }


        }

    }

    private static List<Integer> arrayConstructor(int x) {

        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;

        }
        Collections.reverse(list);
        return list;
    }

}
