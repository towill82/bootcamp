public class DemoLoopself {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x);


    for (int i = 0; i < 4; i++) {
      System.out.println("hello");
    }

    int y = 3;
    for (int i = 0; i < 3 ; i++) {
      y *= 3; 
    }
    System.out.println("y=" + y);


    for (int i = 0; i < 7; i ++) {
      if (i != 0 && i % 2 == 0) {
        System.out.println(i);
      }
    }


    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i; 
    }
    System.out.println("sum=" + sum);

    int sum2 = 0;
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
      sum2 += i;
      }
    }
    System.out.println("sum=" + sum2);


  }

}
