import java.util.Scanner;

class BabyNameComparison {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        StringBuilder name1, name2, name3;

        System.out.print("Enter name1: ");
        name1 = new StringBuilder(input.nextLine());
        System.out.print("Enter name2: ");
        name2 = new StringBuilder(input.nextLine());
        System.out.print("Enter name3: ");
        name3 = new StringBuilder(input.nextLine());

        System.out.println("All possible combinations for names are:\n" + name1 + " " + name2 + "\n" + name1 + " "
                + name3 + "\n" + name2 + " " + name1 + "\n" + name2 + " " + name3 + "\n" + name3 + " " + name1 + "\n"
                + name3 + " " + name2 + "\n");
        input.close();

    }
}