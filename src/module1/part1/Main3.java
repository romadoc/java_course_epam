package module1.part1;

public class Main3 {
    //Задача номер 3. 1 модуль, 1 раздел. Синус, косинус, тангенс.
    public static void main(String[] args) {
        double x = 3;
        double y = 5;
        double rezult;
        rezult = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(rezult);
    }
}
