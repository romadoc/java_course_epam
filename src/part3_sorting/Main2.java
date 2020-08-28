package part3_sorting;
/*
Даны две последовательности
a1 <= a2 <=...<=an и b1 <= b2 <=...<= bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Main2 {
    public static void main(String[] args) {
        int[]array1 = {3, 4, 4, 6, 7, 7, 8, 9};
        int[]array2;
        array2 = arrayConstructor(array1);
        printArray(array1, "first array");
        printArray(array2, "second array");
        resultConstructor(array1, array2);
        printArray(array2, "result - second array is combined & sorted: ");

    }
    private static int[] arrayConstructor(int[]arrayIn){
        int []array2 = new int[8+arrayIn.length];
        for (int i = 0; i < 8; i++){
            array2[i] = i;
        }

        return array2;
    }
    private static int[] resultConstructor(int[] array1, int[] array2){
        System.out.println();

        int j = 0;
        for (int i = 9; i < array2.length; i++){
             array2[i] = array1[j];
             j++;

        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    int temp = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return array2;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println();
        System.out.print(s + ": ");
        for(int i = 0; i < arrayIn.length; i++){
            System.out.print(arrayIn[i] + "; ");
        }
    }
}
