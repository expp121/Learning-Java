public class DoublesTennisGame extends TennisGame{
    private String player1Partner;
    private String player2Partner;

    public String getPlayer1Partner(){
        return this.player1Partner;
    }

    public String getPlayer2Partner(){
        return this.player2Partner;
    }

    
    public void setNames(String player1, String player2, String player3, String player4){
        super.setNames(player1, player2);
        this.player1Partner = player3;
        this.player2Partner = player4;   
    }
}