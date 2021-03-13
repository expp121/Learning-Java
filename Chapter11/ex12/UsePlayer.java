package ex12;

import players.Player;
import players.Child;
import players.Actor;
import players.Musician;

public class UsePlayer {
    public static void main(String[] args) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length - 1; i += 3) {
            players[i] = new Child();
            players[i + 1] = new Actor();
            players[i + 2] = new Musician();
        }
        for (int i = 0; i < players.length; i++)
            players[i].play();
    }
}
