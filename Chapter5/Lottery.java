
/**
 * Lottery
 */
import java.util.Scanner;

public class Lottery {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte randomNum1 = (byte)(Math.random()*9);
        byte randomNum2 = (byte)(Math.random()*9);
        byte randomNum3 = (byte)(Math.random()*9);
        byte randoGuess1;
        byte randoGuess2;
        byte randoGuess3;
        byte numOfMathces = 0;
        boolean exactMatch = false;

        System.out.println("Enter 3 numbers between 0..9");
        System.out.print("1:");
        randoGuess1 = input.nextByte();
        System.out.print("2:");
        randoGuess2 = input.nextByte();
        System.out.print("3:");
        randoGuess3 = input.nextByte();

        if(randoGuess1 == randoGuess2 && randoGuess1 == randoGuess3){
            if (randoGuess1 == randomNum1 || randoGuess1 == randomNum2 || randoGuess1 == randomNum3)
                numOfMathces++;
        }
        else if((randoGuess1 == randoGuess2 && randoGuess1 != randoGuess3) || (randoGuess2 == randoGuess3 && randoGuess2 != randoGuess1)|| (randoGuess3 == randoGuess1 && randoGuess3 != randoGuess2)){

            if (randoGuess1 == randoGuess2) {
                if (randoGuess1 == randomNum1 || randoGuess1 == randomNum2 || randoGuess1 == randomNum3)
                    numOfMathces++;
                if (randoGuess3 == randomNum1 || randoGuess3 == randomNum2 || randoGuess3 == randomNum3)
                    numOfMathces++;
            }
            else if (randoGuess1 == randoGuess3){
                if (randoGuess1 == randomNum1 || randoGuess1 == randomNum2 || randoGuess1 == randomNum3)
                    numOfMathces++;
                
                if (randoGuess2 == randomNum1 || randoGuess2 == randomNum2 || randoGuess2 == randomNum3)
                    numOfMathces++;
            }
            else {
                if (randoGuess2 == randomNum1 || randoGuess2 == randomNum2 || randoGuess2 == randomNum3)
                numOfMathces++;
                
                if (randoGuess1 == randomNum1 || randoGuess1 == randomNum2 || randoGuess1 == randomNum3)
                numOfMathces++;
            }

        
        }
        else {
            if (randoGuess1 == randomNum1 || randoGuess1 == randomNum2 || randoGuess1 == randomNum3)
            numOfMathces++;
        
            if (randoGuess2 == randomNum1 || randoGuess2 == randomNum2 || randoGuess2 == randomNum3)
                numOfMathces++;

            if (randoGuess3 == randomNum1 || randoGuess3 == randomNum2 || randoGuess3 == randomNum3)
                numOfMathces++;
        }

        if(randoGuess1 == randomNum1 && randoGuess2 == randomNum2 && randoGuess3 == randomNum3)
        {
            exactMatch = true;
            numOfMathces = 3;
        }

        System.out.println("The 3 numbers are\n" + randomNum1 + "\n" + randomNum2 + "\n" + randomNum3);
        
        switch (numOfMathces) {
            case 0:
                System.out.println("Your award is 0$");
            break;
            
            case 1:
                System.out.println("Your award is 10$");
            break;
            
            case 2:
                System.out.println("Your award is 100$");
            break;

            case 3:
                if (exactMatch) System.out.println("Your reward is 1,000,000$");
                else System.out.println("Your reward is 1,000$");
            break;
            
            default:
                break;
        }
                    
        input.close();
    }
}