package module1.part3_cycle;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от
// m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры

public class Main7 {
    public static void main(String[] args) {
        int m;
        m = input("введите m >>");
        int n;
        n = input("введите n >>");
        rezultOut(m, n);

    }

    public static int input(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(message);
        }
        int a = scanner.nextInt();
        return a;
    }

    public static void rezultOut(int m, int n) {
        String rez;
        while (m <= n) {
            System.out.print("число: " + m + " , делители - ");

            for (int i = 2; i < m - 1; i++) {

                if ((m % i) == 0) {
                    rez = (" " + i + "; ");
                    System.out.print(rez);

                }

            }
            System.out.println();
            m++;
        }

    }

}
