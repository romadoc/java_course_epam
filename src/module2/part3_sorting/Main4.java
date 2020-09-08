package module2.part3_sorting;
/*
Сортировка обменами. Дана последовательность чисел a1  a2 ... an . Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai ai+1. Если ai > ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Main4 {
    public static void main(String[] args) {
    int[]array;
    array = arrayConstructor();
    printArray(array, "start array: ");
    printArray(arraySorter(array), "sorted array: ");

    }
    private static int[] arrayConstructor(){
        int b = (int)(Math.random()*10);
        int[]array = new int[b];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*20);
        }
        return array;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println();
        System.out.print(s);
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
    }
    private static int[] arraySorter(int[]arrayIn){
        int count = 0;
        for (int i = 0; i < arrayIn.length; i++){

            for (int j = i+1; j < arrayIn.length; j++){
                if(arrayIn[i] > arrayIn[j]){
                    int temp;
                    temp = arrayIn[i];
                    arrayIn[i] = arrayIn[j];
                    arrayIn[j] = temp;
                    count++;

                }
            }
        }
        System.out.print("count of changing: " + count);
        return arrayIn;
    }

}
