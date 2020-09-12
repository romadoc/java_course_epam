package module2.part4_decomposition;

import java.util.Scanner;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Main6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = inputDigit("type \"a\": >");
        b = inputDigit("type \"b\": >");
        c = inputDigit("type \"c\": >");
        desition(a, b, c);


    }
    private static int greatCommonFinder(int a, int b){
        int rezult = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            rezult = a + b;
        }

        return rezult;
    }
    private static void desition(int a, int b, int c){
        String s = "Answer: ";
        if (greatCommonFinder(greatCommonFinder(a, b), c) == 1){
            s = s + "These numbers are inter-prime";
        }else {
            s = s + "These numbers are not inter-prime";
        }
        System.out.println(s);
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

}
