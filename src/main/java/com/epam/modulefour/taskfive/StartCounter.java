package com.epam.modulefour.taskfive;

import com.epam.utils.ScannerUtil;

import java.util.Scanner;

public class StartCounter {
    public static void main(String[] args) throws InterruptedException {
       Counter counter = new Counter();
       String flag = inputDirectionOfCount();
       counter.startCounter(flag);
       counter.startCounter(inputDirectionOfCount(),
                            ScannerUtil.integerIn("Type int maxValue"),
                            ScannerUtil.integerIn("Type int minValue"));
    }



    public static String inputDirectionOfCount(){
        String string = "type \"+\" for UpCounting or \"-\" for DownCounting >>";
        System.out.print(string);
        String flag;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()){
            System.out.print(string);
        }
        flag = scanner.nextLine();
        return flag;
    }
}
