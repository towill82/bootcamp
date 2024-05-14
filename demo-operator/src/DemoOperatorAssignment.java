public class DemoOperatorAssignment {
  public static void main(String[] args) {
    int x = 3;
    int y = (x++ + 3) * x++;
    System.out.println("y=" + y);


    char c1 = 'A';
    char c2 = 'B';
    boolean result1 = c1 == c2;
    System.out.println(result1);
  }
  
}
