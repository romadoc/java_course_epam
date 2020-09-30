package module3.part2_string_object;

import java.util.Scanner;

/*
 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */
public class Main8 {
    public static void main(String[] args) {
        String s = stringInput("type string: >>");
        System.out.println("the most long word is: " + maxWordFinder(s));

    }

    private static String stringInput(String s) {
        System.out.print(s);
        String sInput;
        Scanner scanner = new Scanner(System.in);
        sInput = scanner.nextLine();

        return sInput;
    }

    private static String maxWordFinder(String s) {
        String[] strings = s.split(" ");
        String maximum = strings[0];
        for (int i = 0; i < strings.length; i++) {

            if (maximum.length() < strings[i].length()) {
                maximum = strings[i];
            }

        }
        return maximum;
    }
}
