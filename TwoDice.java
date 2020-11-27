/**
 * TwoDice
 */
public class TwoDice {

    public static void main(String[] args) {
        
        Die[] dies = new Die[1020];
        Die.setHIGHEST_DIE_VALUE((byte)122);

        for (Die die : dies) {
            die = new Die();
            displayValue(die);
        }
    }

    public static void displayValue(Die die){
        System.out.println("Die Value: " + die.getValue());
    }
}