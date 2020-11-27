import java.util.Scanner;

/**
 * CarlysEventPriceWithMethods
 */
public class CarlysEventPriceWithMethods {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        input.close();
    }

    public static String getPhoneNumber() {
        System.out.print("Enter the Phone number: ");
        return input.nextLine();
    }

    public static String getEventNumber() {
        System.out.print("Enter the event number: ");
        return input.nextLine();
    }

    public static int getEventType() {
        int eventType;
        System.out.println("Choose event type:\n1.Wedding\n2.Baptism\n3.Birthday\n4.Corporate\n5.Other");
        eventType = input.nextInt();
        input.nextLine();
        return eventType - 1;

    }

    public static short getNumberOfGuests() {
        System.out.print("Enter how many guest will attend the party: ");
        short guests;
        do {
            guests = input.nextShort();
        } while (guests < 5 || guests > 100);

        input.nextLine();
        return guests;
    }

    public static void displayCompanyMotto() {
        System.out.print("\n\n**************************************************\n"
                + "*                                                *\n"
                + "*  Carly's makes the food that makes it a party. *\n"
                + "*                                                *\n"
                + "**************************************************\n");
    }

    public static void computePrice(short guests) {
        System.out.println("The price per guest is $35");
        System.out.println("The total price is : $" + guests * 35);
        System.out.println("Does the event have more than 50 guests: " + (guests >= 50 ? "YES" : "NO"));
    }

}