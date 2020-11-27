/**
 * PickTwoCards
 */
public class War3 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        final byte CARDS_IN_SUIT = 13;
        final String cardSuits = "shdc";
        char suit;
        byte cardInDeck = 52;
        byte playerWins = 0;
        byte pcWins = 0;
        byte ties = 0;
        byte randomPcCard;
        byte randomPlayerCard;

        Card pcCard = new Card(), playerCard = new Card();
        Card[] playerDeck = new Card[52];
        Card[] pcDeck = new Card[52];

        for (int i = 0; i < pcDeck.length; i++) {

            playerDeck[i] = new Card();
            pcDeck[i] = new Card();
            playerDeck[i].setCardValue((byte) ((Math.random() * CARDS_IN_SUIT) + 1));
            pcDeck[i].setCardValue((byte) ((Math.random() * CARDS_IN_SUIT) + 1));

            suit = cardSuits.charAt((byte) (Math.random() * 4));
            pcDeck[i].setCardType(suit);
            suit = cardSuits.charAt((byte) (Math.random() * 4));
            playerDeck[i].setCardType(suit);
        }

        for (int i = 0; i < pcDeck.length; i++) {

            randomPcCard = (byte) (Math.random() * cardInDeck);
            randomPlayerCard = (byte) (Math.random() * cardInDeck);
            pcCard.setCardValue(pcDeck[randomPcCard].getCardValue());
            pcCard.setCardType(pcDeck[randomPcCard].getCardType().charAt(0));
            playerCard.setCardValue(playerDeck[randomPlayerCard].getCardValue());
            playerCard.setCardType(playerDeck[randomPlayerCard].getCardType().charAt(0));

            if (pcCard.getCardValue() > playerCard.getCardValue()) {
                System.out.println("PC Wins! " + pcCard.getCardValue() + " " + pcCard.getCardType() + " vs "
                        + playerCard.getCardValue() + " " + playerCard.getCardType());
                pcWins++;
            } else if (pcCard.getCardValue() < playerCard.getCardValue()) {
                System.out.println("You Win! " + playerCard.getCardValue() + " " + playerCard.getCardType() + " vs "
                        + pcCard.getCardValue() + " " + pcCard.getCardType());
                playerWins++;
            } else {
                System.out.println("Tie!");
                ties++;
            }

            for (int j = randomPcCard; j < cardInDeck - 1; j++)
                pcDeck[j] = pcDeck[j + 1];

            for (int j = randomPlayerCard; j < cardInDeck - 1; j++)
                playerDeck[j] = playerDeck[j + 1];

            cardInDeck--;

        }
        System.out.println("PC Wins: " + pcWins + "\nPlayer Wins: " + playerWins + "\nTies: " + ties);

        long stopTime = System.currentTimeMillis();
        System.out.println("It took " + ((stopTime - startTime) / 1000d) + " seconds to execute");

    }
}