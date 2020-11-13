package module4.task5;

import java.util.Scanner;

public class CounterTest {
    private static final String LOW = "type low digit";
    private static final String UP = "type up digit";
    private static final String FROM = "type start gigit";

    public static void main(String[] args) throws InterruptedException {
        int lowDigit = puttingIn(LOW);
        int upDigit = puttingIn(UP);
        int startDigit = checkStart(lowDigit, upDigit, puttingIn(FROM));

        Counter counter = new Counter();
        counter.setLowValue(lowDigit);
        counter.setUpValue(upDigit);

        System.out.println("counting up is started:");
        counter.countUp();
        System.out.println("empty counter is tested! - ok");

        Thread.sleep(1000);
        System.out.println("counting from " + startDigit + " is started:");
        counter.countUp(startDigit);
        System.out.println("diapason counter is tested! - ok");

        Thread.sleep(1000);
        System.out.println("countdown is started:");
        counter.countDown();
        System.out.println("empty downcounter is tested! - ok");

        Thread.sleep(1000);
        System.out.println("countdown from " + startDigit + " is started:");
        counter.countDown(startDigit);
        System.out.println("diapason downcounter is tested! - ok");
    }

    private static int puttingIn(String s) {
        s = s + " >";
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print(s);
        }
        int digit = scanner.nextInt();
        return digit;
    }

    private static int checkStart(int min, int max, int check) {
        if (check < max && check > min) {
            return check;
        } else System.out.println("digit out of range!");

        return max;
    }
}
