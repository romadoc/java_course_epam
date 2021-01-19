package com.epam.modulefour.taskfive;

/**
  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
  позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */
public class Counter {
    private int minValue;
    private int maxValue;
    Counter(){
        minValue = 0;
        maxValue = 10;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void startCounter(String direction) throws InterruptedException {
        if(direction.equals("+")) {
            System.out.println("default counter is started! " + "\"" + direction + "\"");
            for (int i = minValue; i <= maxValue; i++) {
                getPrintln(i);
                Thread.sleep(500);
            }
            System.out.println("default counter is finished!");
        }
        if(direction.equals("-")){
            System.out.println("default counter is started! " + "\"" + direction + "\"");
            for (int i = maxValue; i >= minValue; i--) {
                getPrintln(i);
                Thread.sleep(500);
            }
            System.out.println("default counter is finished!");
        }
    }

    public void startCounter(String direction, int maxValue, int minValue) throws InterruptedException {
        System.out.println("min Value: " + minValue + " max Value: " + maxValue);
        if (minValue >= maxValue){
            System.out.println("incorrect values! try again!");
        }
        else
            {
            if (direction.equals("+")) {
                System.out.println("param mode counter is started! " + "\"" + direction + "\"");
                for (int i = minValue; i <= maxValue; i++) {
                    getPrintln(i);
                    Thread.sleep(500);
                }
                System.out.println("param mode counter is finished!");
            }
            if (direction.equals("-")) {
                System.out.println("param mode counter is started! " + "\"" + direction + "\"");
                for (int i = maxValue; i >= minValue; i--) {
                    getPrintln(i);
                    Thread.sleep(500);
                }
                System.out.println("param mode counter is finished!");
            }
        }
    }

    private void getPrintln(int returnValue) {
        System.out.println(returnValue);
    }
}
