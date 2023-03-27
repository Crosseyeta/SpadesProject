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
        // @param int num which is going to be added to the current point of player
        //add points to the player
    }
    public void deletePoint(int num){
        // @param int num which is going to be deleted to the current point of player
        //deletes point from the player
    }

    public int getBids() {
        // @return int in order to print bids to the console.
        return bids;
    }

    public void setBids(int bids) {
        //@param int bids when the game starts each player must deal with some bids in order to start to game.
        this.bids = bids;
    }

}
