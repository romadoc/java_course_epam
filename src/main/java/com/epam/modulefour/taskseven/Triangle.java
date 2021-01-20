package com.epam.modulefour.taskseven;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void setSideOne(double sideOne) {
        if (sideOne > 0) {
            this.sideOne = sideOne;
        } else {
            sideOne = 1.0;
        }
    }

    public void setSideTwo(double sideTwo) {
        if (sideTwo > 0) {
            this.sideTwo = sideTwo;
        } else {
            sideTwo = 1.0;
        }
    }

    public void setSideThree(double sideThree) {
        if (sideThree > 0) {
            this.sideThree = sideThree;
        } else {
            sideThree = 1.0;
        }
    }

    public double getPerimeterOfTriangle(){
        return sideOne + sideTwo + sideThree;
    }

    public double getSquareOfTriangle(){
        double semiPerimeter = getPerimeterOfTriangle()/2;
        return Math.sqrt(semiPerimeter *
                        (semiPerimeter - sideOne)*
                        (semiPerimeter - sideTwo)*
                        (semiPerimeter - sideThree)
        );
    }

    public double[] getCrossingPointOfMedian(double[] pointOne, double[] pointTwo, double[] pointThree){
        double x = (pointOne[0] + pointTwo[0] + pointThree[0])/3;
        double y = (pointOne[1] + pointTwo[1] + pointThree[1])/3;
        return new double[]{x,y};
    }
}
