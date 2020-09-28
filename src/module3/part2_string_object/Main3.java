package module3.part2_string_object;
/*
    Проверить, является ли заданное слово палиндромом.
 */

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
       String s = insertWord("type word:>>");
       char[]directChars = arrayConstructor(s);
       char[]reversedChars = arrayReverseConstructor(s);
       solver(directChars, reversedChars);
    }
    private static String insertWord(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        String s1 = scanner.nextLine();
        return s1;
    }
    private static char[] arrayConstructor(String s){
        s = s.toLowerCase();
        s = s.trim();
        char[]chars = s.toCharArray();
        return chars;
    }
    private static char[] arrayReverseConstructor(String s){
        s = s.toLowerCase();
        s = s.trim();
        char[]chars = s.toCharArray();
        int n = chars.length;
        char temp;
        for(int i = 0; i < n/2; i++){
            temp = chars[n-i-1];
            chars[n-i-1] = chars[i];
            chars[i] = temp;
        }
       return chars;
    }
    private static void solver(char[]dchars, char[]rchars){
        int isPalindrom = 0;
        for(int i = 0; i<dchars.length; i++){
            if(dchars[i] == rchars[i]){
                isPalindrom = 0;
                isPalindrom = isPalindrom + isPalindrom;

            } else if(!(dchars[i] == rchars[i])){
                isPalindrom = 1;
                isPalindrom += isPalindrom;
            }
        }
        if (isPalindrom == 0){
            System.out.println("it is palindrom");
        }else System.out.println("it is non palibdrom");
    }
}
