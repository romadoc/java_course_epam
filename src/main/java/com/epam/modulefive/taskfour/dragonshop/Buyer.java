package com.epam.modulefive.taskfour.dragonshop;

import com.epam.modulefive.taskfour.dragoncave.Treasure;

import java.util.ArrayList;
import java.util.List;

public class Buyer {

    private static int amountInBuyerWallet;
    private static List<Treasure> basket = new ArrayList<>();

    public int getAmountInBuyerWallet() {
        return amountInBuyerWallet;
    }

    public void setAmountInBuyerWallet(int amountInBuyerWallet) {
        Buyer.amountInBuyerWallet = amountInBuyerWallet;
    }

    public void makeDeal(int choosenIdTreasure, List<Treasure> dragTr) {
        for (int i = 0; i < dragTr.size(); i++) {
           if (dragTr.get(i).getiD() == choosenIdTreasure) {
                choosenIdTreasure = i;
           }
        }
        Basket basket = new Basket();
        basket.buyTreasure(choosenIdTreasure, dragTr);
    }

    private static class Basket {

        private void buyTreasure(int choosenIdTreasure, List<Treasure> treasures) {

            System.out.println("*********************");
               if (isOKwithBuyersMoney(choosenIdTreasure, treasures)) {
                   amountInBuyerWallet = amountInBuyerWallet - treasures.get(choosenIdTreasure).getPriceCents();
                   System.out.println("you bought id - " + treasures.get(choosenIdTreasure).getiD()
                                                         + ", "
                                                         + treasures.get(choosenIdTreasure).getTreasureName()
                                                         + ", " + treasures.get(choosenIdTreasure).getPriceCents()
                                                         + " centes");
                   System.out.println("  available amount in the wallet: " + amountInBuyerWallet + " centes");
                   basket.add(treasures.get(choosenIdTreasure));
                   treasures.remove(choosenIdTreasure);


            } else {
                System.out.println("not enough money in you wallet");
            }
            System.out.println();
            System.out.println("you have already chosen:");
            for (Treasure treasure : basket) {
                System.out.println(treasure.getTreasureName() + " "
                        + treasure.getPriceCents()
                        + " cents");
            }
        }

        private boolean isOKwithBuyersMoney(int choosenIdTreasure, List<Treasure> treasures) {
            boolean isMoneyOK = false;
            if (amountInBuyerWallet >= treasures.get(choosenIdTreasure).getPriceCents() && treasures.size() > 0) {
                isMoneyOK = true;
            }
            return isMoneyOK;
        }
    }
}
