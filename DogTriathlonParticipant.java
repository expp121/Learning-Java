/**
 * DogTriathlonParticipant
 */
public class DogTriathlonParticipant {

    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;
    private String name;
    private int obedieceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public DogTriathlonParticipant(String name, int numEvents, int obedieceScore, int conformationScore, int agilityScore) {
        this.name = name;
        this.NUM_EVENTS = numEvents;
        this.obedieceScore = obedieceScore;
        this.conformationScore = conformationScore;
        this.agilityScore = agilityScore;
        this.total = this.obedieceScore + this.conformationScore + this.agilityScore;
        this.avg = (double)this.total/this.NUM_EVENTS;
        this.totalCumulativeScore+=this.total;
    }
    
    public void display() {
        System.out.println(this.name + " participated in " + this.NUM_EVENTS + " events and has an average score of " + this.avg);
        System.out.println("    " + this.name + " has a total score of " + this.total + " bringing the total cumulative score to " + 
        this.totalCumulativeScore + "\n\n");

    }

}