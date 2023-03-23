package org.example;

public class TableController {
    // All the game is going to be controlled here.
    private Deck deck;
    private Player player1;
    //The real player
    private Player bot1;//Other players
    private Player bot2;
    private Player bot3;



    public TableController(String name){
        //Player1's name going to be selected by the user.
        this.player1 = new Player(name);
        this.bot1 = new Player("Bot1");
        this.bot2 = new Player("Bot2");
        this.bot3 = new Player("Bot3");
        Deck deck = new Deck();//Firstly, deck is going to be created here and till the other games starts.

    }
    public void startGame(){





    }
    private void distributeCards(){
        //distributes 13 card every game in the beginning.
    }

}
