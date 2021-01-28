package com.epam.modulefour.taskeleven;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
   private String sentence = "";
   private Word word;

    public Sentence() {

    }

    public void makeWordClass(String string){
        Word wordClassObject = new Word();
        wordClassObject.setStringWord(string);
        word = wordClassObject;
    }

    public void makeSentance() {
        List<Word>words = new ArrayList<>();
        words.add(word);
        for (Word w: words) {

            if(!w.getStringWord().isEmpty()) {
                sentence = sentence + w.getStringWord() + " ";
            }
        }
    }

    public String getSentence() {
        return sentence;
    }
}
