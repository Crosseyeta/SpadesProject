package org.example;
import java.lang.Math;
public class Deck {
  // This class has all the card in the deck as a list and is going to control deck itself.
  /*private Suit spade;
  private Suit diamond;
  private Suit hearts;
  private Suit clubs;
  private Card Spade2;
  private Card Spade3;
  private Card Spade4;
  private Card Spade5;
  private Card Spade6;
  private Card Spade7;
  private Card Spade8;
  private Card Spade9;
  private Card Spade10;
  private Card SpadeJack;
  private Card SpadeQuenn;
  private Card SpadeKing;
  private Card SpadeAce;
  private Card Diamond2;
  private Card Diamond3;
  private Card Diamond4;
  private Card Diamond5;
  private Card Diamond6;
  private Card Diamond7;
  private Card Diamond8;
  private Card Diamond9;
  private Card Diamond10;
  private Card DiamondJack;
  private Card DiamondQuenn;
  private Card DiamondKing;
  private Card DiamondAce;
  private Card Hearts2;
  private Card Hearts3;
  private Card Hearts4;
  private Card Hearts5;
  private Card Hearts6;
  private Card Hearts7;
  private Card Hearts8;
  private Card Hearts9;
  private Card Hearts10;
  private Card HeartsJack;
  private Card HeartsQuenn;
  private Card HeartsKing;
  private Card HeartsAce;
  private Card Clubs2;
  private Card Clubs3;
  private Card Clubs4;
  private Card Clubs5;
  private Card Clubs6;
  private Card Clubs7;
  private Card Clubs8;
  private Card Clubs9;
  private Card Clubs10;
  private Card ClubsJack;
  private Card ClubsQuenn;
  private Card ClubsKing;
  private Card ClubsAce;*/
  private LinkedList deck;
  private Suit spade;
  private Suit heart;
  private Suit diamond;
  private Suit club
          ;


  //There will be 52 card.Each one of them created just for once when we begin the game.
  public Deck(){
    //Each card going to be initiliazed here by giving its power(number actually) to each of them. For example look the Spade2

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
    /*int max1 = 4;
    int min = 1;
    int max2 = 13;
    int range1 = max1 - min +1 ;
    int range2 = max2 - min + 1;*/
    for(int i = 0 ;i<26;i++){
      //we are going to shuffle this by select two card in specific index of deck by giving them random index using random.
      int a = (int)(Math.random()*5) ;
      int b = (int)(Math.random()*5) ;
      int c = (int)(Math.random()*14) ;
      int d = (int)(Math.random()*14) ;
      System.out.println(b*d);
      System.out.println(a*c);
      change(this.deck.getCardI(a*c),this.deck.getCardI(b*d));
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
