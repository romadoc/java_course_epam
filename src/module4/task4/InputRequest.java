package module4.task4;

import java.util.Scanner;

public class InputRequest {

    int insNumTrain() {
        System.out.println();
        System.out.print("type train number and press \"enter\" key >>");
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println();
            System.out.print("type train number and press \"enter\" key! >>");
        }
        x = scanner.nextInt();
        return x;
    }
}
