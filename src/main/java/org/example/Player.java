package org.example;

public class Player {
    private String name;
    // private Deck deck; ??????
    private int point;
    private int bids;
    protected PlayerDeck deck;
    // each Player's bids going to be determined beginning of the game;
    private int playOrder;
    public Player(String name,int playOrder){
        this.name = name;
        this.point = 0;
        this.bids = 0;
        this.deck = new PlayerDeck();//When first created each one of player's deck going to have zero card in it.And then 13 card will be distributed each one of them
        this.playOrder = playOrder;

    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

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
        //in order to show your bid to the screen
        return bids;
    }

    public void setBids(int bids) {
        //Each player going to bid with this function
        this.bids = bids;
    }
}
