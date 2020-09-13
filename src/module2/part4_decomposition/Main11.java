package module2.part4_decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Main11 {
    public static void main(String[] args) {
        int x;
        int y;
        x = inputDigit("type first digit:>");
        y = inputDigit("type second digit:>");
        List<Integer>list = listConstructor(x);
        List<Integer>list1 = listConstructor(y);
        comparer(list, list1);


    }
    private static List<Integer> listConstructor(int x){
        List<Integer>list = new ArrayList<>();
        while ( x!=0 ){
            list.add(x % 10);
            x /=10;

        }
        return list;
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
    private static void comparer(List<Integer>list, List<Integer>list1){
        if (list.size()>list1.size()){
            System.out.print("the size of the 1-st number is greater");
        }
        if(list1.size()>list.size()){
            System.out.print("the size of the 2-nd number is greater");
        }else System.out.println("sizes 1-st and 2-nd are equal");
    }
}
