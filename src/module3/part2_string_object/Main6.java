package module3.part2_string_object;
/*
 Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Main6 {
    public static void main(String[] args) {
        String s = "Из заданной строки получить новую, повторив каждый символ дважды.";
        String result = "";
        solver(s, result);
    }
    private static void solver(String s, String dist){
        char[]chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            dist = dist + chars[i] + chars[i];
         }
        System.out.println(s);
        System.out.println(dist);
    }
}
