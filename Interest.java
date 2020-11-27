import java.util.Scanner;

/**
 * Interest
 */
public class Interest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money you want to invest: ");
        float moneyInvested;
        moneyInvested = input.nextFloat();
        displayInterest(moneyInvested);
        input.close();
    }
    public static float calculateInterest(float value) {
        return (0.05f*value) + value;
    }
    public static void displayInterest(float value) {
        System.out.println("The money that you will receive will be: " + calculateInterest(value));
    }
}