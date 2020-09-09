package module2.part3_sorting;



/*
Пусть даны две неубывающие последовательности действительных чисел. a <= a1 <= a2...an
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1 <= b2 <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Main7 {
    public static void main(String[] args) {
        int[]array = {1, 3, 4, 5, 7, 7, 9, 11};
        int[]array1 = {0, 2, 4, 6, 8, 10};
        printData(array, "target array");
        printData(array1, "chacked array");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " - in " + finder(array, array1[i]) + "; ");
        }
    }
    private static int finder(int[]arrayTarget, int chackedDigit){
        int low = 0;
        int high = arrayTarget.length-1;
        int index;
        index = -1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arrayTarget[mid] <= chackedDigit) {
                low = mid + 1;
            } else if (arrayTarget[mid] > chackedDigit) {
                high = mid - 1;

            } else if (arrayTarget[mid] == chackedDigit) {

                index = mid;

            }
            index = low;
        }

        return index;

    }
    private static void printData(int[]arrayIn, String s){
        System.out.print(s + ": ");
        for (int elem: arrayIn
             ) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }


}
