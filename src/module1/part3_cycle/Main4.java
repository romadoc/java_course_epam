package module1.part3_cycle;

//Составить программу нахождения произведения квадратов первых двухсот чисел

public class Main4 {
    public static void main(String[] args) {
        double rezult = 1;
        for (int i = 0; i < 200; i++) {
            rezult = Math.pow(i, 2);
            rezult = rezult * rezult;

        }
        System.out.println("произведение квадратов первых 200 чисел: " + rezult);
    }

}
