package module3.part2_string_object;
/*
 В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "an apertura areturates an abstract obj";
        printString(s);
        solver(s);
    }
    private static void printString(String s){
        System.out.println(s);
    }
    private static void solver(String s){
        char shifted = 'a';
        char pattern = 'b';
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == shifted){
                sb.insert(i+1, pattern);
            }
        }
        System.out.println(sb);
    }
}
