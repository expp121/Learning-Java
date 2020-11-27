import java.util.Scanner;

public class DivideStrings {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String[] strings = new String[20];
        String choice;
        for (int i = 0; i < strings.length; i++) {
            System.out.print(':');
            strings[i] = input.nextLine();
        }
        System.out.print("Which type of strings to display(long or short): ");
        choice = input.nextLine();
        if (choice.equals("short")) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() <= 5) {
                    System.out.println(strings[i]);
                }
            }

        } else if (choice.equals("long")) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > 5) {
                    System.out.println(strings[i]);
                }
            }
        } else
            System.out.println("Incorrect choice.");

        input.close();

    }
}