import java.util.Scanner;

public class InputGrades {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        Student[] students = new Student[2];
        CollegeCourse course = new CollegeCourse();
        char grade = ' ';

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("============================\nEnter ID for student " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("\nEnter course ID " + (j + 1) + ":");
                course.setClassId(input.nextLine());
                System.out.print("Enter the course's credit hours: ");
                course.setCreditHours(input.nextShort());
                System.out.print("Enter a course grade");
                do {
                    System.out.print(":");
                    grade = input.next().charAt(0);
                } while ((grade < 65 || grade > 70) || grade == 69);
                course.setGrade(grade);
                input.nextLine();

                students[i].setCollegeCourse(course, j);
            }
            students[i].setStudentIdNumber((short) (i + 1));
        }

        for (int i = 0; i < students.length; i++) {
            displayStudent(students[i]);
        }
        input.close();
    }

    public static void displayStudent(Student student) {
        System.out.println(
                "====================\nStudent's ID: " + student.getStudentIdNumber() + "\n====================");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent's course " + (i + 1) + " details\n");
            System.out.println("Class ID: " + student.getCourse(i).getClassId() + "\nCredit Hours: "
                    + student.getCourse(i).getCreditHours() + "\nGRADE: " + student.getCourse(i).getGrade()
                    + "\n-----------------------\n");
        }
    }
}