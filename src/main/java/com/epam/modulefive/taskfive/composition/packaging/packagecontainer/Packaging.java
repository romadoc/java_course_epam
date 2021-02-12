package com.epam.modulefive.taskfive.composition.packaging.packagecontainer;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;
import com.epam.modulefive.taskfive.composition.packaging.PackagingVariant;

public abstract class Packaging {
    private ColourVariant colourVariant;
    private PackagingVariant packagingVariant;

    public void setColourVariant(ColourVariant colourVariant) {
        this.colourVariant = colourVariant;
    }

    public PackagingVariant getPackagingVariant() {
        return packagingVariant;
    }

    public void setPackagingVariant(PackagingVariant packagingVariant) {
        this.packagingVariant = packagingVariant;
    }

    @Override
    public String toString() {
        return "Packaging: " + "colour - " + colourVariant + ", type - " + packagingVariant + "; ";
    }
}
