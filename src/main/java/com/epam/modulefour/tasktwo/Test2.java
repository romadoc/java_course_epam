package com.epam.modulefour.tasktwo;

/**
 * Module 4. Task2
 * Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Test2 {
    private int a;
    private int b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = 2;
        this.b = 6;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class Test{
    public static void main(String[] args) {
        Test2 test2 = new Test2();

        System.out.println("by default:");
        System.out.println("a: " + test2.getA());
        System.out.println("b: " + test2.getB());

        System.out.println("by setters and getters:");
        test2.setA(5);
        test2.setB(10);
        System.out.println("a: " + test2.getA());
        System.out.println("b: " + test2.getB());

        System.out.println("constructor with parameters:");
        test2 = new Test2(20,30);
        System.out.println("a: " + test2.getA());
        System.out.println("b: " + test2.getB());

    }
}
