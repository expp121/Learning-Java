/**
 * RockPaperScissors
 */
import java.util.Scanner;

public class RockPaperScissors {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte pcAnswer = (byte)((Math.random() * 100 % 3) + 1);
        byte playerChoise;
        System.out.print("Enter\n1. For rock\n2. For paper\n3. For Scissors\n:");
        playerChoise = input.nextByte();

        switch (playerChoise) {
            case 1:
                if (pcAnswer == 2) System.out.println("You Lose!!\nPc Choosed Paper");
                else if (pcAnswer == 1) 
                    System.out.println("Tie");
                else System.out.println("You win!!!\nPc Choosed Scissors");               
            break;
 
            case 2:
                if (pcAnswer == 2) System.out.println("Tie");
                else if (pcAnswer == 1) 
                    System.out.println("You win!!!\nPc Choosed Rock");
                else System.out.println("You Lose!!\nPc Choosed Scissors"); 
            break;

            case 3:
                if (pcAnswer == 3) System.out.println("Tie");
                else if (pcAnswer == 1) 
                    System.out.println("You Lose!!\nPc Choosed Rock"); 
                else System.out.println("You win!!!\nPc Choosed Paper");
            break;
        
            default:
                break;
        }

        input.close();
    }
}