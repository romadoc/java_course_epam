package module3.part1_strings_as_massive;

/*
в строке найти количество чисел
 */
public class Main4 {
    public static void main(String[] args) {
        String s = "in this 22 string 5 there 88 are 4 digits 33";
        String[]creator = arrayCreator(s);
        System.out.println("string for counting: " + s);
        digitFinder(creator);


    }

    private static String[] arrayCreator(String s) {

        String[]array = s.split(" ");

        return array;
    }

    private static void digitFinder(String[]arrayIn) {
         int counter = 0;
         for(int i = 0; i < arrayIn.length; i++){
             char[]chars = arrayIn[i].toCharArray();
             if(isCharDigit(chars[0])){
                 counter++;
             }

         }
        System.out.println();
        System.out.println("amount of numbers : "+counter);
    }

    private static boolean isCharDigit(char ch){
        boolean isDigit = false;
        if((int)ch>47 && (int)ch < 58){
            isDigit = true;
        }
        return isDigit;
    }


}





