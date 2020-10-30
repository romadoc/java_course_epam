package module4.task2;
/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
 */
public class Test2 {
    private int x;
    private int y;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void summator(){
        this.x = 0;
        this.y = 0;
        System.out.println("default constructor " + x + "; " + y + "; done!");
    }
    public void summator(int x1, int y1){
        this.x = x1;
        this.y = y1;
        System.out.print("new constructor: ");
        System.out.println(x+y);
    }
    public void summatorOfSettedParams(){
        x = x+y;
        System.out.print("constructor with \"set\" parameters: ");
        System.out.println(x);
    }


}
