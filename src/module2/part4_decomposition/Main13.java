package module2.part4_decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Два простых числа называются «близнецами», если они отличаются друг от друга на 2
 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное
число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Main13 {

    public static void main(String[] args) {
        int n;
        n = inputDigit("type digit :>");
        List<Integer>list = arrayConstructor(n);
        printArray(list, "Start Array: ");
        solver(list, n, "solution: >");


    }
    private static int inputDigit(String s){
        System.out.print(s);
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            System.out.print(s);
            scanner.next();

        }
        x = scanner.nextInt();
        return x;
    }
    private static List<Integer> arrayConstructor(int n){
        List<Integer>list = new ArrayList<>();
        for(int i = 0; i < n*2; i++){
            list.add(i+1);

        }
        return list;
    }
    private static void printArray(List<Integer>listIn, String s){
        System.out.print(s);
        for (int elem: listIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }
    private static void solver(List<Integer>list, int n, String s){
        int startIndex = n-1;
        int endIndex = startIndex*2;
        for (int i = startIndex; i < endIndex; i++){
            System.out.print(list.get(i) + "-" + list.get(i+2) + "; ");
        }
    }
}
