package org.example;

public class Player {
    private String name;
    // private Deck deck; ??????
    private int point;
    private int bids;
    // each Player's bids going to be determined beginning of the game;
    public String getName() {
        return name;
    }
    /*public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }*/

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getBids() {
        return bids;
    }

    public void setBids(int bids) {
        this.bids = bids;
    }
}
