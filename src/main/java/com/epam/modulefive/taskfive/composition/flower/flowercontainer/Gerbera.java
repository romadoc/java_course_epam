package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import java.util.Objects;

public class Gerbera extends Flower {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gerbera gerbera = (Gerbera) o;
        return colourVariant == gerbera.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
