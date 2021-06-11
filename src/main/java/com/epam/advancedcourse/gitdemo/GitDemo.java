package com.epam.advancedcourse.gitdemo;

import java.util.Scanner;

public class GitDemo {
    private String userName = getName();
    public void printGreeting () {
        System.out.println("Hello, " + userName);
    }
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String invitation = "print you name >>";
        String name;
        System.out.print(invitation);
        while (!scanner.hasNextLine()) {
            System.out.println(invitation);
            scanner.next();
        }
        name = scanner.nextLine();

        return name;
    }
}
