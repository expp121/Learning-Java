import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args) {
        int ticketNumber;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a ticket number: ");
        ticketNumber= input.nextInt();
        byte lastDigit=(byte)(ticketNumber%10);
        ticketNumber=ticketNumber/10;
        if(ticketNumber%7==lastDigit)
            System.out.println("The Ticket is Valid");
        else 
            System.out.println("The Ticket is Unvalid");
        input.close();
    }
}