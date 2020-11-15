package module4.task7;

import java.util.Scanner;

public class TesterTriangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        a = dataEntry("enter 1st side");
        b = dataEntry("enter 2nd side");
        c = dataEntry("enter 3rd side");

        Triangle triangle = new Triangle(a, b, c);

        triangle.setaSide(a);
        triangle.setbSide(b);
        triangle.setcSide(c);
        triangle.perimeter(triangle);
        triangle.square(triangle);

        double ax = dataEntry("type x coordinate A");
        double ay = dataEntry("type y coordinate A");
        double bx = dataEntry("type x coordinate B");
        double by = dataEntry("type y coordinate B");
        double cx = dataEntry("type x coordinate C");
        double cy = dataEntry("type y coordinate C");

        triangle.medianPoint(ax,ay,bx,by,cx,cy);

    }
    public static double dataEntry(String s){
        s = s + " >>";
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            System.out.print(s);
            scanner.next();
        }
        double side = scanner.nextDouble();
     return side;
    }
}
