/**
 * Coffe
 */
import java.util.Scanner;

public class Coffe {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        byte choise;
        float price = 0;

        displayMenu();

        choise = input.nextByte();

        while (choise != 0 ) { 

            switch (choise) {
                case 0:
                    System.out.println("Your total bill is: " + price);
                    continue;

                case 1:
                    displayMenu();
                    price += 1.99;
                    choise = input.nextByte();
                    continue;

                case 2:
                    displayMenu();
                    price += 2.50;
                    choise = input.nextByte();
                    continue;
                    
                case 3:
                    displayMenu();
                    price +=2.15;
                    choise = input.nextByte();
                    continue;
            
                default:
                    System.out.println("Invalid Entry.");
                    break;
            }   
        }
        System.out.println("Your total bill is: " + price);

    }

    public static void displayMenu(){
        System.out.print("_________________________\n" + 
                           "(1)American      1,99\n" + 
                           "(2)Espresso       2,50\n" + 
                           "(3)Latte        2,15\n" +
                           "(0)For the bill\n" + 
                           "_________________________\n" + 
                           "Choose an item: ");
    }
}