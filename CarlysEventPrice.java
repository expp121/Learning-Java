import java.util.Scanner;
public class CarlysEventPrice
{
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*  Carly's makes the food that makes it a party. *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many guest will attend the party: ");
        short guests = input.nextShort();
        System.out.println("The number of guests are: " +guests );
        System.out.println("The price per guest is $35");
        System.out.println("The total price is : $"+ guests*35);
        System.out.println("Does the event have more than 50 guests: " + (guests >= 50 ? "YES":"NO"));
        input.close();
    }
}