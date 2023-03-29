package org.example;

public class Suit {
    private int power;
    //except the spade each suit's power is going to be 0 and spade's power is going to be 1.
    //First Software going to look at suit's power if it's equal then it is going to look at card's power to determine winner.
    public Suit(int power){
        this.power = power;
    }
}
