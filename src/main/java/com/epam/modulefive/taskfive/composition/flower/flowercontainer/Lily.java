package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import java.util.Objects;

public class Lily extends Flower {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lily lily = (Lily) o;
        return colourVariant == lily.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
