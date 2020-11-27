import java.util.Scanner;

/**
 * MetricConversion
 */
public class MetricConversion {

    public static void main(String[] args) {
        int val;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to be converted: ");
        val = input.nextInt();
        inchesToCentimeters(val);
        galonsToLiters(val);
        input.close();
    }
    public static void inchesToCentimeters(int inches) {
        float centimetersToInch=2.54F;
        System.out.println("\n\n=====================================\n"+inches + " inches are equal to "+ inches*centimetersToInch+"cm");
    }
    public static void galonsToLiters(int galons) {
        float galonsToLiters=3.7854F;
        System.out.println("=====================================\n"+galons + " galons are equal to "+ galons*galonsToLiters+" Liters");
        
    }
}