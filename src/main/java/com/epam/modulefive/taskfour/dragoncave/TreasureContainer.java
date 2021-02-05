package com.epam.modulefive.taskfour.dragoncave;

public class TreasureContainer {

    public static Treasure[] fillConteinerWithTreasure() {
        Treasure[] treasuresArray = new Treasure[100];

        Treasure treasure = new Treasure();
        treasure.setiD(0);
        treasure.setTreasureName("dagger");
        treasure.setDescription("iron dagger");
        treasure.setPriceCents(200);
        treasuresArray[0] = treasure;

        Treasure treasure1 = new Treasure();
        treasure1.setiD(1);
        treasure1.setTreasureName("magic sword");
        treasure1.setDescription("destructive force is about 200 level");
        treasure1.setPriceCents(1100);
        treasuresArray[1] = treasure1;

        Treasure treasure2 = new Treasure();
        treasure2.setiD(2);
        treasure2.setTreasureName("fly carpet");
        treasure2.setDescription("speed 200miles per hour. altitude 1.5 miles");
        treasure2.setPriceCents(500);
        treasuresArray[2] = treasure2;

        Treasure treasure3 = new Treasure();
        treasure3.setiD(3);
        treasure3.setTreasureName("poisoned dagger");
        treasure3.setDescription("very dangerous tool");
        treasure3.setPriceCents(300);
        treasuresArray[3] = treasure3;

        Treasure treasure4 = new Treasure();
        treasure4.setiD(4);
        treasure4.setTreasureName("magic hat invisible");
        treasure4.setDescription("allows you to become invisible");
        treasure4.setPriceCents(700);
        treasuresArray[4] = treasure4;

        Treasure treasure5 = new Treasure();
        treasure5.setiD(5);
        treasure5.setTreasureName("magic ring");
        treasure5.setDescription("it is a great secret");
        treasure5.setPriceCents(750);
        treasuresArray[5] = treasure5;

        return treasuresArray;
    }
}
