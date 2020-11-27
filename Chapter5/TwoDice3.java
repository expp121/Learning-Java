import java.util.Scanner;

class TwoDice3 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        byte counter = 0;
        byte combinedDiceVal;
        byte value;
        System.out.print("Enter a number between 2 and 12.\n");
        do {
            System.out.print("You have " + (3 - counter) + " tries:");

            value = input.nextByte();
            Die die1 = new Die(), die2 = new Die();
            combinedDiceVal = (byte) (die1.getValue() + die2.getValue());
            System.out.println(
                    "The Value that you entered is: " + value + "\nAnd the computer's value was " + combinedDiceVal);
            if (combinedDiceVal == value)
                System.out.println("You won!\n");
            else
                System.out.println("You lost!\n");

            counter++;
        } while (counter < 3 && (value != combinedDiceVal));
    }
}