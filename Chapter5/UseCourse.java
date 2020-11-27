import java.util.Scanner;

public class UseCourse {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        final String[] labCourses = {"bio", "chm", "cis", "phy"};
        System.out.print("Enter the first 3 letter of a course(BIO,CHM,CIS,PHY)\n:");
        String course = input.nextLine();
        boolean normalCourse = false;
        for (int i = 0; i < labCourses.length; i++) {
            if (course.toLowerCase().equals(labCourses[i])) {
                LabCourse labCourse = new LabCourse(course.toUpperCase(), 100+i, (short)(i+1));
                labCourse.display();
                normalCourse = true;
                break;
            }
            else{
                normalCourse = false;
            }
        }
        if (!normalCourse) {
            CollegeCourse2 collegeCourse = new CollegeCourse2(course.toUpperCase(), 142, (short)(4));
            collegeCourse.display();
        }
    }
}