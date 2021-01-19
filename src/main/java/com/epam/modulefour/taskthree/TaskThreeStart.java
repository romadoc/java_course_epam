package com.epam.modulefour.taskthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskThreeStart {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String>nameOfStudent = getNames();
        ArrayList<Student>list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
          Student student = new Student(nameOfStudent.get(i), getGroupNumber(), getScores());
          list.add(student);
        }

        printAllStudents(list);
        printExcellentStudents(list);

    }

    private static void printAllStudents(ArrayList<Student> list) {
        System.out.println("список всех студентов:");
        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
    private static void printExcellentStudents(ArrayList<Student> list){
        System.out.println("студенты, имеющие оценки 9 и 10:");
        for (int i = 0; i <list.size(); i++){
            if(list.get(i).isScoreExcellent()==true) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    private static ArrayList<String> getNames() throws FileNotFoundException {
        ArrayList<String>listOfNames = new ArrayList<>();
        File file = new File("E:\\java_course\\src\\main\\java\\com\\epam\\modulefour" +
                "\\taskthree\\students.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          listOfNames.add(scanner.nextLine());
        }
        return listOfNames;
    }
    private static int[] getScores() {
        int[]studentScores = new int[4];
        for (int i = 0; i<studentScores.length; i++) {
            studentScores[i] = 8+(int)(Math.random()*3);
        }
        return studentScores;
    }
    private static int getGroupNumber() {
        return 1+(int)(Math.random()*5);
    }

}
