package com.epam.modulefour.taskeleven;

public class Word {
    private String stringWord;

    public String getStringWord() {
        return stringWord;
    }

    public void setStringWord(String stringWord) {
        if (stringWord.isEmpty()) {
            System.err.println("empty spaces in list detected!");
        }
        else {
            this.stringWord = stringWord;
        }
    }
}
