import java.lang.reflect.Array;

public class Bag {
  private int[] integers;

  // constructor
public Bag(){
}

public Bag(int[] integers) {
  this.integers = integers;
}

  // getter, setter
  public int getIntegers() {
    return this.integers;
  }

  public void setIntegers(int[] integers) {
    this.integers = integers;
  }

  // toString()
  public String toString() {
    return "Bag(" //
        + "integers=" + Array.toString(this.integers)//
        + ")"; 
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3, 1, 2};
    Bag b1 = new Bag(integers);
    System.out.println(b1.toString()); // Bag(integers= [3, 1, 2])
    int[] b1.getIntegers
    b1.setIntegers(new int[] {5, 6, 7});

    // Bag(integers= [100, -2, 6]) wont use this method
    //System.out.println(new Bag(new int[] {100, -2, 6}).toString());
   // }
}
