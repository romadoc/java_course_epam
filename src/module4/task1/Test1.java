package module4.task1;
/*
 Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class Test1 {
    private int x;
    private int y;
    private final String STRING = "Max is ";



    public int getX() {
        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void showVars(){
        System.out.println("first var - "+x+"; second var - "+y);
    }
    public void summator(int x, int y){
        System.out.println("sum = "+(x+y));
    }
    public void compareror(int x, int y){
        if(x>y){
            System.out.println(STRING + x);
        }else {
            System.out.println(STRING + y);
        }
    }
}
