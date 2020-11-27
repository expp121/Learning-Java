
import java.util.Scanner;

public class UseDinnerParty {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Party party = new Party();
        int choice;
        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Please enter the number of guests:");
        party.setGuests(input.nextInt());
        input.nextLine();
        System.out.println("The party has " + party.getGuests() + " guests");
        party.displayInvitation();
        
        System.out.print("Please enter the number of guests:");
        dinnerParty.setGuests(input.nextInt());
        input.nextLine();
        System.out.print("Enter a menu option\n1.Chicken\n2.Beef\n>> ");
        choice = input.nextInt();
        dinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has " + dinnerParty.getGuests() + " guests\nMenu option " + dinnerParty.getDinnerChoice() + " will be served");
        dinnerParty.displayInvitation();
    }
}