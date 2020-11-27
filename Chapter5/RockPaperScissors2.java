import java.util.Scanner;

class RockPaperScissors2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        StringBuilder hand = new StringBuilder(" ");

        byte pcAnswer = (byte) ((Math.random() * 100 % 3) + 1);
        byte playerChoise = 0;

        while (hand.length() < 2 || !(hand.toString().substring(0, 2).toLowerCase().equals("ro")
                || hand.toString().substring(0, 2).toLowerCase().equals("pa")
                || hand.toString().substring(0, 2).toLowerCase().equals("sc"))) {

            hand.delete(0, hand.length());
            System.out.print("(rock,paper,scissors): ");
            hand.append(input.nextLine());

        }

        if (hand.toString().substring(0, 2).toLowerCase().equals("ro"))
            playerChoise = 1;
        if (hand.toString().substring(0, 2).toLowerCase().equals("pa"))
            playerChoise = 2;
        if (hand.toString().substring(0, 2).toLowerCase().equals("sc"))
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