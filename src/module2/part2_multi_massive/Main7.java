package module2.part2_multi_massive;

/*  сформировать квадратную матрицу порядка N по правилу:
    A[I,J]=sin(I^2-J^2/N) и подсчитать количество положительных элементов в ней
*/

public class Main7 {
    public static void main(String[] args) {
        int positiveQuantity;
        double[][]array = matrixConstructor();
        positiveQuantity = quantityPositive(array);
        printResult(array, positiveQuantity);


    }
    private static double[][] matrixConstructor(){
        int n = (int)(Math.random()*10);
        double[][]array = new double[n][n];
        int i;
        int j;

        for (int x = 0; x < array.length; x++){
            for(int k = 0; k < array[x].length; k++){
                i = (int)(Math.random()*10);
                j = (int)(Math.random()*10);
                double elem = ((i*i - j*j)/array.length);
                elem = Math.sin(elem);
                array[x][k] = elem;
            }
        }

        return array;
    }
    private static void printResult(double[][] arrayInput, int x){
        for (int i = 0; i < arrayInput.length; i++){
            for (int j = 0; j < arrayInput[i].length; j++){
                System.out.print(arrayInput[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("quantity of positive digits: " + x);
    }
    private static int quantityPositive(double[][] arrayIn){
        int q;
        q=0;
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++){
            for(int j = 0; j < arrayIn[i].length; j++){
                if (arrayIn[i][j] > 0) q++;
            }
        }

        return q;
    }

}
