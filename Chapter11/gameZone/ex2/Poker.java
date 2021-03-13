package cardGames;

public class Poker extends CardGame {
    public Poker() {
        super();
        super.numberOfCardsDealt = 2;
    }

    @Override
    public void displayDescription() {
        System.out.println(
                "\n\nPoker is any of a number of card games in which players wager over which hand is best according to that specific game's rules in ways similar to these rankings.");
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
