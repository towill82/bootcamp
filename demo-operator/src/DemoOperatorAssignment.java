public class DemoOperatorAssignment {
  public static void main(String[] args) {
    int x = 3;
    int y = (x++ + 3) * x++;
    System.out.println("y=" + y);

<<<<<<< HEAD

    char c1 = 'A';
    char c2 = 'B';
    boolean result1 = c1 == c2;
    System.out.println(result1);
=======
    int a = 3;
    int b = (++a + 3) * ++a;
    System.out.println("b=" + b);
>>>>>>> 425d6e4daa15068078a13ed54f3ab43e963045a6
  }
  
}
