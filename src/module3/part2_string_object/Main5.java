package module3.part2_string_object;
/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Main5 {
    public static void main(String[] args) {
        String s = "public static void main";
        solver(s);
    }
    private static void solver(String s){
        char[]chars = s.toCharArray();
        char pattern = 'a';
        int counter = 0;
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == pattern){
                counter++;
            }
        }
        System.out.println("\'a\' in string " + "\"" + s + "\"" + " is met: " + counter);
    }
}
