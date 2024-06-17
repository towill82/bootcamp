package deck;
import java.util.Random;



public class Deck {
  private static String[] suits =
  new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
  private static String [] ranks = new String [] {"ACE", "TWO", "THREE", "FOUR",
   "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
  // Player, Deck, Card

  private static int length = suits.length * ranks.length;

  private Card[] cards;

  public Deck() {
  this.cards = new Card[suits.length * ranks.length];
  int idx = 0;
  for (String suit : suits) {
    for (String rank : ranks) {
      this.cards[idx++] = new Card(suit, rank);
    }
   }
  }




  public Card[] getCards(){
    return this.cards;
  }
}
