import java.util.Scanner;
/**
 * TestSandwich
 */
public class TestSandwich {

    public static void main(String[] args) {
        Sandwich sandw = new Sandwich();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ingredients that you want: ");
        sandw.setIngredient(input.nextLine());
        System.out.print("Enter the bread type that you want: ");
        sandw.setBreadType(input.nextLine());
        System.out.print("Enter the price for the sandwich: ");
        sandw.setPrice(input.nextFloat());

        System.out.print("\n\nThe ingredients of the sandwich are: " + sandw.getIngredient() +"\nThe bread type of the sandwich is: " + sandw.getBreadType() + "\nAnd the price of it is: " + sandw.getPrice() );
        input.close();

    }
}