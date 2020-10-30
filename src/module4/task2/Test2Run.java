package module4.task2;
/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
 */

public class Test2Run {
    public static void main(String[] args) {
       Test2 test2 = new Test2();
       test2.summator();
       test2.summator(5,3);
       test2.setX(10);
       test2.setY(15);
       test2.summatorOfSettedParams();
    }

}
