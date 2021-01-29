package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2
 *  (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное
 * число больше 2. Для решения задачи использовать декомпозицию.
 * task 13 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main13 {
    public static void main(String[] args) {
        int n;
        n = ScannerUtil.integerIn("type digit");
        List<Integer>list = createList(n);
        printArray(list, "Start Array: ");
        getSolution(list, n, "solution: >");
    }

    private static List<Integer> createList(int n){
        List<Integer>list = new ArrayList<>();
        for(int i = 0; i < n*2; i++){
            list.add(i+1);
        }
        return list;
    }

    private static void printArray(List<Integer>listIn, String s){
        System.out.print(s);
        for (int elem: listIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }

    private static void getSolution(List<Integer> list, int n, String s){
        int startIndex = n-1;
        int endIndex = startIndex*2;
        for (int i = startIndex; i < endIndex; i++){
            System.out.print(list.get(i) + "-" + list.get(i+2) + "; ");
        }
    }
}
