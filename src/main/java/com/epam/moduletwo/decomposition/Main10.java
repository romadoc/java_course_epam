package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 * task 10 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main10 {
    final static String RESULT = "result array: ";
    public static void main(String[] args) {
        int x = ScannerUtil.integerIn("type multiple-digit number");
        List<Integer> list = createArray(x);
        printArray(list);
    }

    private static List<Integer> createArray(int x) {

        List<Integer> list = new ArrayList<>();
        while ( x != 0 ) {
            list.add(x % 10);
            x /= 10;
        }
        return list;
    }

    private static void printArray(List<Integer> list) {
        System.out.print(Main10.RESULT);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "; ");
        }
    }
}
