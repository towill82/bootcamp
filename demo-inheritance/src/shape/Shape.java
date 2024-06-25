package shape;

import java.math.BigDecimal;

public abstract class Shape {
  // abstract class can create instance method without implementation
  // Method without implementation -> abstract method
  public abstract double area();
  
  public static double totalArea(Circle[] circles) {
    //...
  }

  public static double totalArea(Square[] squares) {
    //...
  }

  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) { // s is obj ref, point to actual object (Circle/Square)
      s.area();
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.circleArea(3.0d));
    Shape[] shapes = new Shape[] {new Circle(3.0d), new Square(4.0d)};
    System.out.println(Shape.totalArea(shapes)); // 358.435992 ..
  }

  // extra example (BigDecimal vs StringBuilder Design Difference)
  StringBuilder sb = new StringBuilder("hello");
  sb = sb.append("world"); // Java: You don't have to assign the return object to a reference.
  System.out.println(sb); // helloworld
  // You should refer to Box.java for the answer.

}

