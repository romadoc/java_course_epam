package com.epam.modulethree.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите анализатор, позволяющий ПОСЛЕДОВАТЕЛЬНО возвращать содержимое узлов xml-документа и его тип (открывающий
 * тег, закрывающий тег, содержимое тега, тег без тела).
 * Task 2 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */

public class Main2 {
    public static void main(String[] args) {
        String xmlString = xmlStringOrigin();
        String[]tegsContent = inTegContent(xmlString);
        notes(xmlString, tegsContent);
        note(xmlString);
        to(xmlString);
        from(xmlString);
        heading(xmlString);
        body(xmlString);
        bodyless(xmlString);

    }

    private static void notes(String stringIn, String[] tegCon) {
        Pattern pattern = Pattern.compile("[^А-Яа-я\\s]");
        String[]strings = pattern.split(stringIn);
        System.out.println();

        System.out.print("<"+tegCon[1]+">");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != "") {

                System.out.print(strings[i]);
            }
        }
        System.out.println("<"+tegCon[tegCon.length-1]+">");
    }

    private static String[] inTegContent(String stringIn) {

        Pattern pattern = Pattern.compile("[<>]");
        String[]strings = pattern.split(stringIn);
        for (int i = 1; i < strings.length; i ++) {

        }
        return strings;
    }

    private static void note(String xmlStr){

        Pattern patternStr = Pattern.compile("<note id.*[<\\/no]te>");
        Pattern patternEndStr = Pattern.compile("\\<\\/note\\>");
        Matcher matcher = patternStr.matcher(xmlStr);
        String string = "";
        while (matcher.find()) {
            string = string + (xmlStr.substring(matcher.start(), matcher.end()));
        }
        String[]strings = patternEndStr.split(string);
        for (int i = 0; i < strings.length; i++) {
            giveAnswer(strings[i]);
        }
    }

    private static void to(String xmlStr){

        Pattern patternStr = Pattern.compile("<to>.*<\\/to>");
        Pattern patternEndStr = Pattern.compile("><");
        Matcher matcher = patternStr.matcher(xmlStr);
        String string = "";
        while (matcher.find()) {
            string = string + (xmlStr.substring(matcher.start(), matcher.end()));
            System.out.println();

        }
        String[]strings = patternEndStr.split(string);
        System.out.println(strings[0]+">");
        System.out.println("<"+strings[strings.length-1]);

    }

    private static void from(String xmlStr){
        Pattern patternStr = Pattern.compile("<from>.*<\\/from>");
        Matcher matcherStr = patternStr.matcher(xmlStr);
        String string = "";
        while (matcherStr.find()) {
            string = string + matcherStr.group();
        }
        String[]strings = string.split("><");
        System.out.println(strings[0]+">");
        System.out.println("<"+strings[strings.length-1]);

    }

    private static void heading(String xmlStr){
        Pattern patternStr = Pattern.compile("<heading>.*<\\/heading>");
        Matcher matcherStr = patternStr.matcher(xmlStr);
        String string = "";
        while (matcherStr.find()) {
            string = string + matcherStr.group();
        }
        String[]strings = string.split("><");
        System.out.println(strings[0]+">");
        System.out.println("<"+strings[strings.length-1]);

    }

    private static void body(String xmlStr){
        Pattern patternStr = Pattern.compile("<body>.*");
        Matcher matcherStr = patternStr.matcher(xmlStr);
        String string = "";
        while (matcherStr.find()) {
            string = string + matcherStr.group();
        }
        String[]strings = string.split("><");
        System.out.println(strings[0]+">");
    }

    private static void bodyless(String xmlStr){
        Pattern patternStr = Pattern.compile("<.*\\/>");
        Matcher matcherStr = patternStr.matcher(xmlStr);
        String string = "";
        while (matcherStr.find()) {
            string = string + matcherStr.group();

        }
        String[]strings = string.split("><");
        System.out.println("<"+strings[strings.length-1]);

    }

    private static void giveAnswer(String stringIn){
        System.out.println();
        Pattern patternCont = Pattern.compile("[А-Яа-я]");
        Pattern patternSpl = Pattern.compile("[><]");
        Pattern patternForLastTag = Pattern.compile("^\\S+");
        String[]strings = patternSpl.split(stringIn);
        System.out.print("<"+strings[1]+">");

        Matcher matcherCont = patternCont.matcher(stringIn);
        while (matcherCont.find()){
            System.out.print(stringIn.substring(matcherCont.start(), matcherCont.end()));
        }
        Matcher matcher = patternForLastTag.matcher(strings[1]);
        while (matcher.find()){
            System.out.print("</"+strings[1].substring(matcher.start(),matcher.end())+">");
        }

    }

    private static String xmlStringOrigin(){
        String string =
                "<notes>" +
                        "<note id = \"1\">" +
                        "<to>Вася</to>" +
                        "<from>Света</from>" +
                        "<heading>Напоминание</heading>" +
                        "<body>Позвони мне завтра!</body>" +
                        "</note>" +
                        "<note id = \"2\">" +
                        "<to>Петя</to>" +
                        "<from>Маша</from>" +
                        "<heading>Важное напоминание</heading>" +
                        "<body/>" +
                        "</note>" +
                        "</notes>";
        return string;
    }
}
