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
    private int totalNone0 = 0;
    private double avg;
    private boolean scoresAgree;


    public DogTriathlonParticipant(String name, int numEvents, int obedieceScore, int conformationScore, int agilityScore) {
        this.name = name;
        this.NUM_EVENTS = numEvents;
        this.total = this.obedieceScore + this.conformationScore + this.agilityScore;

        totalNone0 += (obedieceScore>0) ? 1:0;
        totalNone0 += (conformationScore>0) ? 1:0;
        totalNone0 += (agilityScore>0) ? 1:0;

        if (numEvents == 0) 
            this.avg = 0;
        else this.avg = (double)this.total/this.NUM_EVENTS;

        if (numEvents == totalNone0) {
            this.scoresAgree = true;
        } 
        else {
            this.scoresAgree = false;
        }

        if (this.scoresAgree) {    
            this.obedieceScore = obedieceScore;
            this.conformationScore = conformationScore;
            this.agilityScore = agilityScore;
        } 
        else {
            this.obedieceScore = 0;
            this.conformationScore = 0;
            this.agilityScore = 0;    
        }

        DogTriathlonParticipant.totalCumulativeScore += this.total;
    }
    
    public void display() {
        System.out.println(this.name + " participated in " + this.NUM_EVENTS + " events and has an average score of " + this.avg);
        System.out.println("    " + this.name + " has a total score of " + this.total + " bringing the total cumulative score to " + 
        DogTriathlonParticipant.totalCumulativeScore + "\n\n");
        if (!this.scoresAgree) {
            System.out.println("Notice! Number of events for " + this.name + " does not agree with scores reported.");
            
        }

    }

}