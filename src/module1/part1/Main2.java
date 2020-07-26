package module1.part1;

public class Main2 {
    //Задача номер 2, 1й модуль, 1 раздел. На решение квадратного корня.
    public static void main(String[] args) {
        double a = 5.4;
        double b = 4.5;
        double c = 3.2;
        double rezult;
        double temp = Math.pow(b, 2);
        temp = temp + 4 * a * c;
        temp = Math.sqrt(temp);
        temp = b + temp;
        temp = temp / (2 * a);
        double temp1; // right part, after '-'
        temp1 = Math.pow(a, 3);
        temp1 = temp1 * c;
        temp1 = temp1 + Math.pow(b, -2);
        rezult = temp - temp1;
        System.out.println(rezult);



    }
}
