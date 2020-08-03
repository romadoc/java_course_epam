package module1.part3_cycle;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Main8 {
    static long a;
    static long b;

    public static void main(String[] args) {


        a = input("введите первое число >>");
        b = input("введите второе число >>");
        comparemant(a, b);

    }

    public static long input(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(message);
        }
        int digit = scanner.nextInt();
        return digit;
    }

    public static void comparemant(long a, long b) {
        String string;
        String string1;
        string = Long.toString(Math.abs(a));
        string1 = Long.toString(Math.abs(b));
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            for (int j = 0; j < string1.length(); j++) {
                if (symbol == string1.charAt(j)) {
                    stringBuilder.append(" " + symbol + " ");
                    break;
                }
            }
        }
        System.out.println("В обоих числах содержатся: " + stringBuilder.toString());

    }

}



