package cardGames;

public class Bridge extends CardGame {
    public Bridge() {
        super();
        super.numberOfCardsDealt = 13;
    }

    @Override
    public void displayDescription() {
        System.out.println(
                "\n\nContract bridge, or simply bridge, is a trick-taking card game using a standard 52-card deck. In its basic format, it is played by four players in two competing partnerships, with partners sitting opposite each other around a table.");
    }

    @Override
    public void deal() {
        super.shuffle();
        Card[] playerCards = new Card[super.numberOfCardsDealt];

        for (int i = 0; i < super.numberOfCardsDealt; i++) {
            playerCards[i] = new Card();
            playerCards[i].setCardType(deck[i].getCardType().charAt(0));
            playerCards[i].setCardValue(deck[i].getCardValue());
        }

        System.out.println("You have drawn\n----------------");
        for (int i = 0; i < playerCards.length; i++)
            System.out.println(playerCards[i].getCardRank() + " of " + playerCards[i].getCardType());
    }

}
