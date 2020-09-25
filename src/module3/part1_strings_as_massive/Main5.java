package module3.part1_strings_as_massive;
/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить. Использовать массив char-ов.
 */

public class Main5 {
    public static void main(String[] args) {
        String s;
        s = " string test  space remover  hope i   can do it ";
        printString("start string", s);
        solver(s);


    }

    private static String trimmer(char[]charsIn) {
        String s1 = "";

        for (int i = 0; i < charsIn.length; i++) {
            if (!isCharSpace(charsIn[i])) {
                s1 = s1 + charsIn[i];
            }

        }
      return s1;
    }

    private static boolean isCharSpace(char ch) {
        boolean isSpace = false;
        if (ch == ' ') {
            isSpace = true;
        }
        return isSpace;
    }

    private static void printString(String answer, String stringIn) {

        System.out.println(answer + ": >>" + stringIn);
    }
    private static void solver(String s){
        String[]arrayString = s.split(" ");
        String string = "";

        for(int i = 0; i < arrayString.length; i++){
           string = string + " " + trimmer(arrayString[i].toCharArray());
        }
        System.out.print(string);
    }
}
