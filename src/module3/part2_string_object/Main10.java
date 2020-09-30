package module3.part2_string_object;

import java.util.Scanner;

/*
 Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class Main10 {
    public static void main(String[] args) {
        String s = stringInput("Type string:>>");
        solver(s);

    }
    private static String stringInput(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        return s1;
    }
    private static void solver(String s){
        char[]chars = s.toCharArray();
        int count = 0;
        for(int i = 1; i < chars.length; i++ ){
            if ((chars[i] == '.' || chars[i] == '!' || chars[i] == '?') && (chars[i-1] !=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
