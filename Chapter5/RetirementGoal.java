import java.util.Scanner;

class RetirementGoal {
  
    static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    byte age;
    float canSaveAnnually;

    do {
        System.out.print("How many years you have until retirement?: ");
        age = input.nextByte();
        System.out.print("How much $ can you save annually?: ");
        canSaveAnnually = input.nextFloat();
          
    } while (age < 0 && canSaveAnnually < 0.0);

    System.out.println("You can save " + Math.round(age * canSaveAnnually) + "$ until retirement.");

  }

}