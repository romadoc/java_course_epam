package com.epam.modulethree.arrayofchars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить. Использовать массив char-ов.
 * task 5 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main5 {
    public static void main(String[] args) {
        String s;
        s = " string test  space remover  hope i   can do it ";
        printString("start string", s);
        solveTask(s);

    }

    private static List<Character> removeNoChars(char[] charsIn) {
        List<Character> list = new ArrayList<>();
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

    private static void solveTask(String s){
        String[]arrayString = s.split(" ");
        StringBuilder result = new StringBuilder();
        ArrayList<ArrayList> listOfList = new ArrayList<>();

        for(int i = 0; i < arrayString.length; i++) {
            if(removeNoChars(arrayString[i].toCharArray()).size() > 0) {
                listOfList.add((ArrayList) removeNoChars(arrayString[i].toCharArray()));
            }
        }

        listOfList.removeAll(Arrays.asList(null, " "));

        for (int i = 0; i < listOfList.size(); i++){
            for(int j = 0; j < listOfList.get(i).size(); j++) {
                result.append(listOfList.get(i).get(j).toString());
            }
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.print("result: >>" + result);
    }
}
