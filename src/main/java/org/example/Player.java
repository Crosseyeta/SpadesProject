package org.example;

public class Player {
    private String name;
    // private Deck deck; ??????
    private int point;
    private int bids;
    // each Player's bids going to be determined beginning of the game;
    public Player(String name){
        this.name = name;
        this.point = 0;
        this.bids = 0;
    }


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

    public void addPoint(int num){
        //add points to the player
    }
    public void deletePoint(int num){
        //deletes point from the player
    }

    public int getBids() {
        return bids;
    }

    public void setBids(int bids) {
        this.bids = bids;
    }
}
