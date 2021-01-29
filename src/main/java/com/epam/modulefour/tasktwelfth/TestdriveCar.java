package com.epam.modulefour.tasktwelfth;

public class TestdriveCar {
    public static void main(String[] args) {
        Car lada = new Car("Lada");
        carInfo(lada);

        Car bmw = new Car("BMW");
        carInfo(bmw);
    }

    private static void carInfo(Car carModel) {
        carModel.getModel();
        carModel.driveCar();
        carModel.fillTank();
        Car.Wheel wheel = new Car.Wheel();
        wheel.changeWheel();
        System.out.println();
    }
}
