package com.epam.modulefive.taskfive.composition.packaging;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;
import com.epam.modulefive.taskfive.composition.packaging.packagecontainer.*;

public class PackagingPlant {
    public Packaging takePackageVariantForComposition (PackagingVariant packagingVariant,
                                                       ColourVariant colourVariant)       {
        Packaging packaging = null;
        switch (packagingVariant) {
            case PAPER:
                packaging = new Paper();
                packaging.setColourVariant(colourVariant);
                packaging.setPackagingVariant(packagingVariant);
                break;
            case GRID:
                packaging = new Grid();
                packaging.setColourVariant(colourVariant);
                packaging.setPackagingVariant(packagingVariant);
                break;
            case CRAFT:
                packaging = new Craft();
                packaging.setColourVariant(colourVariant);
                packaging.setPackagingVariant(packagingVariant);
                break;
            case CELLOPHANE:
                packaging = new Cellophane();
                packaging.setColourVariant(colourVariant);
                packaging.setPackagingVariant(packagingVariant);
                break;

        }
        return packaging;
    }
}
