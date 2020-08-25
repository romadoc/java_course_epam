package module2.part2_multi_massive;
/*
 Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3,
..., 2^n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
public class Main16 {
    public static void main(String[] args) {
      int x;
      int y;
      int z;
      x = (int)(Math.random()*10);
      y = (int)(Math.random()*10);
      z = (int)(Math.random()*10);
      int sum = magicSum(x,y,z);
      int centralDigit = centralDigit(sum);
      int [][] array;
      array = squearConstructor(x,y,z,sum,centralDigit);
      squarePrint(array);
      checkSquare(array);

    }
    private static int magicSum(int x, int y, int z){
        int sum;
        sum = x + y + z;
        return sum;
    }
    private static int centralDigit(int x){
        int centrD;
        centrD = x/3;
        return centrD;
    }
    private static int[][] squearConstructor(int x, int y, int z, int sum, int centrD){

        int [][] array = new int[3][3];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[0][0] = x;
                array[0][1] = y;
                array[0][2] = z;
                array[1][1] = centrD;
                array[2][0] = sum - (centrD + z);
                array[2][1] = sum - (centrD + y);
                array[2][2] = sum - (centrD + x);
                array[1][0] = sum - (x + array[0][2]);
                array[1][2] = sum - (z + array[2][2]);


            }
        }
        return array;
    }
    private static int[][] checkSquare(int[][]arrayIn){
        int[][]array = arrayIn;
        int mainDiag = 0;
        int secDiag = 0;
        int centrCol = 0;
        int horCol = 0;
        int leftCol = 0;
        int rightCol = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length-1; j++){
                mainDiag = array[0][0] + array[1][1] + array[2][2];
                secDiag = array[0][2] + array[1][1] + array[2][0];
                centrCol = array[0][1] + array[1][1] + array[2][1];
                horCol = array[1][0] + array[1][1] + array[1][2];
                leftCol = array[0][0] + array[0][1] + array [0][2];
                rightCol = array[0][2] + array [1][2] + array[2][2];


            }

        }
        if (mainDiag == secDiag&& centrCol==horCol && leftCol==rightCol&&secDiag==centrCol){
            System.out.println("magic square");
        }
        else System.out.println("non - magic square");
        System.out.println();

        return array;

    }
    private static void squarePrint(int[][]array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
