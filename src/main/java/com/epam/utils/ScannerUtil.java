package com.epam.utils;

import java.util.Scanner;

/**
 * class for entering dates
 * int; long; float; double; string
 * using: youVariable = ScannerUtil.necessaryMethod("text of invitation")
 */
public final class ScannerUtil {

    private ScannerUtil(){
        //preventing instance creation
    }

    public static int integerIn(String s){
        s = getString(s);
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println(s);
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }

    public static long longIn(String s){
        s = getString(s);
        long x = 0L;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLong()){
            System.out.println(s);
            scanner.next();
        }
        x = scanner.nextLong();
        return x;
    }

    public static float floatIn(String s){
        getString(s);
        float x = 0F;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()){
            System.out.println(s);
            scanner.next();
        }
        x = scanner.nextFloat();
        return x;
    }

    public static double doubleIn(String s){
        getString(s);
        double x = 0D;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            System.out.println(s);
            scanner.next();
        }
        x = scanner.nextDouble();
        return x;
    }

    public static String stringIn(String s){
        getString(s);
        String string = "";
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()){
            System.out.println(s);
            scanner.next();
        }
        string = scanner.nextLine();
        return string;
    }

    private static String getString(String s) {
        s = s + " >>";
        System.out.print(s);
        return s;
    }
}
