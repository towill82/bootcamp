public class Calculator {
  
  // static method -> instance method ??!!
  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    
    // sysout
    sum(1, 3); // 4
    Calculator.sum(2, 3); // 5

    private String sum;
    private String multiply;
    private int setX;
    private int setY;

    public void setSum(int x) {
      this.age = x;
    }
    public void setAge(int x) {
      this.age = x;
    }
    
    c1.setX(2);
    c1.setY(3);
    c1.sum(); // 2 + 3
    c1.multiply(); // 2 * 3

  }
}
