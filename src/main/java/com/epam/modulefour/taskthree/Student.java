package com.epam.modulefour.taskthree;

import java.util.Arrays;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private String name;
    private int groupNumber;
    private int[]score = new int[4];

    public Student(String name, int groupNumber, int[] score) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.score = score;
    }

    @Override
    public String toString() {
        return  "студент '" + name + '\'' +
                ", номер группы " + groupNumber +
                ", оценки" + Arrays.toString(score);
    }
    public boolean isExcellent(){
        int excellentScore = 0;
        boolean isOk = false;
        for (int i = 0; i< score.length; i++){
            if(score[i]>=9){
                excellentScore++;
            }
        }
        if (excellentScore>=4){
            isOk = true;
        }
        return isOk;
    }
}
