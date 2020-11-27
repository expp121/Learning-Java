public class TennisGame {
    
    
 
    private String player1Name;
    private String player2Name;
    private int player1Score;
    private int player2Score;
    private String player1FinalScore;
    private String player2FinalScore;

	public String getPlayer1Name() {
		return player1Name;
    }
    
	public String getPlayer2Name() {
		return player2Name;
	}
    
    public int getPlayer1Score() {
		return player1Score;
	}
    
    public int getPlayer2Score() {
		return player2Score;
	}
    
    public String getPlayer1FinalScore() {
		return player1FinalScore;
	}
    
    public String getPlayer2FinalScore() {
		return player2FinalScore;
	}
    
    public void setNames(String player1, String player2){
        this.player1Name = player1;
        this.player2Name = player2;
    }

    public void setPlayersScores(int player1Scores, int player2Scores){
        if ((player1Scores>0 && player1Scores< 4) ||(player2Scores>0 && player2Scores< 4)){

            this.player1Score = player1Scores;
            this.player2Score = player2Scores;

            switch (player1Scores) {
                case 0:
                    this.player1FinalScore = "love";
                    break;
                case 1:
                    this.player1FinalScore = "15";
                    break;
        
                case 2:
                    this.player1FinalScore = "30";
                    break;
        
                case 3:
                    this.player1FinalScore = "40";
                    break;
        
                case 4:
                    this.player1FinalScore = "game";
                    break;
            
                default:
                    break;
            }

            switch (player2Scores) {
                case 0:
                    this.player2FinalScore = "love";
                    break;
                case 1:
                    this.player2FinalScore = "15";
                    break;
        
                case 2:
                    this.player2FinalScore = "30";
                    break;
        
                case 3:
                    this.player2FinalScore = "40";
                    break;
        
                case 4:
                    this.player2FinalScore = "game";
                    break;
            
                default:
                    break;
            }

        }
        else { 
            this.player1Score = 0;
            this.player2Score = 0;
            this.player1FinalScore = "error"; 
            this.player2FinalScore = "error";
        }
    }
}
