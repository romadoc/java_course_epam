package com.epam.advancedcourse.gitdemo;

import java.util.Scanner;

public class GitDemo {
   private String userName = getNameFromConsole();
   public void printGreeting() {
       System.out.println("Hello, " + userName);
   }
   public String getNameFromConsole() {
       Scanner scanner = new Scanner(System.in);
       String invitation = "print you name >>";
       System.out.print(invitation);
       while (!scanner.hasNextLine()) {
           System.out.print(invitation);
           scanner.next();
       }
       return scanner.nextLine();
   }
}
