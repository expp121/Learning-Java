import java.util.Scanner;/**
 * ShowStudent
 */
public class ShowStudent {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        String Id;
        System.out.print("Set the student's ID: ");
        Id=input.next();
        student.setId(Id);
        
        System.out.print("Set the student's number of credit hours earned: ");
        student.setNumberCreditHours(input.nextFloat());
        
        System.out.print("Set the student's number of points earned: ");
        student.setPointsEarned(input.nextShort());

        student.computeGradeAVG();

        System.out.print("\n\nID: " + student.getId() + "\nNumber of hours earned: " + 
        student.getNumberCreditHours() + "\nNumber of points earned: " + student.getNumberPointsEarned() + "\nStudent's grade point average is: " + student.getGradePointAvg());

        input.close();
    }
}