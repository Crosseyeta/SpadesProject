package org.example;

public class Suit {
    private String name;
    private int power;
    //except the spade each suit's power is going to be 1 and spade's power is going to be 2.
    //First Software going to look at suit's power if it's equal then it is going to look at card's power to determine winner.
    public Suit(String name,int power){
        this.name = name;
        this.power = power;

    }
}
