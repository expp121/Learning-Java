import java.util.Scanner;

public class PhoneBook {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String[] names = new String[20];
        String name;
        String[] phoneNumbers = new String[20];
        int i = -1;
        do {
            i++;
            System.out.print("Name: ");
            names[i] = input.nextLine();

            System.out.print("Phone Number: ");
            phoneNumbers[i] = input.nextLine();

        } while (i < 20 && !(names[i].equals("zzz")));

        System.out.println("You've entered " + i + "\nWhich person's phone to find: ");
        name = input.nextLine();

        for (int j = 0; j < i; j++) {
            if (name.equals(names[j].toString()))
                System.out.println("Phone: " + phoneNumbers[j]);

        }

        input.close();
    }
}