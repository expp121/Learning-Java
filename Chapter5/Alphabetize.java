import java.util.Scanner;

class Alphabetize {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String string1, string2, string3;

        System.out.print("Sentence 1: ");
        string1 = input.nextLine();

        System.out.print("Sentence 2: ");
        string2 = input.nextLine();

        System.out.print("Sentence 3: ");
        string3 = input.nextLine();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        string3 = string3.toLowerCase();

        if (string3.compareTo(string2) > 0 && string2.compareTo(string1) > 0)
            System.out.println("You've entered your sentences in alphabetical order");
        else
            System.out.println("You haven't entered your sentences in alphabetical order");
        input.close();
    }
}