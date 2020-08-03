package module1.part1_linear;

public class Main1 {
    //Найдите значение функции: z = ((a – 3 ) * b / 2) + c
    public static void main(String[] args) {
        double a = 2.5;
        double b = 3.4;
        double c = 4.2;
        double z;
        double temp = a - 3;
        temp = temp * b;
        temp = temp / 2;
        z = temp + c;
        System.out.println(z);
    }
}
