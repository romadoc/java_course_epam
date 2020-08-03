package module1.part2_branching;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
public class Main3 {
    public static void main(String[] args) {
        double x1 = 2.8;
        double y1 = 4.7;

        double x2 = 5.6;
        double y2 = 4.5;

        double x3 = 6.2;
        double y3 = 2.2;

        if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
            System.out.println("Точки расположены на одной прямой");
        } else System.out.println("Точки не лежат на одной прямой");

    }
}
