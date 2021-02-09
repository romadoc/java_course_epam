package com.epam.modulefive.taskfive.composition.flower;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;
import com.epam.modulefive.taskfive.composition.flower.flowercontainer.Flower;
import com.epam.modulefive.taskfive.composition.flower.flowercontainer.FlowerType;

import java.util.Arrays;
import java.util.Objects;

public class FlowerSet {
    //собираем набор из определенного цветка, определенного цвета и количества
    private int quantityOfFlowers;
    private FlowerType flowerType;
    private ColourVariant colourVariant;
    private Flower[] flowerSet = new Flower[quantityOfFlowers];

    public FlowerSet(int quantityOfFlowers, FlowerType flowerType, ColourVariant colourVariant) {
        this.quantityOfFlowers = quantityOfFlowers;
        this.flowerType = flowerType;
        this.colourVariant = colourVariant;
    }

    public Flower[] createSetOfFlovers() {

        for (Flower fl: flowerSet) {
            FlowerPlant flowerPlant = new FlowerPlant();
            fl = flowerPlant.takeFlowerForMakingSetOfFlower(flowerType, colourVariant);
        }
       return flowerSet;
    }

    public int getQuantityOfFlowers() {
        return quantityOfFlowers;
    }

    public void setQuantityOfFlowers(int quantityOfFlowers) {
        this.quantityOfFlowers = quantityOfFlowers;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public ColourVariant getColourVariant() {
        return colourVariant;
    }

    public void setColourVariant(ColourVariant colourVariant) {
        this.colourVariant = colourVariant;
    }

    public Flower[] getFlowerSet() {
        return flowerSet;
    }

    public void setFlowerSet(Flower[] flowerSet) {
        this.flowerSet = flowerSet;
    }

    @Override
    public String toString() {
        return " Flower(s): " + flowerType +" ("+ quantityOfFlowers + "), colour- " + colourVariant + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerSet flowerSet1 = (FlowerSet) o;
        return quantityOfFlowers == flowerSet1.quantityOfFlowers &&
                flowerType == flowerSet1.flowerType &&
                colourVariant == flowerSet1.colourVariant &&
                Arrays.equals(flowerSet, flowerSet1.flowerSet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(quantityOfFlowers, flowerType, colourVariant);
        result = 31 * result + Arrays.hashCode(flowerSet);
        return result;
    }
}
