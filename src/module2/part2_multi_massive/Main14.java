package module2.part2_multi_massive;
/*
  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
  единиц равно номеру столбца.

 */
public class Main14 {
    public static void main(String[] args) {
    int[][] array = matrixConstructor();
    printMatrix(array);
    }
    private static int[][] matrixConstructor(){
        int m;
        int n;
        m = (int)(Math.random()*6);
        n = (int)(Math.random()*6);

        int[][]array = new int[m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int numDigit = j;
                  for (int y = 0;y<numDigit ; y++){
                      array[y][j] = 1;
                  }
            }
        }
        return array;
    }
    private static void printMatrix(int[][] arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            for(int j = 0; j < arrayIn[i].length; j++){
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
