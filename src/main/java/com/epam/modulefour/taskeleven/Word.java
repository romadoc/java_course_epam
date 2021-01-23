package com.epam.modulefour.taskeleven;

public class Word {
    private String stringWord;

    public String getStringWord() {
        return stringWord;
    }

    public void setStringWord(String stringWord) {
        if (!stringWord.isEmpty()) {
            this.stringWord = stringWord;
        }
    }
}
