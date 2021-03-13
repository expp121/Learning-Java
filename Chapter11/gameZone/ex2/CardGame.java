package cardGames;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class CardGame {
    protected Card[] deck = new Card[52];
    protected byte numberOfCardsDealt = 0;

    public CardGame() {
        byte currentCard = 0;
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++) {
                deck[currentCard] = new Card();
                deck[currentCard].setCardValue((byte) (i + 1));
                deck[currentCard].setCardType("shdc".charAt(j));
                currentCard++;
            }
    }

    public void shuffle() {
        List<Card> temp = Arrays.asList(deck);
        Collections.shuffle(temp);
        temp.toArray(deck);
    }

    public abstract void displayDescription();

    public abstract void deal();

}
