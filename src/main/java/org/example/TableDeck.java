package org.example;

public class TableDeck {
    private LinkedList tableDeck;
    public TableDeck(){
        //Contains max 4 card.
        //*This table deck represent the deck in each deck at the end of the game.
        //*Which is going to contain 4 card
        //*In this linked list there is indexes so check winner function going to look at powers of cards and determine who won,
        //and then going to add point to the index's of it's card for ex (Player 1's card always gonna be in the first index so if player 1 won function going to add point to player1)
        this.tableDeck = new LinkedList();

    }
    public void clearTableDeck(){
        //clears the deck after each round ends.
        for(int i = 0;i< this.tableDeck.numberOfElements();i++){
            this.tableDeck.deleteFirst();
        }
    }

    public LinkedList getTableDeck() {
        return tableDeck;
    }

    public void setTableDeck(LinkedList tableDeck) {
        this.tableDeck = tableDeck;
    }

    public void addCardToTable(Card card){
        card.setNext(null);
        this.tableDeck.insertFirst(card);
        System.out.println(tableDeck.toString());
    }

}
