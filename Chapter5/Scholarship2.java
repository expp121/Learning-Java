/**
 * Scholarship
 */
import java.util.Scanner;

public class Scholarship2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float studentHighPointAvg;
        byte studentActivities, studentServiceActivities;
        System.out.print("Enter the student's numeric high school grade point average (for example 3,2): ");
        studentHighPointAvg = Math.round(input.nextFloat());
        System.out.print("Also the student's number of extracurricular activities: ");
        studentActivities = input.nextByte();
        System.out.print("And the student's number of service activities: ");
        studentServiceActivities = input.nextByte();
        if((studentActivities < 0 || studentServiceActivities < 0)|| (studentHighPointAvg <= 0f || studentHighPointAvg > 4.0f)){
            System.out.println("Invalid data.");
        }
        else{
            if((studentHighPointAvg >= 3.8f && studentActivities > 0 && studentServiceActivities > 0) || ((studentHighPointAvg < 3.8f && studentHighPointAvg >= 3.4f) && (studentActivities + studentServiceActivities) > 2) ||((studentHighPointAvg < 3.4f && studentHighPointAvg >= 3.0f) && studentActivities > 1 && studentServiceActivities > 2))
                System.out.println("Scholarship candidate.");
            else
                System.out.println("Not a candidate");
        }
        
        input.close();
    }
}