package module4.task1;

import java.util.Scanner;

/*
 Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class RunTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test1 test1 = new Test1();
        System.out.print("type X>>");
        test1.setX(scanner.nextInt());
        System.out.print("type Y>>");
        test1.setY(scanner.nextInt());
        test1.showVars();
        test1.summator(test1.getX(), test1.getY());
        test1.compareror(test1.getX(), test1.getY());

    }

}
