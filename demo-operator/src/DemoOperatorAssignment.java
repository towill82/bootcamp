public class DemoOperatorAssignment {
  public static void main(String[] args) {
    int x = 3;
    int y = (x++ + 3) * x++;
    System.out.println("y=" + y);
  }
  
}
