/**
 * BirdSighting2
 */
public class BirdSighting2 {
    
    private String birdSpeciesSighted = "";
    private short seenBirds;
    private short dayOfYear;

    public BirdSighting2() {

        this("Naruto", (short)23,(short)222);
    }
    
    public BirdSighting2(String birdSpecies, short seenBirds, short dayOfYear) {
        this.birdSpeciesSighted = birdSpecies;
        this.seenBirds = seenBirds;
        this.dayOfYear = dayOfYear;
    }

    public String getBirdSpeciesSighted() {
        return birdSpeciesSighted;
    }

    public short getSeenBirds() {
        return seenBirds;
    }

    public short getDayOfYear() {
        return dayOfYear;
    }
    
}