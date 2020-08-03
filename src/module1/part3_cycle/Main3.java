package module1.part3_cycle;

//найти сумму квадратов первых ста чисел
public class Main3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("сумма квадратов первых ста чисел равна: " + sum);
    }
}
