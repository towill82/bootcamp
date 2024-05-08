public class DemoString {
  public static void main(String[] args) {
    // String stores text
    String x = "hello";
    String y = "$(@#$%^)";
    String dollar = "$10";

    String withSpace = "  hello   he   ello";
    System.out.println(withSpace);
    System.out.println(" x     " + y);

    // +
    String z = x + dollar;
    System.out.println(z);

    // remainder

    int remainder = 10 % 3; // 1 "%" 係除數之後餘數的整數
    int divide = 10 / 3; // 3 "/" 除數之後的整數
    System.out.println(remainder);
    System.out.println(divide);
  }
}
