package module1.part2_branching;

import java.util.Scanner;

// вычислить значение функции x digr2 - 3x + 9 при x <= 3;
// 1/x digr3 + 6 if x > 3;

public class Main5Variant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }

        int x = scanner.nextInt();
        double y;
        double z = 4;

        switch (x) {
            case (3):
                y = Math.pow(3, 2) - 3 * x + 9;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (2):
                y = Math.pow(2, 2) - 3 * x + 9;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (1):
                y = Math.pow(1, 2) - 3 * x + 9;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (0):
                y = Math.pow(0, 2) - 3 * x + 9;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (4):
                y = 1 / Math.pow(4, 3) + 6;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (5):
                y = 1 / Math.pow(5, 3) + 6;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
            case (6):
                y = 1 / Math.pow(6, 4) + 6;
                System.out.print(" x = " + x + " " + " y = " + y + "; ");
                break;
        }
    }
}