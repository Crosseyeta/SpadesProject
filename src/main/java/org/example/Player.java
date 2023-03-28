package org.example;

public class Player {
    private String name;
    private int point;
    private int bids;
    private PlayerDeck deck;
    // each Player's bids going to be determined beginning of the game;
    private int playOrder;
    private int roundWinCount;

    public int getRoundWinCount() {

        //@return roundwincount in order to determine is player done it bid's.
    }

    public void setRoundWinCount(int roundWinCount) {
        //@param roundwincount in order the set roundwincount to 0 after each set ends.
    }

    public Player(){
        //for bot class
    }
    public Player(String name,int playOrder){
        //When first created each one of player's deck going to have zero card in it.And then 13 card will be distributed each one of them

    }

    public String getName() {


    }
    public void setName(String name){

    }

    public int getPoint() {

    }

    public void addPoint(int num){
        // @param int num which is going to be added to the current point of player
        //add points to the player
    }

    public PlayerDeck getDeck() {
        //in order to control the player deck in GameController class.
    }

    public void deletePoint(int num){
        // @param int num which is going to be deleted to the current point of player
        //deletes point from the player
    }

    public int getBids() {
        // @return int in order to print bids to the console.

    }

    public void setBids(int bids) {
        //@param int bids when the game starts each player must deal with some bids in order to start to game.

    }
    public void useCard(int index){

    }
    private class PlayerDeck {//This class just used by player and bot class bot class is also extended from player so made this inner class.
        //This class represent the deck of each player which is going to contain 13 card in the beginning of each
        // round and decrease set by set.
        private LinkedList playerDeck;
        public PlayerDeck(){

        }
        public void addCard(Card card){

            //@param Card card which is determined by the distribute function in the GameController
            //In the beginning of the game each player's deck going to be determined by this and distribute function.

        }
        public void useCard(int cardIndex){
            //@param String cardName which card , player wants to use
            //in each round when the turn comes to player, player going to be able to see his hand as a list with indexes
            //By looking at these indexes he/she can be able to determine which card is proper.

            //Also this function can be work with bot players.
        }
        public void showDeck(){
            //shows the deck to player but only shows to real player's deck in the console.
        }
    }

}
