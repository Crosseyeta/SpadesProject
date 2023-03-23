package org.example;

public class Deck {
  // This class has all the card in the deck as a list and is going to control deck itself.
  private Card Spade2;
  private Suit spade;
  private Suit diamond;
  private Suit hearts;
  private Suit clubs;


  //There will be 52 card.Each one of them created just for once when we begin the game.
  public Deck(){
    this.spade = new Suit("Spade",2);
    this.diamond = new Suit("Diamond",1);
    this.hearts = new Suit("Hearts",1);
    this.clubs = new Suit("Clubs",1);
    this.Spade2 = new Card("2",spade,2);
    //All the cards are going to be implemented to the deck here just for once.
  }
  public void shuffle(){
    //this function shuffles the deck briefly.
  }


}
