package part3_sorting;


/*
Сортировка вставками. Дана последовательность чисел  a1 ,a2 , ,an . Требуется переставить числа в порядке
возрастания. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции. Пусть
a a ai , , , 1 2  - упорядоченная последовательность, т. е. a1 <= a2 <=...<= an . Берется следующее число
i+1 a и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
 */
public class Main5 {
    public static void main(String[] args) {
        int[] array = arrayConstr();

        printArray(array, "start array: ");
        int lastSortedIndex = sortedIndex(array);

        for (int i = lastSortedIndex; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                while (!(array[j] <= array[j + 1])) {
                    int foundIndex = binarySearch(array, sortedIndex(array));

                    shiftElem(array, foundIndex);

                }
            }
        }

        printArray(array, "sorted array: ");

    }

    private static int[] arrayConstr() {
        int[] array = {1, 2, 2, 4, 7, 10, 12, 14, 14, 17, 20, 3, 5, 20, 18, 13};
        return array;
    }

    private static void printArray(int[] array, String s) {
        System.out.print(s);
        for (int elem : array) {
            System.out.print(elem + "; ");
        }
        System.out.println();

    }

    private static int sortedIndex(int[] array) {
        int lastSortedIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {

                lastSortedIndex++;
            }
        }

        return lastSortedIndex;
    }

    private static int binarySearch(int[] arrayIn, int lastIndexSort) {
        int chackedDigit = arrayIn[arrayIn.length - 1];
        int low = 0;
        int high = lastIndexSort;
        int[] arrayTest = arrayIn;
        int index;
        index = -1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arrayIn[mid] <= chackedDigit) {
                low = mid + 1;
            } else if (arrayIn[mid] > chackedDigit) {
                high = mid - 1;

            } else if (arrayIn[mid] == chackedDigit) {

                index = mid;

            }
            index = low;
        }

        return index;
    }

    private static int shiftElem(int[] arrayIn, int startPoint) {
        int lastElem;
        lastElem = arrayIn[arrayIn.length - 1];
        if (startPoint >= arrayIn.length - 2) {
            arrayIn[arrayIn.length - 1] = arrayIn[arrayIn.length - 2];
        } else {

            for (int i = arrayIn.length - 2; i >= startPoint; i--) {
                arrayIn[i + 1] = arrayIn[i];

            }
        }
        arrayIn[startPoint] = lastElem;

        return startPoint + 1;
    }


}
