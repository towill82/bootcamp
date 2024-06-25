public class DemoNumber {
  public static void main(String[] args) {
    Integer x = 1; // 1 is an int value (primitive) 
    System.out.println("x is " + x.getClass()); // class java.lang.Integer
    Double d = 2.0;

    Number n = x; // polymorphism
    // n is object reference
    n = d;

    Number[] numbers = new Number[] {1, 2, 3, 4.0, 4.5, (byte) 1, (short) 3, 4L};
    Double[] doubles = new Double[] {Double.valueOf(1), 4.0, 4.5}; 
    // int -> Integer (autobox)
    // Integer vs Double (No relationship)
    // int vs double (upcast)

    // For-each
    // for (object type : array object)
    for (Number num : numbers) {
      System.out.println(num.getClass());
    }
  }
}
