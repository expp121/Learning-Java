import java.util.Scanner;

class RockPaperScissors3 {

    enum Hand {
        ROCK, PAPER, SCISSORS;
    }

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        StringBuilder hand = new StringBuilder(" ");

        byte pcAnswer = (byte) ((Math.random() * 100 % 3) + 1);
        byte playerChoise = 0;

        while (hand.length() < 2 || !(hand.toString().substring(0, 2).toLowerCase()
                .equals(Hand.values()[0].toString().substring(0, 2).toLowerCase())
                || hand.toString().substring(0, 2).toLowerCase()
                        .equals(Hand.values()[1].toString().substring(0, 2).toLowerCase())
                || hand.toString().substring(0, 2).toLowerCase()
                        .equals(Hand.values()[2].toString().substring(0, 2).toLowerCase()))) {

            hand.delete(0, hand.length());
            System.out.print("(rock,paper,scissors): ");
            hand.append(input.nextLine());

        }

        if (hand.toString().substring(0, 2).toLowerCase()
                .equals(Hand.values()[0].toString().substring(0, 2).toLowerCase()))
            playerChoise = 1;
        if (hand.toString().substring(0, 2).toLowerCase()
                .equals(Hand.values()[1].toString().substring(0, 2).toLowerCase()))
            playerChoise = 2;
        if (hand.toString().substring(0, 2).toLowerCase()
                .equals(Hand.values()[2].toString().substring(0, 2).toLowerCase()))
            playerChoise = 3;

        switch (playerChoise) {
            case 1:
                if (pcAnswer == 2)
                    System.out.println("You Lose!!\nPc Choosed Paper");
                else if (pcAnswer == 1)
                    System.out.println("Tie");
                else
                    System.out.println("You win!!!\nPc Choosed Scissors");
                break;

            case 2:
                if (pcAnswer == 2)
                    System.out.println("Tie");
                else if (pcAnswer == 1)
                    System.out.println("You win!!!\nPc Choosed Rock");
                else
                    System.out.println("You Lose!!\nPc Choosed Scissors");
                break;

            case 3:
                if (pcAnswer == 3)
                    System.out.println("Tie");
                else if (pcAnswer == 1)
                    System.out.println("You Lose!!\nPc Choosed Rock");
                else
                    System.out.println("You win!!!\nPc Choosed Paper");
                break;

            default:
                break;
        }

        input.close();
    }
}