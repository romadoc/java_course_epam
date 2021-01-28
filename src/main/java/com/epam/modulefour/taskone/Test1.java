package com.epam.modulefour.taskone;

/**
 * Module 4. task1
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */
public class Test1 {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void printData(){
        System.out.println("Class Test1:");
        System.out.println("first variable "+a+" "+"second variable "+b);
        System.out.println("sum: " + sumAandB(a,b));
        System.out.println("max digit is: " + dеfineMaxDigit(a,b));
    }
    private int sumAandB(int a, int b) {
        this.a = a;
        this.b = b;
        return a+b;
    }
    private int dеfineMaxDigit(int a, int b) {
        this.a = a;
        this.b = b;
        return Math.max(a, b);
    }
}
class Test{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(5);
        test1.setB(10);
        test1.printData();
    }
}
