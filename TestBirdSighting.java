/**
 * TestBirdSighting
 */
public class TestBirdSighting {

    public static void main(String[] args) {

        BirdSighting gencho = new BirdSighting();
        BirdSighting goshko = new BirdSighting("Naruto", (short)2,(short)3);

        System.out.println("Birds sighted: " + gencho.getBirdSpeciesSighted());
        System.out.println("Day of year: " + gencho.getDayOfYear());
        
        System.out.println("Birds sighted: " + goshko.getBirdSpeciesSighted());
        System.out.println("Day of year: " + goshko.getDayOfYear());
    }
}