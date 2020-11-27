import java.util.Scanner;
public class SammysRentalPrice
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        short minutes;
        byte hours;
        System.out.print("Enter for how many minutes you want to rent the equipment(Price for 1 hour is $40 and for every other minute it's 1$): ");
        minutes = input.nextShort();
        hours= (byte)(minutes/60);
        minutes= (short) (minutes - (hours*60));
        System.out.println("The price will be: $"+(hours*40 +minutes));
        input.close();
    }
}