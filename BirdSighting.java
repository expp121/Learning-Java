/**
 * BirdSighting
 */
public class BirdSighting {
    String birdSpeciesSighted = "";
    short seenBirds;
    short dayOfYear;

    public BirdSighting() {
        birdSpeciesSighted = "robin";
        dayOfYear = 1;
    }

    public BirdSighting(String birdSpecies, short seenBirds, short dayOfYear){
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