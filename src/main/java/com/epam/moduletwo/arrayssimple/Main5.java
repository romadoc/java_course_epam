package com.epam.moduletwo.arrayssimple;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Main5 {
    public static void main(String[] args) {
        int a;
        a = (int)(Math.random()*19);
        System.out.println("i = " + a);

        int[] massive = new int[20];
        System.out.println("original massive (the lengh of massive - "+massive.length+"): ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 200 - 100);

            System.out.print(" " + massive[i] + "; ");

        }
        System.out.println();
        System.out.println("list of elements ai > i (" + a + "): ");
        for (int i = a; i < massive.length; i++){
            System.out.print(" " + massive[i] + "; ");
        }
    }
}
