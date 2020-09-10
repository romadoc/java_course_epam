package module2.part3_sorting;
/*
Даны дроби p/q1, p2/q2,...,pn/qn (p1, p2 - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Main8 {
    public static void main(String[] args) {
        int[]numinator = numerator();
        int[]denuminator = denumerator();
        printData(numinator,"num");
        printData(denuminator, "den");
        printFraction(numinator, denuminator, "start fraction");
        int joinedDenumerator = joinedDenum(denuminator);
        int[]resultNuminator = decitionMashine(numinator,denuminator, joinedDenumerator);
        printFraction(resultNuminator, joinedDenumerator, "result fraction");


    }
    private static int[] numerator(){

        int[]numerator = new int[10];

        for (int i = 0; i < numerator.length; i++){
            numerator[i] = (int)(Math.random()*(10-1)+1);
        }
        return numerator;

    }
    private static int[] denumerator(){
        int[]denumerator = new int[10];
        for (int i = 0; i < denumerator.length; i++){
            denumerator[i] = (int)(Math.random()*(10-1)+1);
        }
        return denumerator;
    }
    private static void printData(int[]arrayIn, String s){
        System.out.print(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }
    private static void printFraction(int[]numArr, int[]denArr, String s){
        System.out.print(s + ": ");
        for (int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] + "/" + denArr[i] + "; ");
        }
        System.out.println();
    }
    private static void printFraction(int[]newArr, int jdenum, String s){
        System.out.print(s + ": ");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + "/" + jdenum + "; ");
        }
    }
    private static int joinedDenum(int[]arrayIn){
        int joinDen = 1;
        for (int i = 0; i < arrayIn.length; i++ ){
            joinDen = arrayIn[i] * joinDen;
        }

        return joinDen;
    }

    private static int[] decitionMashine(int[]arrayIn1, int[]arrayIn2, int joinedDenum){
        int[]transfArray = new int[arrayIn1.length];
        for (int i = 0; i < arrayIn1.length; i++){
            transfArray[i] = arrayIn1[i] * joinedDenum/arrayIn2[i];

        }
        for (int i = 0; i < transfArray.length - 1; i++){
            while (!(transfArray[i]<=transfArray[i+1])){
                int temp;
                temp = transfArray[i];
                transfArray[i] = transfArray[i + 1];
                transfArray[i + 1] = temp;
            }

        }

        return transfArray;

    }

}
