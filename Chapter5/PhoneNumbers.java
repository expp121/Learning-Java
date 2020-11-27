import java.util.Scanner;

public class PhoneNumbers {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String[] names = { "Mitanko", "Goshko", "Natalia", "Preslav", "Aleks", "Naruto", "Anatoli", "Emcho", "Billy",
                "Turboto", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        String[] phoneNumbers = { "61755642137", "5178655275", "238621412234", "51872374246", "12247387389",
                "890981231114", "6579823232", "18552724542", "672834533765", "764248324112", "", "", "", "", "", "", "",
                "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
        String name;
        byte counter = 0;
        boolean foundInArray = false;

        do {
            System.out.print(":");
            name = input.nextLine();

            if (name.equals("quit"))
                break;

            for (int i = 0; i < 10 + counter; i++) {
                if (names[i].equals(name.toString())) {
                    foundInArray = true;
                    System.out.print("His Phone Number: " + phoneNumbers[i]);
                    break;
                }
            }

            if (!foundInArray) {
                names[10 + counter] = name;
                System.out.print("Please specify his phone:");
                phoneNumbers[10 + counter] = input.nextLine();
            }

            counter++;

        } while (!foundInArray && counter <= 19);

        input.close();
    }
}