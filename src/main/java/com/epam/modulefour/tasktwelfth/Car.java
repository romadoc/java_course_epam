package com.epam.modulefour.tasktwelfth;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }

    private class Engine{
        public void startEngine() {
            System.out.println("engine of " + model + " is starting");
        }
    }

    public static class Wheel {
        public void changeWheel() {
            System.out.println("wheel changed");
        }
    }

    public void driveCar() {
        Engine engine = new Engine();
        engine.startEngine();
        System.out.println("Car " + model + " is driving");
    }

    public void fillTank() {
        System.out.println(model + " is refueling");
    }

    public void getModel() {
        System.out.println("Model of this car is \"" + model + "\"");
    }
}
