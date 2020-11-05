package module4.task3;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        Student student1 = new Student("Ivanov D.A.", 9, new int[]{9, 9, 9, 9, 9});
        students[0] = student1;

        Student student2 = new Student("Petrov V.A.", 5, new int[]{9, 8, 9, 9, 9});
        students[1] = student2;

        Student student3 = new Student("Sidorov M.D", 2, new int[]{5, 5, 8, 9, 8});
        students[2] = student3;

        Student student4 = new Student("Sidorova N.D", 4, new int[]{10, 10, 9, 9, 10});
        students[3] = student4;

        Student student5 = new Student("Sharipov R.R", 5, new int[]{5, 5, 8, 9, 8});
        students[4] = student5;

        Student student6 = new Student("Ivanova E.E", 2, new int[]{5, 9, 8, 9, 8});
        students[5] = student6;

        Student student7 = new Student("Solovjov S.D", 7, new int[]{10, 10, 10, 9, 10});
        students[6] = student7;

        Student student8 = new Student("Kapitonova A.G.", 2, new int[]{7, 6, 8, 9, 8});
        students[7] = student8;

        Student student9 = new Student("Zavjalova R.B", 9, new int[]{9, 7, 8, 9, 9});
        students[8] = student9;

        Student student10 = new Student("Levchenko D.D", 7, new int[]{10, 9, 9, 9, 10});
        students[9] = student10;

        for (int i = 0; i < students.length; i++) {
            int count = 0;
            for (int y = 0; y < students[i].getGrades().length; y++) {
                if (students[i].getGrades()[y] > 8) {
                    count++;
                }
            }
            if (count == students[i].getGrades().length) {
                System.out.println(students[i].getName() + "; group # " + students[i].getGroupNumber());
            }
        }
    }


}
