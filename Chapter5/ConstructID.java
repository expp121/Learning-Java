import java.util.Scanner;

class ConstructID {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        String name, street;
        String names[];
        StringBuilder id = new StringBuilder();

        System.out.print("Enter your full name: ");
        name = input.nextLine();

        System.out.print("Enter your street address: ");
        street = input.nextLine();

        names = name.split(" ");

        for (int i = 0; i < names.length; i++)
            if (Character.isLetter(names[i].charAt(0)))
                id.append(names[i].charAt(0));

        for (int i = 0; i < street.length(); i++)
            if (Character.isDigit(street.toCharArray()[i]))
                id.append(street.toCharArray()[i]);

        System.out.println("Your ID will be:" + id);
        input.close();

    }
}