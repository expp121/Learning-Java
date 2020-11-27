import java.util.Scanner;

class BarGraph{

  private static Scanner input = new Scanner(System.in);

  public static void main(String Args[])
  { 
    byte pam, leo, kim, bob;
    
    System.out.print("Enter cars sold by Pam: ");
    pam = input.nextByte();

    System.out.print("Enter cars sold by Leo: ");
    leo = input.nextByte();

    System.out.print("Enter cars sold by Kim: ");
    kim = input.nextByte();

    System.out.print("Enter cars sold by Bob: ");
    bob = input.nextByte();

    System.out.println("Car sales this month");

    System.out.println("Pam " + "X".repeat(pam));
    System.out.println("Leo " + "X".repeat(leo));
    System.out.println("Kim " + "X".repeat(kim));
    System.out.println("Bob " + "X".repeat(bob));

  }
}