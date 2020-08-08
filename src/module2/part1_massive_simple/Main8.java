package module2.part1_massive_simple;

//Дана последовательность целых чисел а1, а2,...а_n  Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min (a1, a2, ..., a_n)


public class Main8 {
    public static void main(String[] args) {
        int[] workingArray = arrayGenerator();
        int minElement;
        minElement = minElement(workingArray);
        printData("workindArray - изначальный массив: ", workingArray);
        printData("min - минимальное значение: ", minElement);
        int minQuantity;
        minQuantity = countOfMin(workingArray, minElement);
        printData("count - количество мин. элементов: ", minQuantity);
        int [] outArray;
        outArray = newArrayCreator(minQuantity, workingArray);
        printData("Output digits: ", outArray);



    }
    private static int[] arrayGenerator(){ //создание массива
        int n = (int) (Math.random()* 20);
        int[]arreyFirst = new int[n];
        for (int i = 0; i < arreyFirst.length; i++) {
            arreyFirst[i] = (int) (Math.random() * 20 - 10);
        }
        return arreyFirst;
    }
    private static int minElement(int[] inputArray){ //получение мин элемента
        int min;

        min = inputArray[0];
        for (int elem = 0; elem < inputArray.length; elem++){
            if (min > inputArray[elem]) {
                min = inputArray[elem];
            }
        }
         return min;
    }
    private static int countOfMin(int[] inputArray, int minDigit){ // количество миним. элементов
        int count = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == minDigit) count = count + 1;
        }

        return count;
    }
    private static int[] newArrayCreator(int minQuant, int []inputArray ) { //создание окончательного массива
        int [] dirtyArray = new int[inputArray.length];
        int [] resultArray = new int[inputArray.length - minQuant];
        int temp;
        for (int i =0; i < dirtyArray.length; i++){
            dirtyArray[i] = inputArray[i];
        }
        boolean needSort = true;
        while (needSort) {
            needSort = false;

            for (int i = 1; i < dirtyArray.length; i++) {
                if (dirtyArray[i] < dirtyArray[i - 1]) {
                    temp = dirtyArray[i];
                    dirtyArray[i] = dirtyArray[i - 1];
                    dirtyArray[i - 1] = temp;
                    needSort = true;
                }
            }
        }
        System.out.println();                       //test
        printData("Sorted Array: ", dirtyArray); // test
        for (int i = minQuant; i < resultArray.length; i++){
            resultArray[i] = dirtyArray[i];

        }

        return resultArray;


    }
    private static void printData(String s, int[] array){
        System.out.print(s);
        for (int i = 0; i<array.length; i++){
            System.out.print(" " + array[i] + "; ");
        }
    }
    private static void printData(String s, int x){
        System.out.println();
        System.out.println(s +" "+ x +" ");

    }

}
