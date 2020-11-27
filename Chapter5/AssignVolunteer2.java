import java.util.Scanner;

class AssignVolunteer2{

    public static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, and " + 
        OTHER_CODE + " for anything else: ");
        
        donationType = input.nextInt();
        
        if (donationType == CLOTHING_CODE){
            volunteer = CLOTING_PRICER;
            message = "a clothing donation";
        }
        else {
            volunteer = OTHER_PRICER;
            message = "another donation";
        }

        System.out.println("You entered " + donationType);
        System.out.println("Your volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}