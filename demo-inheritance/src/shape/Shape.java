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
    System.out.println(Shape.totalArea(shapes));
  }

}

