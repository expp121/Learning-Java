import java.util.Scanner;

public class CarpentryChoice {

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
            if (item.equals(items[i].toString())) {
                hasAtLeastOneMatch = true;
                System.out.print("The price of the " + items[i].toString() + " is " + prices[i] + "$");
            }
        }
        if (!hasAtLeastOneMatch)
            System.out.println("Invalid Item");
        input.close();
    }
}