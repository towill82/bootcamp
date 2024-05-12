public class DemoOperator2 {
  public static void main(String[] args){
    int x = 3;

    x = x + 1;
    System.out.println("x=" + x);
    
    x++; // same as x = x + 1
    System.out.println("x=" + x);

    x += 1; // same as x = x + 1
    System.out.println("x=" + x);

    x += 2; // same as x = x + 2
    System.out.println("x=" + x);

    ++x; // Same as x =  x + 1
    System.out.println("x=" + x);

    int y = 4;
    y = y - 1; 
    System.out.println("y=" + y); // y = 3

    y--;
    System.out.println("y=" + y); // y = 2

    --y;
    System.out.println("y=" + y); // y = 1

    y -= 1;
    System.out.println("y=" + y); // y = 0

    // *=
    int p = 4;
    p = p * 2; // 8
    p *=2; // 16
    p /=4; //4
    System.out.println("p=" + p);

    int z = 10;
    z = z % 3; // 1
    int j = 10;
    j %= 3; // 1
    System.out.println("z=" + z + ", j=" + j);

    String s = "hello";
    s = s + "world"; // helloworld
    s += "!!!";
    System.out.println("s=" + s); // s=helloworld




  }

  
}
