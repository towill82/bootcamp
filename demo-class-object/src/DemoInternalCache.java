public class DemoInternalCache {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value -> autobox -> Integer Object (heap memory)

    i1 = 127; // i1 (object ref), 127 -> (1st) create Integer Object
    i2 = 127; // i2 (object ref), 127 -> (2nd) reuse the original Integer Object
    // Rule: from -128 to 127 -> reuse the original object
    System.out.println(i1 == i2); //true (are they same object?)

    Integer i3 = 128; // 128 -> (1st) create Integer Object
    Integer i4 = 128; // 128 -> (2nd) create Integer Object
    System.out.println(i3 == i4); // false

    // Important !!!
    // For Class, you should always compare their objects value by METHOD!!!
    System.out.println(i3.compareTo(i4)); // 0

    // No meaning for the coding
    // System.out.println(i3 >= i4); // false
    // System.out.println(i1 >= i2); // false


    // Float, Double (No Internal Cache in JVM)
    Float f1 = 10.12345f; // autobox: float value -> Float object
    Float f2 = 10.12345f; // autobox: float value -> Float object
    System.out.println(f1 == f2); // false

    Double d1 = 128.12345d; // autobox: double value -> Float object
    Double d2 = 128.12345d; // autobox: double value -> Float object
    System.out.println(d1 == d2); // false

    // Boolean: support Internal cache
    Boolean b1 = true; // autobox: boolean -> Boolean
    Boolean b2 = true; // autobox: boolean -> Boolean
    System.out.println(b1 == b2); // true

    // Character: support Interanl cache (-128 to 127)
    Character c1 = 'c'; // autobox: char value -> Charater Object
    Character c2 = 'c'; // autobox: char value -> Charater Object
    System.out.println(c1 == c2); // true

    Character c3 = '我'; // autobox: char value -> Charater Object
    Character c4 = '我'; // autobox: char value -> Charater Object
    System.out.println(c3 == c4); // false

  }
}
