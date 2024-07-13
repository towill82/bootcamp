package deck;
import java.util.Random;



public class Deck {
  // public static final String[] suits =
  // new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
  // public static final String [] ranks = new String [] {"ACE", "TWO", "THREE", "FOUR",
  //  "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
  // Player, Deck, Card

  private static int length = suits.length * ranks.length;

  private Card[] cards;

  public Deck() {
  this.cards = new Card[length];
  int idx = 0;
  for (Suit suit : suits) {
    for (Rank rank : ranks) {
      this.cards[idx++] = new Card(suit, rank);
    }
   }
  }

  public static void test() {
    System.out.println("hello");
    Deck d = new Deck();
    d.getCards();
  }


  public Card[] getCards(){
    return this.cards;
  }
}
