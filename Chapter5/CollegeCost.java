import java.util.Scanner;

class CollegeCost {
   static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
      byte childAge;
      float collegeCosts;
      System.out.print("Enter the child's current age: ");
      childAge = input.nextByte();
      do {
        System.out.print("Enter the estimated college costs: ");
        collegeCosts = input.nextFloat();
      } while (childAge > 18);
      System.out.println("You need to save " + collegeCosts/(18-childAge) + "$ each year for to cover the college costs.");
  }

}
