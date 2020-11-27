import java.util.Scanner;

public class CarpentryChoice2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        final String[] items = { "table", "desk", "dresser", "entertainment center" };
        final int[] prices = { 250, 325, 420, 600 };
        String item;
        boolean hasAtLeastOneMatch = false;
        System.out.print("Choose an item: Table, Desk, Dresser, Entertainment Center\n:");
        item = input.nextLine();
        item = item.toLowerCase();

        for (int i = 0; i < prices.length; i++) {
            if (item.substring(0, 3).equals(items[i].toString().substring(0, 3))) {
                hasAtLeastOneMatch = true;
                System.out.print("The price of the " + items[i].toString() + " is " + prices[i] + "$");
            }
        }
        if (!hasAtLeastOneMatch)
            System.out.println("Invalid Item");
        input.close();
    }
}
