package module3.part1_strings_as_massive;
/*
В строке найти количество цифр.
 */
public class Main3 {
    public static void main(String[] args) {
    String s = "in this 22 string there are 4 digits 33 ";
    char[]chars = arrayCreator(s);
    digitFinder(chars);

    }
    private static char[] arrayCreator(String s){
        char[]chars = s.toCharArray();
        return chars;
    }
    private static void digitFinder(char[]chars){
        int counter = 0;
        for (int i = 0; i < chars.length; i++){
            if(chars[i] >= '0' && chars[i] <= '9'){
                counter++;
            }
        }
        System.out.println("number of digits: " + counter);

    }


}
