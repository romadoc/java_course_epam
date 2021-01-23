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
        Sentence sentence = new Sentence();
        sentence.makeWordClass(stringBuilder.toString());
        sentence.makeSentance();
        for (String s:strings) {
            stringBuilder.append(s).append(" ");
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

