package module2.part4_decomposition;
/*
 Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(А,В)=А*В/НОД(А,В)
 */
public class Main1 {
    public static void main(String[] args) {
        int a;
        a = 12;
        int b;
        b = 9;
        int greatCommonDivider;
        greatCommonDivider = greatCommonDev(a, b);
        printResult("checked digits", a, b);
        printResult("great common divider", greatCommonDivider);
        int leastCommonMultiple;
        leastCommonMultiple = leastCommonMultiple(a, b, greatCommonDivider);
        printResult("least common multiple", leastCommonMultiple);
    }
    private static int greatCommonDev(int a, int b){
        int d = 0;
        while (a != 0 && b !=0){
            if(a>b) {
                a %= b;
            }else {
                b %= a;
            }
            d = a + b;
        }

        return d;
    }
    private static int leastCommonMultiple(int a, int b, int grComDiv){
         int x;
         x = (a*b)/grComDiv;
         return x;
    }
    private static void printResult(String s, int a){
        System.out.println();
        System.out.print(s + ": " + a);
    }
    private static void printResult(String s, int a, int b){
        System.out.println();
        System.out.print(s + ": " + a + "; " + b);
    }
}