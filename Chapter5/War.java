/**
 * PickTwoCards
 */
public class War {

    public static void main(String[] args) {
        final byte CARDS_IN_SUIT = 13;
        final String cardSuits = "shdc";
        byte cardNum;
        byte suitNum;
        char suit;
        Card pcCard = new Card(), playerCard = new Card();

        /// Computer's cards
        cardNum = (byte) ((Math.random() * 100) % CARDS_IN_SUIT + 1);
        suitNum = (byte) (((byte) (Math.random() * 100)) / 25);
        suit = cardSuits.charAt(suitNum);
        pcCard.setCardType(suit);
        pcCard.setCardValue(cardNum);

        /// Player's Cards
        do {
            cardNum = (byte) ((Math.random() * 100) % CARDS_IN_SUIT + 1);
            suitNum = (byte) (((byte) (Math.random() * 100)) / 25);
            suit = cardSuits.charAt(suitNum);
            playerCard.setCardType(suit);
            playerCard.setCardValue(cardNum);

        } while (playerCard.getCardType() == pcCard.getCardType()
                && playerCard.getCardValue() == pcCard.getCardValue());

        System.out.print("\nComputer's\n------------------\nCard: " + pcCard.getCardValue() + " of "
                + pcCard.getCardType() + "\n\n");
        System.out.print("\nPlayer's \n------------------\nCard: " + playerCard.getCardValue() + " of "
                + playerCard.getCardType() + "\n\n");

        if (pcCard.getCardValue() > playerCard.getCardValue())
            System.out.println("Computer Wins!!!");
        else if (pcCard.getCardValue() == playerCard.getCardValue())
            System.out.println("Drawn");
        else
            System.out.println("Player Wins!!!");

    }
}