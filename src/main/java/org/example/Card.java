package org.example;

public class Card {
    private String name;
    private Suit suit;
    private int power;
    // each card has its own power in order to calculate the winner of the raund for example king's power gonna be 13 and ace is 14
    public Card(String name,Suit suit,int power){
        this.name = name;
        this.suit = suit;
        this.power = power;

    }
}
