package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 *  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 * task 12: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main12 {
    public static void main(String[] args) {
        int k = ScannerUtil.integerIn("Type K");
        int n = ScannerUtil.integerIn("Type N");
        List<Integer> list = createList(k, n);
        printArray(list);
    }

    private static List<Integer> createList(int k, int n) {
        List<Integer>list = new ArrayList<>();
        while (getSum(list) < k) {
            getSum(list);
            list.add((int) (Math.random() * n + 1));
            if (getSum(list) == k) {
                break;
            }
        }
        return list;
    }

    private static int getSum(List<Integer> listIn) {
        int counterSum = 0;
        for (int i = 0; i < listIn.size(); i++){
            counterSum = counterSum + listIn.get(i);
        }
        return counterSum;
    }

    private static void printArray(List<Integer> listIn) {
        System.out.print("array A : ");
        for (int elem: listIn) {
            System.out.print(elem + "; ");
        }
    }
}
