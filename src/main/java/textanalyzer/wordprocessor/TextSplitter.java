package textanalyzer.wordprocessor;

import java.util.ArrayList;

public class TextSplitter {

    public ArrayList<String> createArrayOfWordsFromText(String string){
        ArrayList<String> list = new ArrayList<>();
        String[]strings = string.split("[^a-zA-Zа-яА-Я0-9_]");

        for (int i = 0; i < strings.length; i++){
            if(strings[i].length()>3){
                list.add(strings[i].toLowerCase());
            }
        }
        return list;
    }
}
