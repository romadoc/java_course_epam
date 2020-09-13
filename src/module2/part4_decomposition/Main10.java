package module2.part4_decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */
public class Main10 {
    public static void main(String[] args) {
        int x;
        x = inputDigit("type multiple-digit number: >");
        List<Integer>list = arrayConstructor(x);
        printArray(list, "result array");

    }
    private static int inputDigit(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.print(s);
        }
        int x = scanner.nextInt();
        return x;

    }
    private static List<Integer> arrayConstructor(int x){

       List<Integer>list = new ArrayList<>();
        while ( x!=0 ){
           list.add(x % 10);
           x /=10;

        }

        return list;
    }
    private static void printArray(List<Integer>list, String s){
        for (int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + "; ");
        }
    }

}
