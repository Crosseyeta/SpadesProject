package org.example;

public class PlayerDeck {
    //This class represent the deck of each player which is going to contain 13 card in the beginning of each
    // raund and decrease raund by raund.
    private LinkedList playerDeck;
    public PlayerDeck(){
        this.playerDeck = new LinkedList();//there is no code in the LinkedList yet but this gonna work with this logic.
    }
    public void addCard(Card card){

        //@param Card card which is determined by the distribute function in the GameController
        //In the beginning of the game each player's deck going to be determined by this and distribute function.

    }
    public void useCard(String cardName){
        //@param String cardName which card , player wants to use
        //By looking the name of the parameter this function going to check player's deck and if it is available and also proper
        //Player going to use this card.

    }
}
