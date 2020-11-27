/**
 * Card
 */
public class Card {
    String cardType;
    byte cardValue;
    
    Card(){
        cardType = " ";
        cardValue = 1;
    }

    public String getCardType() {
        return cardType;
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

    public byte getCardValue() {
        return cardValue;
    }

    public void setCardValue(byte cardValue) {
        if (cardValue > 0 && cardValue < 14)
            this.cardValue = cardValue;
        else this.cardValue = 1;
    }

}