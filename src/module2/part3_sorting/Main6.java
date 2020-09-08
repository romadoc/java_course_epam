package module2.part3_sorting;
/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1
, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка
и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Main6 {
    public static void main(String[] args) {
        int[] array  = arrayConstructor();
        printArray(array, "start array");
        int[] arraySorted = sorterShell(array);
        printArray(arraySorted, "sorted array");
    }
    private static int[] arrayConstructor(){
        int i;
        i = (int)(Math.random()*10);
        int[] array = new int[i];
        for(int j = 0; j < array.length; j++){
            array[j] = (int)(Math.random()*20);
        }
        return array;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }
    private static int[] sorterShell(int[]arrayIn){
        int n;
        n = arrayIn.length/2;
        while (n>0){
            for (int i = 0; i < arrayIn.length - n; i++){
                int j = i;
                while ((j >= 0) && (arrayIn[j] > arrayIn[j + n])){
                    int temp;
                    temp = arrayIn[j];
                    arrayIn[j] = arrayIn[j + n];
                    arrayIn[j + n] = temp;
                    j--;
                }
            }
            n = n/2;
        }


        return arrayIn;
    }

}
