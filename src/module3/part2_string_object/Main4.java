package module3.part2_string_object;

import java.util.ArrayList;
import java.util.List;

/*
 С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Main4 {
    public static void main(String[] args) {
        String start = "информатика";
        String result = "";
        result = solver(start, result);
        System.out.println(result);
    }
    private static String solver(String s, String dist){

        char[]chars = new char[4];
        s.getChars(7,8,chars,0);
        s.getChars(3,5, chars, 1);
        s.getChars(7,8,chars,3);
        for (int i = 0; i < chars.length; i++){
            dist = dist + chars[i];
        }

        return dist;
    }

}


