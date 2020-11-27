import java.util.Scanner;

class Alphabetize2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String string1, string2, string3;

        System.out.print("Sentence 1: ");
        string1 = input.nextLine();

        System.out.print("Sentence 2: ");
        string2 = input.nextLine();

        System.out.print("Sentence 3: ");
        string3 = input.nextLine();

        if (string1.toLowerCase().compareTo(string2) > 0 && string1.toLowerCase().compareTo(string3) > 0) {

            if (string2.toLowerCase().compareTo(string3) > 0) {
                System.out.println(string3);
                System.out.println(string2);
            } else {
                System.out.println(string2);
                System.out.println(string3);
            }

            System.out.println(string1);
        } else if (string2.toLowerCase().compareTo(string1) > 0 && string2.toLowerCase().compareTo(string3) > 0) {

            if (string1.toLowerCase().compareTo(string3) > 0) {
                System.out.println(string3);
                System.out.println(string1);
            } else {
                System.out.println(string1);
                System.out.println(string3);
            }

            System.out.println(string2);
        } else {

            if (string1.toLowerCase().compareTo(string2) > 0) {
                System.out.println(string2);
                System.out.println(string1);
            } else {
                System.out.println(string1);
                System.out.println(string2);
            }

            System.out.println(string3);
        }
        input.close();
    }
}