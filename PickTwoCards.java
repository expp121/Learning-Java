/**
 * PickTwoCards
 */
public class PickTwoCards {

    public static void main(String[] args) {
        final byte CARDS_IN_SUIT=13;
        final String cardSuits = "shdc";
        byte cardNum; 
        byte suitNum; 
        char suit; 
        Card cards[]= new Card[10];

        for (Card card : cards) {
            card = new Card();
            cardNum = (byte)((Math.random()*100)%CARDS_IN_SUIT+1);
            suitNum = (byte)(((byte)(Math.random()*100))/25);
            suit = cardSuits.charAt(suitNum);
            card.setCardType(suit);
            card.setCardValue(cardNum);
            System.out.println(card.getCardValue() + " of " + card.getCardType());
        }
        
    }
}