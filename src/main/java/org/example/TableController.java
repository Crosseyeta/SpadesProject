package org.example;

public class TableController {
    // All the game is going to be controlled here.
    private Deck deck;
    private Player player1;
    //The real player
    private Player bot1;//Other players
    private Player bot2;
    private Player bot3;
    private TableDeck tableDeck;



    public TableController(){
        //Player1's name going to be selected by the user.
        this.player1 = new Player("something",0);
        this.bot1 = new Player("Bot1",1);
        this.bot2 = new Player("Bot2",2);
        this.bot3 = new Player("Bot3",3);
        this.deck = new Deck();//Firstly, deck is going to be created here when this constructor called
        this.tableDeck = new TableDeck();

    }
    public void startGame(){

    //starts game by using private functions included in THIS class.
        //take the input of the player's name.
        //player1.setName(name);

        //WORK EXAMPLE//
        //deck.shuffle
        //distributeCards
        //setBids
        //startRound(->player..useCard // player.addPoint / player.deletePoint)
        //endRound(checkRoundWinner() works inside of it.. Also, tableDeck.clear() in order to begin new round with no card on the table)






    }
    private void distributeCards(){

        //distributes 13 card every game in the beginning.
        //Takes card from Main Deck and distribute to each player's deck one by one(Because its already shuffled)
    }
    private void checkRoundWinner(){
        //This function going to determine who won the round, actually. After all the players made their moves this function
        //going to look the deck in the table (which contains 4 card) and determine who have played the winner card.
        //And add point to this player
        //IMPORTANT!!! Look at the comment at the TableDeck class.(Explains how this function work with tableDeck)
    }
    private void startRound(){
        //starts round by distributing card to each player also controls to players point.
        //Going to check which round it is and also determine how many left(13 round must be)
    }
    private void endRound(){
        //ends round by giving point and punishments to each player.Also going to clear TableDeck.
    }
    private void setBids(){
        //when game starts all the player must bid his guess.
        //AFTER THE DISTRBITUON OF CARDS
    }
    private void setGameWinner(){
        //when the 13th round ends going to determine who won.
    }
    private void endGame(){
        //when setGameWinner function implemented just after it this function going to work and sets everything to the normal.
        //For example bids going to be deleted and also points of each player.
    }



}
