package sorting;

import java.util.ArrayList;

// Objectives: learn existing interface
public class Ball implements Comparable<Ball> {
  private int number;
  private Color color;

  public Ball(int number, Color color) {
    this.number = number;
    this.color = color;
  }

  public int getNumber() {
    return this.number;
  }
  
  @Override
  public int comparaTo(Ball ball) {
    // Objectives: provide your own formula to sort the List<Ball>
    // Return Value: 1 or -1 

    // Example 1: sort by number (descending)
    // You have 2 ball object reference here: ball and this
    // -1 means "move to left" (from left to right)
    if (ball !=null && this.number > ball.getNumber())
      return -1;
    return 1;
    //return this.number > ball.getNumber() ? -1 : 1;
  }

    @Override
    public String toSrString(){
      return "Ball(" //
      + "number=" + this.number //
      + ", color=" + this.color //
      + ")";
    }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Color.BLACK));
    balls.add(new Ball(14, Color.WHITE));
    balls.add(new Ball(8, Color.RED));
    System.out.println(balls); 
    // [Ball(number=10, color=BLACK), Ball(number=14), color=WHITE), Ball(number=8, color=RED)]

    //Sort
    // Collections.sort() -> call Loop List<Ball> -> ball.compareTo()
    // During compile time, java

    Collections.sort(balls);
    System.out.println(balls);
    System.out.println(balls);
    // [Ball(number=14, color=WHITE), Ball(number=8), color=BLACK), Ball(number=8, color=RED)]

    List<Bird> birds = new ArrayList<>();
    // Collections.sort(balls); // error, Bird.class did not implemnets Comparable 

    // Sort by color ? RED -> WHITE -> BLACK
    // Sort by color, and then number ? RED -> WHITE -> BLACK, if same color, larger number go left.
  }


}
