public class TestCat {
  public static void main(String[] args) {
    // Local variable
    String name = "John";

    // Local variable
    Cat c1 = new Cat(); // "new Cat()" -> produce Cat Object in memory 
    // memory address -> 0x1231akfkjfiekdf
    // c1 -> object reference or variable, able to find the cat object
    c1.setAge(10);
    System.out.println(c1.getAge()); // 10

    // Local variable
    Cat c2 = new Cat();
    c2.setAge(7);
    System.out.println(c2.getAge()); // 7
    System.out.println(c1.getAge()); // 10

    Cat c3 = new Cat();
    System.out.println(c3.getAge()); // 0, because primitive type has defalut value

    Ball b = new Ball();
    // "Ball b" -> becuase
  }
}
