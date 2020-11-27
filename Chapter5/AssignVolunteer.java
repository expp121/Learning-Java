import java.util.Scanner;

class AssignVolunteer {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, and " + OTHER_CODE + " for anything else: ");
        donationType = input.nextInt();
        if (donationType == 1)
            volunteer = CLOTING_PRICER;
        else
            volunteer = OTHER_PRICER;
        System.out.println("You entered " + donationType);
        System.out.println("Your volunteer who will price this item is " + volunteer);
        input.close();
    }
}