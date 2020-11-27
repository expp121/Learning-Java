/**
 * TestSandwichFilling
 */
public class TestSandwichFilling {

    public static void main(String[] args) {
        SandwichFilling defaultSandwichFilling  = new SandwichFilling();
        SandwichFilling eggFilling = new SandwichFilling("Egg filling", (short)50);
        SandwichFilling beaFilling = new SandwichFilling("Bean filling", (short)21);
        System.out.println("Filling: " + eggFilling.getFillingType() +  " is " + eggFilling.getCaloriesInServing() + " calories.");
        System.out.println("Filling: " + beaFilling.getFillingType() +  " is " + beaFilling.getCaloriesInServing() + " calories.");
        System.out.println("Filling: " + defaultSandwichFilling.getFillingType() +  " is " + defaultSandwichFilling.getCaloriesInServing() + " calories.");
    }
}