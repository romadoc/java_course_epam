package com.epam.modulefive.taskfour.dragonshop;

import com.epam.modulefive.taskfour.dragoncave.Dragon;
import com.epam.modulefive.taskfour.dragonshop.Buyer;
import com.epam.utils.ScannerUtil;

public class Invoice {

    public static void createInvoice(Dragon.DragonCave dragonCave) {

        int stop = 1;
        while (stop != 0 && dragonCave.getTreasures().size() > 0) {
            int treasureId = ScannerUtil.integerIn("type id of chosen treasure");
            Buyer buyer = new Buyer();
            buyer.makeDeal(treasureId, dragonCave.getTreasures());
            stop = ScannerUtil.integerIn("continue? (yes - type any digit, no - type \"0\")");
            if (dragonCave.getTreasures().size() < 1) {
                System.out.println("*********************************************************");
                System.out.println("* No treasures to choose. Thanks for your shopping! By! *");
                System.out.println("*********************************************************");
            }
            if (stop >= 1) {
                dragonCave.showAllTreasures();
            }
        }
    }
}
