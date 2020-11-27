/**
 * TwoDice
 */
public class TwoDice {

    public static void main(String[] args) {
        
        Die die1 = new Die(), die2 = new Die();
        System.out.println("Die 1: " + die1.getValue());
        System.out.println("Die 2: " + die2.getValue());
        if (die1.getValue() > die2.getValue())
            System.out.println("Die 1");
        else if (die1.getValue() == die2.getValue())
                System.out.println("Equal");
        else System.out.println("Die 2");
    }

    public static void displayValue(Die die){
        System.out.println("Die Value: " + die.getValue());
    }
}