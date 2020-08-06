package module2.part1_massive_simple;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Main2 {

    static int z = 4;
    static int countOfchange = 0;

    public static void main(String[] args) {
        int [] massive = new int[20];
        System.out.println("generated massive: ");
        for (int i = 0; i < massive.length; i++){
            massive[i] = (int) (Math.random()*200 - 100);
            System.out.print(" " + massive[i] + "; ");

        }
        System.out.println();

        System.out.println("changed massive: ");
        for (int i = 0; i < massive.length; i ++){
            if (massive[i] > z) {
                massive[i] = 4;
                countOfchange = countOfchange + 1;
            }
            System.out.print(" " + massive[i] + "; ");
        }
        System.out.println();
        System.out.print("count of changed elements: " + countOfchange);
    }


}
