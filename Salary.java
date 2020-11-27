import java.util.Scanner;/**
 * Salary
 */
public class Salary {

    public static void main(String[] args) {
        float hourlyPayRate;
        float regularHours, overTimeHours;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter the hourly pay rate for the employee: ");
        hourlyPayRate=input.nextFloat();
    
        System.out.print("Enter the regular hours for the employee: ");
        regularHours= input.nextFloat();

        System.out.print("Enter over time hours for the employee: ");
        overTimeHours = input.nextFloat();
        System.out.print("Over time pay: "+ calcOvertimePay(regularHours,hourlyPayRate,overTimeHours)+"\n");
        input.close();

    }
    public static float calcOvertimePay(float regHours,float payRate,float overTimeHours) {
        return(float)((regHours*payRate)+(overTimeHours*1.5*payRate));
    }
}