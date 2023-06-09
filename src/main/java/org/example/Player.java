package org.example;

public class Player {
    private String name;
    private int point;
    private int bids;
    private LinkedList playerDeck;
    // each Player's bids going to be determined beginning of the game;
    private int playOrder;
    private int roundWinCount;
    private boolean lastWin;


    public boolean isLastWin() {
        return lastWin;
    }

    public void setLastWin(boolean lastWin) {
        this.lastWin = lastWin;
    }

    public int getRoundWinCount() {

        //@return roundwincount in order to determine is player done it bid's.
        return this.roundWinCount;
    }

    public void setRoundWinCount(int roundWinCount) {
        //@param roundwincount in order the set roundwincount to 0 after each set ends.
        this.roundWinCount = roundWinCount;
    }
    public void startWith(){

    }
    public void showDeck(){
        for(int i = 0;i<this.playerDeck.numberOfElements();i++){
            System.out.println(i+" "+this.playerDeck.getCardI(i).getSuit() + " " +this.playerDeck.getCardI(i).getPower());
        }
    }





    public Player(){
        //for bot class
    }
    public Player(String name,int playOrder){
        this.name = name;
        this.playOrder = playOrder;
        this.playerDeck = new LinkedList();
        this.lastWin = false ;

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

    public LinkedList getPlayerDeck() {
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

    public void addCard(Card card){
        //@param Card card which is determined by the distribute function in the GameController
        //In the beginning of the game each player's deck going to be determined by this and distribute function.
        this.playerDeck.insertPlayerDeck(card);

    }
    protected void deleteCardFDeck(int i){/*
        @param index that we want to delete
         */
        if(i ==0){
            this.playerDeck.deleteFirst();
        }else{
            Card prevCard = this.playerDeck.getCardI(i-1);
            Card nextCard = this.playerDeck.getCardI(i+1);
            prevCard.setNext(nextCard);
            this.playerDeck.getCardI(i).setNext(null);
        }
    }



}
