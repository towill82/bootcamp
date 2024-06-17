package deck;

public class ShuffleManager {

  // attribute / Dependency
  private Card[] cards;

  public ShuffleManager(Card[] cards) {
    this.cards = cards;
  }



    // Behavior
    public void shuffle(int times) {
      if (times > 1000) 
        times = 1000;
      Card[] newCards = null;
      for (int i = 0; i < times; i++) {
      int idx = new Random().nextInt(length); // 0-51
      newCards = new Card[length];
      int count = 0;
      for (int j = idx; j < length; j++) {
        newCards[count++] = this.cards[j];
      }
      for (int j = 0; j < idx; j++) {
        newCards[count++] = this.cards[j];
      }
      this.cards = newCards;
      }
      }
}
