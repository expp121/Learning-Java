/**
 * Temperatures
 */
import java.util.Scanner;

public class Temperatures {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float dayLowestTemp, dayHighestTemp;

        System.out.print("Enter the day's lowest temperature: ");
        dayLowestTemp = input.nextFloat();
        System.out.print("Enter the day's highest temperature: ");
        dayHighestTemp = input.nextFloat();
        
        if (dayHighestTemp >= 90)
            System.out.println("Heat warning!");

        if (dayLowestTemp<32)
            System.out.println("Freeze warning!");

        if((dayHighestTemp-dayLowestTemp)>40)
            System.out.println("Large temperature swing.");
        
        
    }
}