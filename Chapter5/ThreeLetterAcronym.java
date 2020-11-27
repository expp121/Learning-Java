import java.util.Scanner;

class ThreeLetterAcronym {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        String userInput;
        userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("Integrated Development Environment"))
            System.out.println("IDE");
        if (userInput.equalsIgnoreCase("Java Development Kit"))
            System.out.println("JDK");
        if (userInput.equalsIgnoreCase("Java Virtual Machine"))
            System.out.println("JVM");
        if (userInput.equalsIgnoreCase("local area network"))
            System.out.println("LAN");
        input.close();
    }
}