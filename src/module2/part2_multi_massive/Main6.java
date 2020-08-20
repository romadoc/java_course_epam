package module2.part2_multi_massive;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     1 1 1...1 1 1
     0 1 1...1 1 0
     0 0 1...1 0 0
     .........
     0 1 1...1 1 0
     1 1 1...1 1 1
*/
public class Main6 {
    public static void main(String[] args) {
    printMatrix(matrixConstructor());

    }
    private static int[][] matrixConstructor(){
        int n;
        n = 6;
        int [][] array = new int[n][n];
        int x;
        x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = x; j < array[i].length-x; j++){
                    array[i][j] = 1;
                }
            x++;

        }
        for (int i = array.length-1; i >= array.length/2; i--){
            for (int j = y; j < array[i].length-y; j++ ){
                array[i][j] = 1;
            }
            y++;
        }

        return array;
    }

    private static void printMatrix(int[][] arrayInput){
        for (int i = 0; i < arrayInput.length; i++ ){
            for(int j = 0; j < arrayInput[i].length; j++){
                System.out.print(arrayInput[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
