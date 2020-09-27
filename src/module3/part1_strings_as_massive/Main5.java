package module3.part1_strings_as_massive;
/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить. Использовать массив char-ов.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        String s;
        s = " string test  space remover  hope i   can do it ";
        printString("start string", s);
        solver(s);

    }

    private static List<Character> trimmer(char[]charsIn) {
        List<Character>list = new ArrayList<>();
            for (int i = 0; i < charsIn.length; i++) {
                if (!isCharSpace(charsIn[i])) {
                    list.add(charsIn[i]);

                }
            }
      return list;
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
        String result = "";

        //List<List<String>>joinList = Arrays.<String>asList(characterList);
        ArrayList<ArrayList>listOfList = new ArrayList<>();


        for(int i = 0; i < arrayString.length; i++){
           if(trimmer(arrayString[i].toCharArray()).size() > 0) {
              //result = result + trimmer(arrayString[i].toCharArray());
              listOfList.add((ArrayList) trimmer(arrayString[i].toCharArray()));
           }
        }

        listOfList.removeAll(Arrays.asList(null, " "));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listOfList.size(); i++){
            for(int j = 0; j <= listOfList.get(i).size(); j++ )

               // stringBuilder.append(listOfList.get(i)).append(" ") ;
                result = result + String.valueOf(listOfList.get(j).toString());



        }
       // result = stringBuilder.toString();
      //  result = String.valueOf(stringBuilder);


        System.out.print(result);
    }
}
