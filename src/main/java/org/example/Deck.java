package org.example;
import java.lang.Math;
public class Deck {
  // This class has all the card in the deck as a list and is going to control deck itself.
  private LinkedList deck;
  private Suit spade;
  private Suit heart;
  private Suit diamond;
  private Suit club
          ;


  //There will be 52 card.Each one of them created just for once when we begin the game.
  public Deck(){
    //Each card going to be initialized here by giving its power(number actually) to each of them. For example look the Spade2

    //All the cards are going to be implemented to the deck here just for once.
    this.deck = new LinkedList();
    this.spade = new Suit("Spade",1);
    this.diamond = new Suit("Diamond",0);
    this.club = new Suit("Club",0);
    this.heart = new Suit("Heart",0);
    for(int i = 0;i<13;i++){
      deck.insertFirst(new Card(spade,i));
    }
    for(int i = 0;i<13;i++){
      deck.insertFirst(new Card(diamond,i));
    }
    for(int i = 0;i<13;i++){
      deck.insertFirst(new Card(heart,i));
    }
    for(int i = 0;i<13;i++){
      deck.insertFirst(new Card(club,i));
    }

  }
  public void shuffle(){
    //this function shuffles the deck briefly.
    //by using linkedlist functions which are implemented in linkedlist class
    //In this for look we can change 26 here it depends us in order to make more lucky concrete shuffle function we can increase this number but not much in order to be efficient
    int range1 = (4 - 1) + 1;
    int range2 = (13 - 1) + 1;
    for(int i = 0 ;i<26;i++){
      //we are going to shuffle this by select two card in specific index of deck by giving them random index using random.
      int a = (int)(Math.random() * range1) + 1;
      int b = (int)(Math.random() * range1) + 1;
      int c = (int)(Math.random() * range2) + 1;
      int d = (int)(Math.random() * range2) + 1;
      System.out.println(b*d);
      System.out.println(a*c);
      change(this.deck.getCardI(a*c-1),this.deck.getCardI(b*d-1));
    }



  }
  private void change(Card card1,Card card2){
    //This function going to be used in shuffle.What it does briefly is change 2 card attributes without not touching of next card there where they were before the change.
    int card1Power = card1.getPower();
    Suit card1Suit = card1.getSuit();
    card1.setPower(card2.getPower());
    card1.setSuit(card2.getSuit());
    card2.setSuit(card1Suit);
    card2.setPower(card1Power);
  }
  public LinkedList getDeck(){
    return this.deck;
  }

  public void showAllDeck(){
    int size  = this.deck.numberOfElements();
    for(int i = 0;i<size;i++){
      System.out.println(deck.getCardI(i).toString());
    }
  }


}
