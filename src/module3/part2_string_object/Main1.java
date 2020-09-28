package module3.part2_string_object;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String s;
        s = textInputer("Type string");
        solver(s);

    }
    private static String textInputer(String sIn){
        System.out.print(sIn + ": >>");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;

    }
    private static void solver(String s){
        char[]chars = s.toCharArray();
        int max;
        max = 0;
        int pointer;
        pointer = 0;
        char pattern = ' ';
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == pattern){
                pointer++;
                if (pointer > max){
                    max = pointer;
                }
            }
            else pointer = 0;
        }


        System.out.println("maximum: " + max);

    }

}
