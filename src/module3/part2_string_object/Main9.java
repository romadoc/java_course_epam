package module3.part2_string_object;

import java.util.Scanner;

/*
 Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class Main9 {
    public static void main(String[] args) {
        String s = stringInput("type string:>>");
        String latinCharacters = latinFinder(s);
        solver(latinCharacters);

    }
    private static String stringInput(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
    private static String latinFinder(String s){

        char[]chars = s.toCharArray();
        String s1="";
        for(int i = 0; i < chars.length; i++) {
           if (chars[i] < 123){
               s1 = s1 + chars[i];
           }
        }
        return s1;
    }
    private static void solver(String s){
       int lowerCase = 0;
       int upperCase = 0;
       char[]chars = s.toCharArray();
       for(int i = 0; i < chars.length; i++){
           if(Character.isUpperCase(chars[i])){
               upperCase++;
           }
           if(Character.isLowerCase(chars[i])){
               lowerCase++;
           }
       }
        System.out.println();
        System.out.println("lower cases: " + lowerCase);
        System.out.println("upper cases: " + upperCase);
    }
}
