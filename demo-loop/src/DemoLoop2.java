public class DemoLoop2 {
  public static void main(String[] args) {
    


// Copy from Vincent java notes at home.



    // Label: outLoop -> labeled start point for "continue"
    outLoop: for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
          continue outLoop; // Skip to the next iteration of the outer loop
        }
        System.out.println("i: " + i + ", j: " +j);
      }
    }

  }  
}
