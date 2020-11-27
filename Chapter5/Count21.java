import java.util.Scanner;

class Count21 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        byte score = 0;
        boolean playerTurn = true;

        System.out.println(
                "You are now playing a game called 21, where you have to choose values between 1 and 3, which is added to the toal score\n You are playing versus very smart computer, the fist to exceed 21 losses");
        do {
            System.out.println("\n\nCURRENT SCORE: " + score);
            System.out.println("It's your turn.\n================");
            System.out.print("Enter a number\n");
            byte choice;

            do {
                System.out.print(":");
                choice = input.nextByte();
            } while (choice < 1 || choice > 3);
            System.out.println("Your choice was " + choice);
            score += choice;
            playerTurn = false;
            if (playerTurn == false && score > 21)
                System.out.println("You lost");
            System.out.println("Computer's turn\n==============");

            for (int i = 3; i > 1; i--) {
                if ((choice % i) == 0) {
                    System.out.println("The computer choosed: " + i);
                    score += i;

                    break;
                } else {
                    System.out.println("The computer choosed: 1");
                    score += 1;
                    break;

                }
            }
            playerTurn = true;
            if (playerTurn == true && score > 21)
                System.out.println("You lost");

        } while (score < 21);

        input.close();
    }
}