package com.epam.modulefive.taskfour.dragoncave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Дракон и его сокровища. ракон и его сокровища. Создать программу, позволяющую обрабатывать
 * сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность
 * просмотра сокровищ,
 * выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму
 */

public class Dragon {

    public static void greetVisitor() {
        System.out.println("******************************************************************************");
        System.out.println("Welcome traveler! You have passed the tests and you can buy treasures from me!");
        System.out.println("******************************************************************************");
        System.out.println();
    }

   public static class DragonCave {
        private List<Treasure> treasures = new ArrayList<>();
        private List<Treasure> treasuresForSort = new ArrayList<>();

        public void showAllTreasures() {
            for (Treasure treasure: treasures) {
                if (treasure != null) {
                    System.out.println(treasure);
                }
            }
        }

        public void sortTreasuresUpToLow() {
            for (Treasure tr: TreasureContainer.fillConteinerWithTreasure()) {
                if (tr != null) {
                    treasuresForSort.add(tr);
                }
            }
            Collections.sort(treasuresForSort, new Comparator<Treasure>() {
                @Override
                public int compare(Treasure treasure1, Treasure treasure2) {
                    if (treasure1.getPriceCents() > treasure2.getPriceCents()) {
                        return -1;
                    }
                    if (treasure1.getPriceCents() < treasure2.getPriceCents()) {
                        return 1;
                    }
                    return treasure1.getDescription().compareTo(treasure2.getDescription());
                }
            });
        }

        public void showMostExpensiveTreasure() {
            sortTreasuresUpToLow();
            System.out.println("Must expensive treasure is: " + treasuresForSort.get(0));
        }

        public List<Treasure> getTreasures() {
            return treasures;
        }
    }
}
