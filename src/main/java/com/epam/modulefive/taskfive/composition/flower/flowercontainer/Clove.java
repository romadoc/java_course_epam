package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import java.util.Objects;

public class Clove extends Flower {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clove clove = (Clove) o;
        return colourVariant == clove.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
