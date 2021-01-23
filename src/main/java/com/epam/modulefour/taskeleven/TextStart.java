package com.epam.modulefour.taskeleven;

public class TextStart {
    public static void main(String[] args) {
        String[] testString = {"We", "will", "continue", "our", "work", "on", "JUnit", "regardless", "of", "how",
                "many", "donations", "we", "receive", "-this", "text", "is", "added"};
        String[] testString1 = {"next-", "this", "sentence", "is", "added", "to", "text"};

        Text text = new Text();
        text.setTitleText("TITLE");
        text.printTitle();
        text.addTextWithNewSentence(testString);
        text.addTextWithNewSentence(testString1);
        text.printText();
    }
}
