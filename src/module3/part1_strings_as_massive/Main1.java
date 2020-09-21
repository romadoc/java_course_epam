package module3.part1_strings_as_massive;
/*
 Дан массив названий переменных в camelCase. Преобразовать названия в snake_case f.e. helloWorld -> hello_world.
 */
public class Main1 {
    public static void main(String[] args) {
     String[]array = {"introOne", "introTwo", "camelStyle", "myBike"};
     printData("starting strings", array);

     String[]convertedArray = converter(array);
     printData("converted strings", convertedArray);

    }

    private static void printData(String s, String[]arrayIn){
        System.out.print(s + ": ");
        for (String elem: arrayIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }

    private static int seacherUpCasePosition(String s){
      char[]ch = s.toCharArray();
      int postion = 0;
      for (int i = 0; i < ch.length; i++){
          if (Character.isUpperCase(ch[i])){
              postion = i;
          }
      }
      return postion;
    }

    private static String changer(String s){

        int position = seacherUpCasePosition(s);
        char[]chars = s.toCharArray();
        char[]chars1 = new char[s.length()+1];
        for (int i = 0; i < position; i++){
            chars1[i] = chars[i];
        }

        chars1[position] = '_';

        for (int i = position+1; i< chars1.length; i++){
            chars1[i] = chars[i-1];
        }

        s = "";

        for (int i = 0; i<chars1.length; i++){
             s = s + chars1[i];

        }

        s = s.toLowerCase();

        return s;
    }

    private static String[] converter(String[]strings){
        String[]convertedArray = new String[strings.length];
        for (int i = 0; i < convertedArray.length; i++){
            convertedArray[i] = changer(strings[i]);
        }
        return convertedArray;
    }
}
