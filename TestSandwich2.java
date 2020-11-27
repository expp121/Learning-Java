/**
 * TestSandwich2
 */
public class TestSandwich2 {

    public static void main(String[] args) {
        Sandwich2 normal = new Sandwich2();
        Sandwich2 blackBreadwithEggFill = new Sandwich2("Black bread", (short)50, "Egg Filling", (short)120);
        Sandwich2 cornBread = new Sandwich2("Corn bread", (short)45);
        Sandwich2 normalWithBeans = new Sandwich2((short)76, "Bean Filling");
        displaySandwich(normal);
        displaySandwich(blackBreadwithEggFill);
        displaySandwich(cornBread);
        displaySandwich(normalWithBeans);
    }

    public static void displaySandwich(Sandwich2 sandwich) {
        System.out.println("\nSandwich Bread: " + sandwich.getBread().getType() + " which is " + sandwich.getBread().getCaloriesPerSlice() + " calories per slice.");
        System.out.println("Sandwich Filling: " + sandwich.getFilling().getFillingType() + " which is " + sandwich.getFilling().getCaloriesInServing() + " calories per serving.");
        System.out.println("TOTAL CALORIES: " + (sandwich.getBread().getCaloriesPerSlice()*2 + sandwich.getFilling().getCaloriesInServing()));
    }
}