package org.example;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Card {

    private Suit suit;
    protected Card next;
    private int power;
    // each card has its own power in order to calculate the winner of the round for example king's power gonna be 13 and ace is 14
    public Card(Suit suit,int power){
        this.suit = suit;
        this.power = power;
        this.next =null;

    }

    public Card getNext() {
        return this.next;
        //in this project card going to be node for linkedlist class actually so in order to corporate with linkedlist class next must be accessible
    }

    public void setNext(Card next) {
        this.next = next;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString(){
        String a = "";
        //In there because of there is no name field in card we decide the cards name here.We did not give any name attribute in order to create 52 card more easy way with for loops
        switch (this.power) {
            case 0:
                a ="2";
                break;
            case 1:
                a ="3";
                break;
            case 2:
                a ="4";
                break;
            case 3:
                a ="5";
                break;
            case 4:
                a ="6";
                break;
            case 5:
                a ="7";
                break;
            case 6:
                a ="8";
                break;
            case 7:
                a ="9";
                break;
            case 8:
                a ="10";
                break;
            case 9:
                a ="Jack";
                break;
            case 10:
                a ="Queen";
                break;
            case 11:
                a ="King";
                break;
            case 12:
                a ="Ace";
                break;


        }
        return this.suit.getName() + " " + a;

        }


    }

