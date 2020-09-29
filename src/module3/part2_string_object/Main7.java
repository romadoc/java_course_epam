package module3.part2_string_object;

import java.util.Scanner;

/*
 Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */
public class Main7 {
    public static void main(String[] args) {
        String s = stringInput("type string: >>");
        String stringResult = solver(spaceRemover(s));
        System.out.print("result string: " + stringResult);
    }

    private static String stringInput(String s) {
        System.out.print(s);
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;
    }

    private static String spaceRemover(String s) {
        String s1;
        char[] chars = s.toCharArray();
        char space = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != space) {
                sb.append(chars[i]);
            }
        }
        s1 = sb.toString();
        return s1;
    }

    private static String solver(String s) {
        char[] chars = s.toCharArray();
        String s1 = "";

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            StringBuilder sb1 = new StringBuilder();
            sb1.append(ch);
            if (!s1.contains(sb1)) {
                s1 = s1 + ch;
            }
        }
        return s1;
    }
}
