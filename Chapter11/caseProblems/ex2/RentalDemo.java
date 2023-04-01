package Chapter11.caseProblems.ex2;
/**
 * RentalDemo
 */
import java.util.Scanner;

public class RentalDemo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Rental[] rentals = new Rental[3];
        for (int i = 0; i < rentals.length; i++) {
            rentals[i] = instantiateObj();
        }
        for (int i = 0; i < rentals.length; i++) {
            displayObj(rentals[i]);
        }
        input.close();
    }

    public static Rental instantiateObj() {
        System.out.println("Enter contract number and minutes.");
        System.out.print("Contract number:");

        short minutes;
        String contractNumber;

        contractNumber = input.nextLine();
        System.out.print("Minutes[60..7200]");

        do {
            System.out.print(":");
            minutes = input.nextShort();

        } while (minutes < 60 || minutes > 7200);
        input.nextLine();
        return new Rental(contractNumber, minutes);
    }

    public static void displayObj(Rental rental) {
        System.out.println(
                "\nContract Number: " + rental.getContractNumber() + "\nRental Hours: " + rental.getRentalHours()
                        + "\nRental minutes: " + rental.getRentalMinutes() + "\nPrice: " + rental.getPrice() + "$\n");
    }
}