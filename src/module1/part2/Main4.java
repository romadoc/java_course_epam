package module1.part2;

import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Main4 {
    public static void main(String[] args) {
        int foramenA;
        int foramenB;

        int length = 25;
        int height = 6;
        int width = 12;
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        foramenA = scanner.nextInt();
        System.out.println();
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println();
            System.out.print(">>");
        }
        foramenB = scanner.nextInt();

        if (foramenA > length && foramenB > width || foramenA > height && foramenB > width ||
                foramenA > width && foramenB > height) {
            System.out.println("The brick will go through the hole");
        } else System.out.println("The brick will not go through the hole");


    }

}
