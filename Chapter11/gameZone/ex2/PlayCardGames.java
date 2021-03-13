package ex2;

import cardGames.Poker;
import cardGames.Bridge;

public class PlayCardGames {
    public static void main(String[] args) {

        Poker poker = new Poker();
        Bridge bridge = new Bridge();
        poker.displayDescription();
        poker.deal();
        bridge.displayDescription();
        bridge.deal();
    }
}
