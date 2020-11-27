import java.util.Scanner;

public class IntegerDemoInteractiveWithName{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name; 

        System.out.print("Please enter an INTEGER: "); anInt=input.nextInt();
        System.out.print("Please enter a BYTE: "); aByte=input.nextByte();
        System.out.print("Please enter a SHORT: ");aShort=input.nextShort();
        System.out.print("Please ener a LONG: "); aLong=input.nextLong();
        
        int anotherInt= anInt *10000000;

        System.out.println("The int is "+ anInt);        
        System.out.println("The byte is "+ aByte);
        System.out.println("The short is "+ aShort);
        System.out.println("The long is "+ aLong);
        System.out.println("Another int is "+ anotherInt);
        input.nextLine();
        System.out.print("Please enter your name: "); name=input.nextLine();
        System.out.println("Thank you, "+name);
        input.close();
    }
}