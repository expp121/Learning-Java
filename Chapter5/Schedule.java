import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        ArrayList<String>[] courses = new ArrayList[3];
        StringBuilder choice = new StringBuilder();

        for (int i = 0; i < courses.length; i++)
            courses[i] = new ArrayList<String>();

        do {
            choice.delete(0, choice.length());
            System.out.print("Please enter a course name or type stop: ");
            choice.append(input.nextLine());
            courses[0].add(choice.toString());

            choice.delete(0, choice.length());
            System.out.print("Please enter the days of the courses or type stop: ");
            choice.append(input.nextLine());
            courses[1].add(choice.toString());

            choice.delete(0, choice.length());
            System.out.print("Please enter the time of the courses or type stop: ");
            choice.append(input.nextLine());
            courses[2].add(choice.toString());

        } while (!choice.toString().equals("stop"));

        for (int i = 0; i < courses[0].size() - 1; i++) {
            System.out.println("Course name: " + courses[0].get(i) + "\nCourse Day and time: " + courses[1].get(i) + " "
                    + courses[2].get(i));
        }
    }
}