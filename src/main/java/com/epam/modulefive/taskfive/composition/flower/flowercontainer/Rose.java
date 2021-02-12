package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import java.util.Objects;

public class Rose extends Flower {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return colourVariant == rose.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
