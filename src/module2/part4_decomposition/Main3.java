package module2.part4_decomposition;
/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника
 */
public class Main3 {
    public static void main(String[] args) {
        int a;
        a = 10;
        printResult(hexagonSquare(triangleSq(a)), "hexagon square");
    }
    private static int triangleSq(int a){
        int square = 0;
        square = (int)((a*a)*Math.sqrt(a)/4);
        return square;
    }
    private static int hexagonSquare(int x){
        int hexagonSquare;
        hexagonSquare = x * 6;
        return hexagonSquare;
    }
    private static void printResult(int x, String s){
        System.out.print(s + ": " + x);
    }
}
