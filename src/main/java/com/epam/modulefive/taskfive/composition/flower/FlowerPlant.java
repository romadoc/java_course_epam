package com.epam.modulefive.taskfive.composition.flower;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;
import com.epam.modulefive.taskfive.composition.flower.flowercontainer.*;

public class FlowerPlant {
//Получаем цветок нужного вида и цвета
   public Flower takeFlowerForMakingSetOfFlower(FlowerType flowerType, ColourVariant colourVariant) {
       Flower flower = null;
       switch (flowerType) {
           case ROSE:
               flower = new Rose();
               flower.setColourVariant(colourVariant);
               break;
           case LILY:
               flower = new Lily();
               flower.setColourVariant(colourVariant);
               break;
           case ASTER:
               flower = new Aster();
               flower.setColourVariant(colourVariant);
               break;
           case CLOVE:
               flower = new Clove();
               flower.setColourVariant(colourVariant);
               break;
           case GERBERA:
               flower = new Gerbera();
               flower.setColourVariant(colourVariant);
               break;
       }
       return flower;
   }
}
