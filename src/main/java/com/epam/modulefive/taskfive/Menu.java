package com.epam.modulefive.taskfive;

import com.epam.modulefive.taskfive.composition.flower.flowercontainer.FlowerType;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    Manager manager = new Manager();

    public void makeChooseToCreateComposition() {
        int choose = 0;
        while (choose != 3) {
            choose = validateInputInMenu("type choosen variant 1 - add flowerset to composition "
                    + "2 - choose package 3 - finish >>");
            switch (choose) {
                case 1:
                    manager.addFlowerSet();
                    manager.printComposition();
                    break;
                case 2:
                    manager.createPackageOfComposition();
                    manager.printComposition();
                    break;

            }
        }
    }

    private int validateInputInMenu(String startString) {

        System.out.print(startString);
        FlowerType[] flowerTypes = FlowerType.class.getEnumConstants();
        int min = 1;
        int max = 3;
        String s = "";
        Pattern pattern = Pattern.compile("[" + min + "-" + max + "]");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(pattern)) {
            System.out.print(startString);
            scanner.next();
        }
        s = scanner.next();
        int chooseVar;
        chooseVar = Integer.parseInt(s);
        return chooseVar;
    }
}
