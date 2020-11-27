public class FiveDice2 {

  public static void main(String Args[]) {

    Die[] PCdies = new Die[5];
    Die[] playerDies = new Die[5];
    byte pcPairs = 0, playerPairs = 0;
    for (int i = 0; i < playerDies.length; i++) {
      PCdies[i] = new Die();
      playerDies[i] = new Die();
    }

    System.out.println("Computer dice");
    displayValue(PCdies);

    System.out.println("Player dice");
    displayValue(playerDies);

    pcPairs = numberOfPairs(PCdies);
    playerPairs = numberOfPairs(playerDies);

    System.out.println("The Computer has " + pcPairs);
    System.out.println("The player has " + playerPairs);

    if (pcPairs > playerPairs)
      System.out.println("Computer wins!");

    else if (pcPairs < playerPairs)
      System.out.println("You win!");
    else
      System.out.println("Tie");
  }

  public static byte numberOfPairs(Die[] dies) {
    byte temp = 0;
    for (int i = 1; i < dies.length; i++) {
      if (dies[i].getValue() == dies[i - 1].getValue()) {
        temp++;
      }
    }
    return temp;
  }

  public static void displayValue(Die[] dies) {

    for (int i = 0; i < dies.length; i++) {
      System.out.print(dies[i].getValue() + " ");
    }
    System.out.println();
  }
}