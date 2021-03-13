/**
 * Card
 */

public class Card2 {
    String cardType;
    String cardRank;
    byte cardValue;

    Card2() {
        cardType = " ";
        cardRank = " ";
        cardValue = 1;
    }

    public void setCardType(char cardType) {

        switch (cardType) {
        case 's':
            this.cardType = Suit.Cards.SPADES.toString();
            break;

        case 'h':
            this.cardType = Suit.Cards.HEARTS.toString();
            break;

        case 'd':
            this.cardType = Suit.Cards.DIAMONDS.toString();
            break;

        case 'c':
            this.cardType = Suit.Cards.CLUBS.toString();
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

        } else
            this.cardValue = 1;
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