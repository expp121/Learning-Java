import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args) {
        System.out.print("Enter how many eggs you want to buy: ");
        Scanner input= new Scanner(System.in);
        byte eggs;
        eggs= input.nextByte();
        System.out.print("So that's "+ eggs/12 + (eggs/12>1? " dozens ":" dozen ") +(eggs%12>0 ?  "and "+eggs%12+ " eggs. ":"")+"That will cost you "+((eggs/12)*2.0 +(eggs%12)*0.20)+"BGN");
        input.close();        
    }
}