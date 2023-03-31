package org.example;

public class Main {
    public static void main(String[] args) {
    Deck deck = new Deck();
    deck.showAllDeck();
    deck.shuffle();
    System.out.println("Shuffled");
    deck.showAllDeck();
    //TableController sea = new TableController();
        //sea.startGame();

    }
}