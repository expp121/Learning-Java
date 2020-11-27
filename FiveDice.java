/**
 * FiveDice
 */
public class FiveDice {

    public static void main(String[] args) {
        
        Die dieP1 = new Die();
        Die dieP2 = new Die();
        Die dieP3 = new Die();
        Die dieP4 = new Die();
        Die dieP5 = new Die();
        System.out.print("Player: ");
        display(dieP1);
        display(dieP2);
        display(dieP3);
        display(dieP4);
        display(dieP5);

        Die dieC1 = new Die();
        Die dieC2 = new Die();
        Die dieC3 = new Die();
        Die dieC4 = new Die();
        Die dieC5 = new Die();
        System.out.print("\nComputer: ");
        display(dieC1);
        display(dieC2);
        display(dieC3);
        display(dieC4);
        display(dieC5);

    }
    public static void display(Die die) {
        System.out.print(die.getValue() + ",");
    }
}