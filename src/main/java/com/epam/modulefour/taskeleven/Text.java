package com.epam.modulefour.taskeleven;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Text {
    private String titleText;
    private String text = "Original text of Text class";

    public void addTextWithNewSentence(String[]strings) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text).append("\n");
        for (String s:strings) {
            Sentence sentence = new Sentence();
            sentence.makeWordClass(s);
            sentence.makeSentance();
            stringBuilder.append(sentence.getSentence());
        }
        text = stringBuilder.toString();
    }

    public void printTitle() {
        System.out.println(titleText);
    }

    public void printText() {
        System.out.println(this.text);
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }
}

