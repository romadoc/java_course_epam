package com.epam.modulefive.taskfive.composition;


import com.epam.modulefive.taskfive.composition.flower.FlowerSet;
import com.epam.modulefive.taskfive.composition.packaging.packagecontainer.Packaging;

import java.util.ArrayList;
import java.util.List;

public class Composition {

    private Packaging packagingPartOfComposition;
    private List<FlowerSet> flowerPartOfComposition = new ArrayList<>();

    public void addFlowerSetToComposition(FlowerSet flowerSet) {
        flowerPartOfComposition.add(flowerSet);
    }

    public void showComposition() {
        System.out.println(packagingPartOfComposition + " " + flowerPartOfComposition);
    }

    public void setPackagingPartOfComposition(Packaging packagingPartOfComposition) {
        this.packagingPartOfComposition = packagingPartOfComposition;
    }
}
