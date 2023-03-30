package org.example;
import java.util.Scanner;
import java.math.*;

/* IMPORTANT !!!!!!!!

     This class actually started of the game so these reminder under this comment section is dramatically important


     **When writing the function code there could be some missing function if it is implement this functions.

     **The most important and annoying part of this project is shuffle and distribute functions for each set of the game

     **Also ı could not figure out Where should I implement useCard method in Player or PlayerDeck class so thing about this while writing the code.

     **Make getter setter proper also.

     **These comments are very important so do not forget to implement the things that I write above.

*/

public class TableController {
    // All the game is going to be controlled here.
    private Deck deck;
    private Player player1;
    //The real player
    private Bot bot1;//Other players
    private Bot bot2;
    private Bot bot3;
    private TableDeck tableDeck;
    private Scanner sc ;
    public static boolean broken;//in order to control if it is game broken or not to. determine for the bots which card they are going to use.



    public TableController(){
        this.deck =  new Deck();
        this.player1 = new Player("initial",1);
        this.bot1 = new Bot("Bot1",2);
        this.bot2 = new Bot("Bot2",3);
        this.bot3 = new Bot("Bot3",4);
        sc = new Scanner(System.in);


        //Player1's name going to be selected by the user.
        //Firstly, deck is going to be created here when this constructor called


    }
    public void startGame(){


        //starts game by using private functions included in THIS class.
        //take the input of the player's name.
        //player1.setName(name);

        //rounds going to be each play round which is going to be 13 for each set.
        //How many sets are there going to be is determined by the points that player gonna get.
        //Each set has 13 round in itself(52 deck 4 player basically 52/4 = 13)


        //WORK EXAMPLE//
        //deck.shuffle
        //distributeCards
        //setBids
        //startRound(->player..useCard // player.addPoint / player.deletePoint)
        //endRound(checkRoundWinner() works inside of it.. Also, tableDeck.clear() in order to begin new round with no card on the table)

        System.out.println("Welcome to the spade game.To start the game please write your username");
        player1.setName(sc.next());
        distributeCards();





    }
    private void startSet(){
        //starts the set of the game(set means each game which played with initial 52 cards deck. Also, each set has 13 round)
        this.broken = false;
        deck.shuffle();
        distributeCards();
        setBids();
        startRound();

    }
    private void endSet(){
        //clears the players deck and organize the game in order the start the other set.
        // if somebody's point is above 500 also determines the winner.

    }
    private void checkSetWinner(){
        //when the 13th round ends going to add points or delete points from player who made their guesses well or bad.
    }
    private void setBids(){
        //when game starts all the player must bid his guess.
        //AFTER THE DISTRBITUON OF CARDS
        System.out.println("Please enter your bid by looking at your spades.(Enter int value)");
        player1.setBids(sc.nextInt());
        //Bots bids are complicated


    }
    private void distributeCards(){

        //distributes 13 card every game in the beginning.
        //Takes card from Main Deck and distribute to each player's deck one by one(Because its already shuffled also going to distrbuted randomly)
        int k = 0;
        for(int i = 0;i<13;i++){
            if(k==0){
                int index = (k*13)+(int)(Math.random()*13*(k+1));
                player1.getPlayerDeck().addCard(deck.getDeck().getCardI(index));
            }else if(k==1){
                int index = (k*13)+(int)(Math.random()*13*(k+1));
                player1.getPlayerDeck().addCard(deck.getDeck().getCardI(index));
            }else if(k==2){
                int index = (k*13)+(int)(Math.random()*13*(k+1));
                player1.getPlayerDeck().addCard(deck.getDeck().getCardI(index));
            }else if(k==3){
                int index = (k*13)+(int)(Math.random()*13*(k+1));
                player1.getPlayerDeck().addCard(deck.getDeck().getCardI(index));
            }
        }
        System.out.println("çalışşş");
        System.out.println(player1.getPlayerDeck().toString());




    }
    private void startRound(){
        //starts round by distributing card to each player also controls to players point.
        //Going to check which round it is and also determine how many left(13 round must be)
    }
    private void endRound(){
        //ends round also organize game for the next round.(clears the tableDeck)
    }
    private void checkRoundWinner(){
        //This function going to determine who won the round, actually. After all the players made their moves this function
        //going to look the deck in the table (which contains 4 card) and determine who have played the winner card.
        //And roundcount point to this player
        //IMPORTANT!!! Look at the comment at the TableDeck class.(Explains how this function work with tableDeck)
    }


    private void endGame(){
        //when setGameWinner function implemented just after it this function going to work and sets everything to the normal.
        //For example bids going to be deleted and also points of each player.

    }


}
