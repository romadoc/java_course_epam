package module2.part4_decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Main12 {
    public static void main(String[] args) {
        int k;
        int n;
        k = inputDigit("Type K :>");
        n = inputDigit("Type N :>");
        List<Integer>list = arrayConstructor(k, n);
        printArray(list);

    }
    private static int inputDigit(String s){

        System.out.print(s);
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.print(s);
        }
        x = scanner.nextInt();
        return x;
    }
    private static List<Integer> arrayConstructor(int k, int n){
        List<Integer>list = new ArrayList<>();

            while (sum(list)<k) {
                sum(list);
                list.add((int) (Math.random() * n + 1));
                if (sum(list) == k) {
                    break;
                }
            }

        return list;
    }
    private static int sum(List<Integer>listIn){
        int counterSum = 0;
        for (int i = 0; i < listIn.size(); i++){
            counterSum = counterSum + listIn.get(i);
        }

        return counterSum;
    }
    private static void printArray(List<Integer>listIn){
        for (int elem: listIn) {
            System.out.print(elem + "; ");
        }
    }
}
