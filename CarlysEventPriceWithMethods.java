import java.util.Scanner;/**
 * CarlysEventPriceWithMethods
 */
public class CarlysEventPriceWithMethods {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        input.close();
    }
    public static short getNumberOfGuests() {
        System.out.print("Enter how many guest will attend the party: ");
        short guests = input.nextShort();
        input.nextLine();
        return guests;
    }

    public static void displayCompanyMotto() {
        System.out.print(
        "\n\n**************************************************\n" 
        + "*                                                *\n"
        + "*  Carly's makes the food that makes it a party. *\n"
        + "*                                                *\n"
        + "**************************************************\n");
    }

    public static void computePrice(short guests) {
        System.out.println("The price per guest is $35");
        System.out.println("The total price is : $" + guests*35);
        System.out.println("Does the event have more than 50 guests: " + (guests >= 50 ? "YES":"NO"));
    }

    public static String getEventNumber()
    {
        System.out.print("Enter the event number: ");
        return input.nextLine();
    }
}