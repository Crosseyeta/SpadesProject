package org.example;

public class PlayerDeck {

        //This class represent the deck of each player which is going to contain 13 card in the beginning of each
        // round and decrease set by set.
        private LinkedList playerDeck;
        public PlayerDeck(){
            playerDeck = new LinkedList();
        }
        public void addCard(Card card){
            //@param Card card which is determined by the distribute function in the GameController
            //In the beginning of the game each player's deck going to be determined by this and distribute function.
            playerDeck.insertFirst(card);

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
        public LinkedList getPlayerDeck(){
            return this.playerDeck;
        }


}
