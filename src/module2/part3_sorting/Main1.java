package module2.part3_sorting;

/*
 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

import java.util.Scanner;

public class Main1 {
    static int fill1Array = 10;

    public static void main(String[] args) {
        int k;
        int length1;
        int[] arrayFirst = arrayConstructor1();
        int[] arraySec = arrayConstructor2();

        length1 = arrayFirst.length;
        k = inputK("Type K >>", length1);
        int[] comboArray = comboConstructor(arrayFirst, arraySec, k);
        printArray(comboArray, "result: ");

    }
    private static int[] arrayConstructor1(){
        int n;
        int [] array = new int[50];
        for(int i = 0; i < fill1Array; i++){
            array[i] = i+1;

        }

        return array;
    }
    private static int[] arrayConstructor2(){

        int [] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1)*10;

        }
        return array;
    }
    private static int inputK(String s, int length){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println();
            System.out.print(s);
        }

        x = scanner.nextInt();
        if (x > 0 && x < length){
            y = x;
        }

        System.out.println("k = " + y);
        return y;
    }
    private static void printArray(int [] arrayIn, String s){
        System.out.print(s);
        for (int i = 0; i < arrayIn.length; i++){
            System.out.print(arrayIn[i] + "; ");
        }
        System.out.println();
    }
    private static int[] comboConstructor(int[]array1, int[]array2, int k){
        int[]arrayCom = array1;

        int coef = (fill1Array+array2.length) - (k+1);

            for (int j = k + 1; j < fill1Array; j++) {
                 array1[coef] = array1[j];
                 coef = coef + 1;

        }   for (int i = 0; i < array2.length; i++){

                array1[(k+1)+i] = array2[i];
        }

        return arrayCom;
    }
}
