package module2.part4_decomposition;
/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Main5 {
    public static void main(String[] args) {
        int[]array = arrayConstructor();
        arrayPrint(array, "start array");
        int[]arraySorted = arraySorter(array);
        arrayPrint(arraySorted, "sorted array");
        getSolution(arraySorted);

    }
    private static int[] arrayConstructor(){
        int n = (int)(Math.random()*20);
        int[]array = new int[n];
        for(int i = 0; i < array.length; i ++ ){
            array[i] = (int)(Math.random()*30);
        }
        return array;
    }
    private static int[] arraySorter(int[]array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-1; j++){
                while (!(array[j]<=array[j+1])){
                    if (array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }


        }
        return array;
    }
    private static void arrayPrint(int[]arrayIn, String s){
        System.out.println();
        System.out.print(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
    }
    private static void getSolution(int[]arrayIn){
        int a = arrayIn[arrayIn.length-2];
        System.out.println();
        System.out.print("pre-last Digit is: " + a);
    }
}
