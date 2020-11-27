
public class TestLoadedDie {
    public static void main(String[] args) {
        Die2[] dies = new Die2[3];
        LoadedDie die;
        short howManyTimesDieIsHigher = 0;
        
        for (int i = 0; i < 1000; i++) {
            dies[0] = new Die2();
            dies[1] = new Die2();

            if (dies[0].getValue()> dies[1].getValue())
            howManyTimesDieIsHigher++;

        }

        System.out.println("Die 1 was " + howManyTimesDieIsHigher + " times with a higher value than die 2");
        howManyTimesDieIsHigher = 0;

        for (int i = 0; i < 1000; i++) {
            dies[2] = new Die2();
            die = new LoadedDie();

            if (dies[2].getValue()> die.getValue())howManyTimesDieIsHigher++;

        }

        System.out.println("Die object has won " + howManyTimesDieIsHigher + " times against LoadedDie object.");
    }
}
