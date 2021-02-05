package com.epam.modulefive.taskfour;

import com.epam.modulefive.taskfour.dragoncave.Dragon;
import com.epam.modulefive.taskfour.dragoncave.Treasure;
import com.epam.modulefive.taskfour.dragoncave.TreasureContainer;
import com.epam.modulefive.taskfour.dragonshop.Buyer;
import com.epam.modulefive.taskfour.dragonshop.Invoice;
import com.epam.modulefive.taskfour.menu.Menu;
import com.epam.utils.ScannerUtil;

public class DragonManager {
    public static void main(String[] args) {
        Dragon.DragonCave dragonCave = new Dragon.DragonCave();
        TreasureContainer.fillConteinerWithTreasure();
        Dragon.greetVisitor();

        for (Treasure tr: TreasureContainer.fillConteinerWithTreasure()) {
            if (tr != null) {
                dragonCave.getTreasures().add(tr);
            }
        }
        int wallet = ScannerUtil.integerIn("enter the amount you will take to my store!");
        Buyer buyer = new Buyer();
        buyer.setAmountInBuyerWallet(wallet);
        startMainMenu(dragonCave);
    }

    private static void startMainMenu(Dragon.DragonCave dragonCave) {
        int answer = Menu.showMenuToChoose();
        switch (answer) {
            case 1:
                dragonCave.showAllTreasures();
                startMainMenu(dragonCave);
                break;
            case 2:
                dragonCave.showMostExpensiveTreasure();
                startMainMenu(dragonCave);
                break;
            case 3:
                if (dragonCave.getTreasures().size() > 0) {
                    Invoice.createInvoice(dragonCave);
                }
                break;
        }
    }
}
