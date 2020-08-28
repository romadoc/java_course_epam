package part3_sorting;
/*
Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an Требуется переставить элементы так,
чтобы они были расположены по убыванию.
 */
public class Main3 {
    public static void main(String[] args) {
    printArray(arrayconstructor(), "start array: ");
    printArray(arraySorter(arrayconstructor()), "result: ");

    }
    private static int[] arrayconstructor(){
        int[]array1 = {30, 30, 25, 20, 15, 15, 10, 8, 7, 1};
        return array1;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println();
        System.out.print(s);
        for (int elem:  arrayIn) {
            System.out.print(elem + "; ");
        }
    }
    private static int[] arraySorter(int[]arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            int min = arrayIn[i];
            int minId = i;
            for (int j = i + 1; j < arrayIn.length; j++){
                if (arrayIn[j]<min){
                    min = arrayIn[j];
                    minId = j;

                }
            }
            int temp = arrayIn[i];
            arrayIn[i] = min;
            arrayIn[minId] = temp;
        }
        return arrayIn;
    }
}
