package org.example;

public class Player {
    private String name;
    private int point;
    private int bids;
    private PlayerDeck playerDeck;
    // each Player's bids going to be determined beginning of the game;
    private int playOrder;
    private int roundWinCount;

    public int getRoundWinCount() {

        //@return roundwincount in order to determine is player done it bid's.
        return this.roundWinCount;
    }

    public void setRoundWinCount(int roundWinCount) {
        //@param roundwincount in order the set roundwincount to 0 after each set ends.
        this.roundWinCount = roundWinCount;
    }

    public Player(){
        //for bot class
    }
    public Player(String name,int playOrder){
        this.name = name;
        this.playOrder = playOrder;
        this.playerDeck = new PlayerDeck();
        //When first created each one of player's deck going to have zero card in it.And then 13 card will be distributed each one of them

    }

    public String getName() {
        return this.name;


    }
    public void setName(String name){
        this.name = name;
    }

    public int getPoint() {
        return this.point;
    }

    public void addPoint(int num){
        // @param int num which is going to be added to the current point of player
        //add points to the player
        this.point +=num;
    }

    public PlayerDeck getPlayerDeck() {
        //in order to control the player deck in GameController class.
        return this.playerDeck;
    }

    public void deletePoint(int num){
        // @param int num which is going to be deleted to the current point of player
        //deletes point from the player
        this.point -= num;
    }

    public int getBids() {
        // @return int in order to print bids to the console.
        return this.bids;

    }

    public void setBids(int bids) {
        //@param int bids when the game starts each player must deal with some bids in order to start to game.
        this.bids = bids;
    }
    public void useCard(int index){

    }


}
