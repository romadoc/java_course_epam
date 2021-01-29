package textanalyzer.wordprocessor;

import textanalyzer.outputfile.WriteToRezultFile;

import java.io.IOException;
import java.util.*;

public class WordCounter {

   public static void makeListOfOriginals(ArrayList<String>stringsOfInputText) throws IOException {
       Map<String, Integer>treeMap = new TreeMap<String, Integer>();
       for (String temp : stringsOfInputText){
           Integer count = treeMap.get(temp);
           treeMap.put(temp,(count == null)?1:count+1);
       }
       printMap(treeMap, stringsOfInputText.size());
   }
    private static void printMap(Map<String, Integer> map, int textSize) throws IOException {

        System.out.println("total word count: " + textSize);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("\"" + entry.getKey() +
                               "\"" + " quantity : " +
                               entry.getValue() +
                               " - " +
                               roundAvoid((((double)entry.getValue()*100)/textSize), 3) + " %");

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.getKey())
                         .append(", ")
                         .append(entry.getValue())
                         .append(", ")
                         .append(roundAvoid((((double)entry.getValue()*100)/textSize), 3))
                         .append("\n")
            ;
            String stringForResult = stringBuilder.toString();

            WriteToRezultFile.saveToFile(stringForResult);

        }
    }
    private static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
