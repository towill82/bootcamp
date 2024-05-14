public class DemoOperator3 {

  public static void main(String[] args) {
    int x = 3;
    x = x + 1;
    System.out.println("x=" + x);

    x++;
    System.out.println("x=" + x);

    x += 1;
    System.out.println("x=" + x);

    x += 2;
    System.out.println("x=" + x);

    ++x;
    System.out.println("x=" + x);

    boolean r5 = 10 > 3 && 20 >= 20; 
    boolean r6 = 10 > 3 && 4 < 4;
    System.out.println (r5);
    
    boolean r7 = 10 > 3 || 20 >= 20;
    System.out.println (r7);
    boolean r8 = 10 > 3 || 20 < 18;
    System.out.println (r8);
    boolean r9 = 3 > 10 || 20 < 18;
    System.out.println (r9);

    char c10 = 'A';
    char c11 = 'B';
    System.out.println (c10+c11+c10); // question for this


  }
  
}
