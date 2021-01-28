package com.epam.moduletwo.arrayssimple;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.

public class Main6 {
    static int sum = 0;

    public static void main(String[] args) {
        int[] massive = new int[20];
        System.out.println("generated massive: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random()*20);
            System.out.print(" " +"["+i+"]"+ massive[i] + "; ");

        }

        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            if ( i % 2 == 0 && i != 2 ){
                massive[i] = 0;
            }
        }


        for (int i1 = 0; i1 < massive.length; i1++) {
            if (i1 % 3 == 0 && i1 != 3 || i1 == 1){
                massive[i1] = 0;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            sum = massive[i] + sum;
        }
        System.out.println();
        System.out.println("сумма значений массива, где индекс - простое число: "+sum);
    }
}
