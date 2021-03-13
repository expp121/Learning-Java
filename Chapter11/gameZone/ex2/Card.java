package cardGames;

/**
 * Card
 */

public class Card {
    String cardType;
    String cardRank;
    byte cardValue;

    Card() {
        cardType = " ";
        cardRank = " ";
        cardValue = 1;
    }

    public void setCardType(char cardType) {

        switch (cardType) {
        case 's':
            this.cardType = "spades";
            break;

        case 'h':
            this.cardType = "hearths";
            break;

        case 'd':
            this.cardType = "diamonds";
            break;

        case 'c':
            this.cardType = "clubs";
            break;

        default:
            break;
        }
    }

    public void setCardValue(byte cardValue) {

        if (cardValue > 0 && cardValue < 14) {
            this.cardValue = cardValue;

            if (cardValue == 1)
                this.cardRank = "Ace";

            if (cardValue > 1 && cardValue < 11)
                this.cardRank = Byte.toString(cardValue);

            if (cardValue == 11)
                this.cardRank = "Jack";

            if (cardValue == 12)
                this.cardRank = "Queen";

            if (cardValue == 13)
                this.cardRank = "King";

        }
    }

    public String getCardType() {
        return cardType;
    }

    public byte getCardValue() {
        return cardValue;
    }

    public String getCardRank() {
        return cardRank;
    }

}