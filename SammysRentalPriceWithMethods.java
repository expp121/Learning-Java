import java.util.Scanner;
/**
 * SammysRentalPriceWithMethods
 */
public class SammysRentalPriceWithMethods {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        short minutes;
        displayCompanyMotto();
        minutes = inputRentalTime(minutes);
        input.close();
    }

    public static short inputRentalTime(short minutes) {
        System.out.print("Enter for how many minutes you want to rent the equipment: ");
        minutes = input.nextShort();
        return minutes;
    }

    public static String getContractNumber() {
        String number;
        System.out.print("Enter a Contract Number: ");
        number = input.nextLine();
        return number; 
    }

    public static void displayCompanyMotto() {
        System.out.print("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n" + 
        "Ss                                    Ss\n" + 
        "Ss Sammy’s makes it fun in the sun. Ss\n" + 
        "Ss                                    Ss\n" + 
        "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
    }

    public static void computePrice(Rental rent) {
        System.out.println("Contract Number:" + rent.getContractNumber() + "\nThe price for " + rent.getRentalHours() + " hour/s and " + rent.getRentalMinutes() + " minutes will be: " + rent.getPrice() + "$\n");
    }
    
    public static void getDumpInput() {
        input.nextLine();
    }
    
}