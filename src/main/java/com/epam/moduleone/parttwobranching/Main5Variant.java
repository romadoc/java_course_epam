package com.epam.moduleone.parttwobranching;
/* вычислить значение функции
                                 |  x^2 - 3x + 9 при x <= 3;
                        f(x) =  {
                                 |  1/(x^3 + 6)  if x > 3;
*/
public class Main5Variant {
    private static final double X = -9.0;
    private static final double X1 = 16.0;
    public static void main(String[] args) {
       decision(X);
       decision1(X1);

    }
    private static void decision(double x){
        double y = 0;
        System.out.println("x^2 - 3x + 9 при x <= 3 :");
        for (int i = 3; i > x; i--){
            y = Math.pow(i, 2) - 3 * i + 9;
            System.out.println("x = " + i + "; f(x) = " + y);
        }

    }
    private static void decision1(double x){
      double y = 0;
        System.out.println("1/(x^3 + 6)  if x > 3 :");
      for (int i = 4; i < x; i++){
          y = 1 / (Math.pow(i, 3) + 6);
          System.out.println("x = " + i + "; f(x) = " + y);
      }
    }
}