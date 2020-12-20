package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * task 11 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main11 {
    public static void main(String[] args) {
        int x;
        int y;
        x = ScannerUtil.integerIn("type first digit");
        y = ScannerUtil.integerIn("type second digit");
        List<Integer> list = createlist(x);
        List<Integer>list1 = createlist(y);
        compareLists(list, list1);
    }
    private static List<Integer> createlist(int a){
        List<Integer>list = new ArrayList<>();
        while ( a!=0 ){
            list.add(a % 10);
            a /=10;

        }
        return list;
    }

    private static void compareLists(List<Integer>list, List<Integer>list1){
        if (list.size()>list1.size()){
            System.out.print("the size of the 1-st number is greater");
        }
        if(list1.size()>list.size()){
            System.out.print("the size of the 2-nd number is greater");
        }else System.out.println("sizes 1-st and 2-nd are equal");
    }
}
