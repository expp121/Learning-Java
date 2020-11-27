import java.util.Scanner;

class AssignVolunteer5{

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        String message;

        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;

        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        System.out.println("What type of donation is this?");
        System.out.println("Enter an integer(between 1 and 4): ");
        do {
            donationType = input.nextInt();
        } while (donationType < 1 || donationType > 4);
        
        switch (donationType) {
            case CLOTHING_CODE:
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation.";
                break;
    
            case FURNITURE_CODE:
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation.";
                break;
    
            case ELECTRONICS_CODE:
            volunteer = ELECTRONICS_PRICER;
            message = "a electronics donation.";
            break;

            case OTHER_CODE:
                volunteer = OTHER_PRICER;
                message = "another donation type.";
                break;

            default:
                volunteer = "invalid";
                message = "an invalid donation type";
                break;
        }

        System.out.println("You entered " + donationType);
        System.out.println("Your volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}