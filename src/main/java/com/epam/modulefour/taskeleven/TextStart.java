package com.epam.modulefour.taskeleven;

public class TextStart {
    public static void main(String[] args) {
        String[] testString = {"We", "should", "continue", "our", "work", "on", "JUnit", "regardless", "of", "how",
                "many", "donations", "we", "receive", "-this", "text", "is", "added"};
        String[] testString1 = {"next-", "this", "sentence", "is", "added", "to", "text"};

        Text text = new Text();
        text.setTitleText("TITLE");
        System.out.println("вывод в консоль заголовка текста: ");
        text.printTitle();
        System.out.println("вывод в консоль оригинального текста класса \"Text\": ");
        text.printText();
        System.out.println("вывод в консоль дополненного текста №1: ");
        try {
            text.addTextWithNewSentence(testString);
        } catch (NullPointerException e) {
            System.err.println("chack list o words! no voids!");;
        }
        text.printText();
        System.out.println("вывод в консоль дополненного текста №2: ");
        text.addTextWithNewSentence(testString1);
        text.printText();
        System.out.println("вывод в консоль заголовка и изменного текста: ");
        text.printTitle();
        text.printText();
    }
}
