package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import java.util.Objects;

public class Aster extends Flower {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aster aster = (Aster) o;
        return colourVariant == aster.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
