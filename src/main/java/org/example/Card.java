package org.example;

public class Card {

    private Suit suit;
    protected Card next;
    private int power;
    // each card has its own power in order to calculate the winner of the round for example king's power gonna be 13 and ace is 14
    public Card(Suit suit,int power){


    }

    public Card getNext() {
        //in this project card going to be node for linkedlist class actually so in order to corporate with linkedlist class next must be accessible
    }

    public void setNext(Card next) {

    }
}
