package com.epam.modulefive.taskfive;

import com.epam.modulefive.taskfive.composition.Composition;
import com.epam.modulefive.taskfive.composition.colour.ColourVariant;
import com.epam.modulefive.taskfive.composition.flower.FlowerSet;
import com.epam.modulefive.taskfive.composition.flower.flowercontainer.FlowerType;
import com.epam.modulefive.taskfive.composition.packaging.PackagingPlant;
import com.epam.modulefive.taskfive.composition.packaging.PackagingVariant;
import com.epam.modulefive.taskfive.composition.packaging.packagecontainer.Packaging;
import com.epam.utils.ScannerUtil;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Manager {

    Composition composition = new Composition();


    public void showFlowers() {
        System.out.println("Available flowers:");
        FlowerType[] flowerTypes = FlowerType.class.getEnumConstants();
        int i = 1;
        for (FlowerType flowerType: flowerTypes) {
            System.out.println(i + " " + flowerType);
            i++;
        }
    }

    public void showPackagingVariants() {
        System.out.println("Available packaging types:");
        PackagingVariant[] packagingVariants = PackagingVariant.class.getEnumConstants();
        int i = 1;
        for (PackagingVariant variant: packagingVariants) {
            System.out.println(i + " " + variant);
            i++;
        }
    }

    public void showColours() {
        System.out.println("Available colours:");
        ColourVariant[] colourVariants = ColourVariant.class.getEnumConstants();
        int i = 1;
        for (ColourVariant variant: colourVariants) {
            System.out.println(i + " " + variant);
            i++;
        }
    }

    public void addFlowerSet() {
        showFlowers();
        System.out.println("choose code of a flower for creating a set");
        FlowerType flowerType = selectFlowerType(typeFlowerCode("type code of flower"));
        int quantityOfFolowers = ScannerUtil.integerIn("type quantity of select flower in you set");

        System.out.print("now choose a colour of selected flower");
        showColours();
        ColourVariant colourVariant = chooseColour(typeColorCode("type colour code"));

        FlowerSet flowerSet = new FlowerSet(quantityOfFolowers, flowerType, colourVariant);

        composition.addFlowerSetToComposition(flowerSet);
    }

    public void createPackageOfComposition() {
        PackagingPlant packagingPlant = new PackagingPlant();
        Packaging pack;

        showPackagingVariants();
        System.out.print("choose a code of packaging");
        PackagingVariant packagingVariant = choosePackaging(typePackageCode("type package code"));

        showColours();
        System.out.print("choose a colour of selected package");
        ColourVariant colourVariant = chooseColour(typeColorCode("type colour code"));

        pack = packagingPlant.takePackageVariantForComposition(packagingVariant, colourVariant);
        composition.setPackagingPartOfComposition(pack);
    }

    public void printComposition() {
        composition.showComposition();
    }

    private FlowerType selectFlowerType(int typeOfFlowerCode) {
        FlowerType flowerType = null;
        switch (typeOfFlowerCode) {
            case 1:
                flowerType = FlowerType.ROSE;
                break;
            case 2:
                flowerType = FlowerType.CLOVE;
                break;
            case 3:
                flowerType = FlowerType.GERBERA;
                break;
            case 4:
                flowerType = FlowerType.LILY;
                break;
            case 5:
                flowerType = FlowerType.ASTER;
                break;
        }
        return flowerType;
    }

    private ColourVariant chooseColour(int codeColour) {
        ColourVariant colourVariant = null;
        switch (codeColour) {
            case 1:
                colourVariant = ColourVariant.RED;
                break;
            case 2:
                colourVariant = ColourVariant.DARK_RED;
                break;
            case 3:
                colourVariant = ColourVariant.PINK;
                break;
            case 4:
                colourVariant = ColourVariant.YELLOW;
                break;
            case 5:
                colourVariant = ColourVariant.WHITE;
                break;
        }
        return colourVariant;
    }

    private PackagingVariant choosePackaging(int packagingCode) {
        PackagingVariant packagingVariant = null;
        switch (packagingCode) {
            case 1:
                packagingVariant = PackagingVariant.PAPER;
                break;
            case 2:
                packagingVariant = PackagingVariant.CRAFT;
                break;
            case 3:
                packagingVariant = PackagingVariant.GRID;
                break;
            case 4:
                packagingVariant = PackagingVariant.CELLOPHANE;
                break;
        }
        return packagingVariant;
    }

    private int typeFlowerCode(String string) {
        string = string + " >>";
        System.out.println(string);
        FlowerType[] flowerTypes = FlowerType.class.getEnumConstants();
        int min = 1;
        int max = flowerTypes.length;
        String s = "";
        Pattern pattern = Pattern.compile("[" + min + "-" + max + "]");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(pattern)) {
            System.out.print(string);
            scanner.next();
        }
        s = scanner.next();
        return Integer.parseInt(s);
    }

    private int typeColorCode(String string) {
        string = string + " >>";
        System.out.println(string);
        ColourVariant[] colourVariants = ColourVariant.class.getEnumConstants();
        int min = 1;
        int max = colourVariants.length;
        String s = "";
        Pattern pattern = Pattern.compile("[" + min + "-" + max + "]");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(pattern)) {
            System.out.print(string);
            scanner.next();
        }
        s = scanner.next();
        return Integer.parseInt(s);
    }

    private int typePackageCode(String string) {
        string = string + " >>";
        System.out.println(string);
        PackagingVariant[] packagingVariants = PackagingVariant.class.getEnumConstants();
        int min = 1;
        int max = packagingVariants.length;
        String s = "";
        Pattern pattern = Pattern.compile("[" + min + "-" + max + "]");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(pattern)) {
            System.out.print(string);
            scanner.next();
        }
        s = scanner.next();
        return Integer.parseInt(s);
    }
}
