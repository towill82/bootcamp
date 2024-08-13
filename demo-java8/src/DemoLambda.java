import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    Swimable p = new Swimable() {
      @Override
      public void swim() {
        System.out.println("I am swimming ...");
      }
    };
    p.swim();
    
    
    
    // Lambda Expression
    // The reason that we can use "() -> implementation" is that interface contains one abstract only.
    Swimable person = () -> System.out.println("I am swimming ...");
    System.out.println(person.toString()); // DemoLambda$$Lambda$1/0x0000007001000400@58644d46

    person.swim();

    // Another object
    person = () -> System.out.println("I am swimming !!!!");
    System.out.println(person.toString()); // DemoLambda$$Lambda$2/0x0000007001001800@18b4aac2
    person.swim();


    Calculator sumCalculator = (a, b) -> a + b;
    System.out.println(sumCalculator.calculate(10, 3)); // 13

    Calculator multiplyCalculator = (a, b) -> a * b;
    System.out.println(multiplyCalculator.calculate(10, 3)); // 30

    // 1. More than one line of implementation, 
    // then you have to use "return" keyword within the implemention block
    // 2. if there is only one parameter, then you don't have to use (x), you can simply use x
    Drivable father = x -> {
      if (x == 3)
        return false;
        return true;
    };
    System.out.println(father.drive(3)); // false
    System.out.println(father.drive(4)); // true



    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    
    // for-each loop
    String t = "";
    for (String s : strings) {
      System.out.println(s);
      t += s;
    }
    System.out.println(t); // "abcdefacebd"

    // Lambada forEach
    strings.forEach(s -> System.out.println(s));

    strings.forEach(s -> {
      if (s.length() > 3) {
        System.out.println(s);
      }
      // t += s; // compile error,
    });
    // abcd

    // Function.class
    // public interface Function<T, R>
    // R apply(T t);
    Function<String, Integer> stringLength = str -> 3;

    Function<String, Integer> strLen = str -> str.length(); // formula
    System.out.println(strLen.apply("hello")); // 5
    System.out.println(strLen.apply("abc")); // 3

    Function<String, Integer> strLen2 = new StringLength();
    System.out.println(strLen2.apply("hello")); // 5
    System.out.println(strLen2.apply("abc")); // 3

    Function<Customer, Integer> nameLength = customer -> customer.getName().length();

    Function<Customer, String> greetingMessage = customer -> {
      String message = "Hello everyone. I am ".concat(customer.getName());
      return message;
    };
    String message = greetingMessage.apply(new Customer("John"));
    System.out.println(message);

    BiFunction<String, String, Integer> nameLength2 = (firstName, lastName) -> firstName.length() + lastName.length();
    System.out.println(nameLength2.apply("Vincent", "Lau")); // 10

    getNameLength("Vincent", "Lau"); // 10

    // Consumer
    // public interface Consumer<T> {
    // void accept(T t);
    Consumer<Customer> printCustomerName = customer -> System.out.println(customer.getName());
    printCustomerName.accept(new Customer("Jenny")); // Jenny

    // BiConsumer
    // public interface BiConsumer<T, U> {
    // void accept(T t, U u);
    MathOperation operation = MathOperation.MULTIPLY;
    BiConsumer<Integer, Integer> calculate = null;
    switch (operation) {
      case SUM:
        calculate = (num1, num2) -> System.out.println(num1 + num2);
        break;
      case SUBTRACT:
        calculate = (num1, num2) -> System.out.println(num1 - num2);
        break;
      case MULTIPLY:
        calculate = (num1, num2) -> System.out.println(num1 * num2);
        break;
      case DIVIDE:
        calculate = (num1, num2) -> System.out.println(num1 / num2);
        break;
      default:
        calculate = (num1, num2) -> System.out.println(num1 + num2);
        break;
    }
    calculate.accept(10, 3); // 30

    // Supplier
    // public interface Supplier<T> {
    // T get();
    // generate random number
    Supplier<Integer> MarkSixNumber = () -> new Random().nextInt(49) + 1; // 1 - 49
    List<Integer> marksix = new LinkedList<>();
    int ball = -1;
    while (marksix.size() < 6) {
      ball = MarkSixNumber.get();
      if (marksix.contains(ball))
        continue;
        marksix.add(ball);
    }
    System.out.println(marksix);

    // Predicate
    // public interface Predicate<T> {
    // boolean test(T t);
    Predicate<Customer> isNameTooLong = customer -> customer.getName().length() > 5;
    System.out.println(isNameTooLong.test(new Customer ("Vincent"))); // true
    System.out.println(isNameTooLong.test(new Customer ("Sam"))); // false

    // BiPredicate
    // public interface BiPredicate<T, U> {
    // boolean test(T t, U u);
    BiPredicate<String, String> isNameTooLong2 = (firstName, lastName) -> firstName.length() + lastName.length() > 9;
    System.out.println(isNameTooLong2.test("Vincent", "Lau")); //true 

    // UnaryOperator
    // UnaryOperator<String> = Function<String, String>
    // public interface UnaryOperator<T> extends Function<T, T> {
    // static <T> UnaryOperator<T> identity() {
    // return t -> t;
    UnaryOperator<String> nameFormula = s -> s + "!!!";
    System.out.println(nameFormula.apply("John")); // John!!!
    // BiaryOperator<String> = BiFunction<String, String, String>
    BinaryOperator<String> nameFormula2 = (s1, s2) -> s1 + s2;
    System.out.println(nameFormula2.apply("Vincent", "Lau"));


  }

  public static int sum(int x, int y) {
    return x + y;
  }



    public static int getNameLength(String firstName, String lastName) {
      return firstName.length() + lastName.length();
  }
}
