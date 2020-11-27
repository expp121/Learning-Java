public class DemoTennisGames {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
        tennisGame.setNames("Dancho", "Naruto");
        tennisGame.setPlayersScores(2, 3);
        DoublesTennisGame doublesTennisGame = new DoublesTennisGame();
        doublesTennisGame.setNames("Toni", "Storato", "Asiz", "Topcho");
        doublesTennisGame.setPlayersScores(0, 1);
        System.out.println(tennisGame.getPlayer1Name()+ "\n" + 
        tennisGame.getPlayer1Score() + "\n" + tennisGame.getPlayer1FinalScore() + "\n");
        
        System.out.println(tennisGame.getPlayer2Name()+ "\n" + 
        tennisGame.getPlayer2Score() + "\n" + tennisGame.getPlayer2FinalScore() + "\n");


        System.out.println(doublesTennisGame.getPlayer1Name()+ "\n" + 
        doublesTennisGame.getPlayer1Partner() + "\n" +
        doublesTennisGame.getPlayer1Score() + "\n" + tennisGame.getPlayer1FinalScore() + "\n");


        System.out.println(doublesTennisGame.getPlayer2Name()+ "\n" + 
        doublesTennisGame.getPlayer2Partner() + "\n" +
        doublesTennisGame.getPlayer2Score() + "\n" + tennisGame.getPlayer2FinalScore() + "\n");
    }
}