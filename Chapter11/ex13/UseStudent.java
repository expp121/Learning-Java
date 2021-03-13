package ex13;

import students.Student;
import students.FullTime;
import students.PartTime;

public class UseStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        for (int i = 0; i < students.length - 1; i += 2) {
            students[i] = new PartTime("Naruto " + i, false);
            students[i + 1] = new FullTime("Boruto " + i, false);
        }

        for (int i = 0; i < students.length; i++)
            students[i].display();
    }
}
