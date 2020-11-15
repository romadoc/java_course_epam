package module4.task7;
/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double aSide;
    private double bSide;
    private double cSide;
    private final static String WARNING = "Incorrect side size! It was set as \"1.0\" ";

    Triangle(double aSide, double bSide, double cSide){
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }
    public void perimeter(Triangle triangle){
        double perimeter = triangle.aSide + triangle.bSide + triangle.cSide;
        System.out.println("perimeter is " + perimeter);
    }
    public void square(Triangle triangle){
        double sp = (triangle.aSide+triangle.bSide+triangle.cSide)/2;
        double sq = Math.sqrt(sp*(sp - triangle.aSide)*(sp - triangle.bSide)*(sp - triangle.cSide));
        String result = String.format("%.2f", sq);
        System.out.println("square is " + result);
    }
    public void medianPoint(double xa, double xb, double xc, double ya, double yb, double yc){
        double xm = (xa+xb+xc)/3;
        double ym = (ya+yb+yc)/3;
        System.out.println("bariocentric coordinate y = " + xm + " x = " + ym );
    }

    public void setaSide(double aSide) {
        if(aSide>0) {
            this.aSide = aSide;
        }
        else {
            System.out.println(WARNING + " (1st side) ");
            aSide = 1;
        }
    }

    public void setbSide(double bSide) {
        if(bSide>0) {
            this.bSide = bSide;
        }
        else {
            System.out.println(WARNING + " (2nd side) ");
            bSide = 1;
        }
    }

    public void setcSide(double cSide) {
        if(cSide>0) {

            this.cSide = cSide;
        }
        else {
            System.out.println(WARNING + " (3rd side) ");
            cSide = 1;
        }
    }

}
