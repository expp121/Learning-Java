import java.util.Random;

public class FullDeck {

    public static void main(String Args[]) {
        Card[] cards = new Card[52];
        Random rand = new Random();
        byte cardType;
        byte cardValue;
        String type = "shdc";

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card();
            cardType = (byte) rand.nextInt(4);
            cardValue = (byte) (rand.nextInt(14) + 1);
            cards[i].setCardType(type.charAt(cardType));
            cards[i].setCardValue(cardValue);
            displayCard(cards[i]);
        }

    }

    public static void displayCard(Card card) {
        System.out.println("===============\n" + card.cardValue + " " + card.getCardType() + "\n===============\n");
    }
}