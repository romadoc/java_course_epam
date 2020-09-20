package module2.part4_decomposition;
/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

import java.util.ArrayList;
import java.util.List;

public class Main17 {
    public static void main(String[] args) {
        int n;
        n = (int)(Math.random()*5000);
        List<Integer>list = disintegrator(n);
        int sum = summator(list);

        System.out.println("start digit: " + n);
        System.out.println("digits: " + list);
        System.out.println("sum of digits: " + sum);
        System.out.println("*****************************");
        System.out.println("results: ");
        solver(n);

    }

    private static List<Integer>disintegrator(int x){
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;

        }
        return list;
    }

    private static int summator(List<Integer>list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = list.get(i) + sum;
        }
        return sum;
    }


    private static void solver(int digitIn){
     int counter = 0;
        System.out.print(digitIn + "; ");
        int a = digitIn;

     while (a !=0){
         a = a - summator(disintegrator(a));
         System.out.print(a +"; ");
         counter++;
     }
        System.out.println();
        System.out.println("interations: " + counter);
    }

}
