import java.util.Random;
import java.util.Scanner;

class PigDiceGame {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        byte computerScore = 0;
        byte playerScore = 0;
        byte choice;
        byte dice1Roll;
        byte dice2Roll;

        do {
            System.out.println("\nYour Score: " + playerScore + "\nComputer Score: " + computerScore + "\n");
            System.out.print("What you want to do: \n1.Roll\n2.Pass\n:");
            choice = input.nextByte();

            switch (choice) {

                case 1:
                    dice1Roll = rollDice();
                    dice2Roll = rollDice();
                    System.out.print("\nYou rolled\nDice1: " + dice1Roll + "\nDice2: " + dice2Roll + "\nCombined: "
                            + (dice1Roll + dice2Roll) + "\n");

                    if (dice1Roll != 1 && dice2Roll != 1)
                        playerScore += (dice1Roll + dice2Roll);
                    else if (dice1Roll == 1 && dice2Roll == 1)
                        playerScore = 0;

                case 2:

                    Random rand = new Random();
                    float randomNumber = rand.nextFloat();
                    if (randomNumber < 0.5) {

                        dice1Roll = rollDice();
                        dice2Roll = rollDice();
                        System.out.print("\nThe computer choosed to roll\nHis rolls were\nDice1: " + dice1Roll
                                + "\nDice2: " + dice2Roll + "\nCombined: " + (dice1Roll + dice2Roll));
                        if (dice1Roll != 1 && dice2Roll != 1)
                            computerScore += (dice1Roll + dice2Roll);
                        else if (dice1Roll == 1 && dice2Roll == 1)
                            playerScore = 0;
                    } else
                        System.out.println("The computer coosed to pass.");

                    break;

                default:
                    System.out.print("Invalid Choice!");
                    break;
            }

        } while (computerScore < 100 && playerScore < 100);
        if (computerScore >= 100) {
            System.out.println("\nThe computer won.");
        } else
            System.out.println("\nYou won.");

        input.close();

    }

    public static byte rollDice() {
        Die dice = new Die();
        return (byte) dice.getValue();
    }
}