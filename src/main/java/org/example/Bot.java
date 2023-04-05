package org.example;

public class Bot extends Player {

    //all the things going to same with player class but there is going to be a additional method to play card.
    public Card useCard() {
        //to play the proper card for AI.
        if(broken){
            for(int i = 0;i<super.getPlayerDeck().numberOfElements();i++){
                return super.getPlayerDeck().getCardI(i);

            }
        }else{
            for(int i = 0;i<super.getPlayerDeck().numberOfElements();i++){
                if(super.getPlayerDeck().getCardI(i).getSuit().getName().equals("Spade")){
                    i++;
                }

            }
        }

    }

    public Bot(String name, int playOrder) {
        super(name,playOrder);

}
        public void BotAutoBid () {
            super.setBids(super.getPlayerDeck().searchSpade());

        }
        public Card startFirst(){
        /*
        @return that is gonna return with which card bot going to play.
         */
            for(int i = 0;i<13;i++){
                if(this.getPlayerDeck().getCardI(i).getSuit().getName().equals("Spade")){

                }else{
                    Card card = this.getPlayerDeck().getCardI(i);
                    super.deleteCardFDeck(i);
                    return card;
                }
            }
            return null;
        }



}


