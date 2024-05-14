public class DemoString {
  public static void main(String[] args) {
    // String stores text
    // double quote to declare a String value
    String x = "hello";
    String y = "$(@#$%^)";
    String dollar = "$10";

    String withSpace = "  hello   he   ello";
    System.out.println(withSpace);
    System.out.println(" x     " + y);

    // +
    String z = x + dollar;
    System.out.println(z); // hello$10

    // remainder

    int remainder = 10 % 3; // 1 "%" 係除數之後餘數的整數
    int divide = 10 / 3; // 3 "/" 除數之後的整數
    System.out.println(remainder);
    System.out.println(divide);


    double price = 9.99;
    String item = "Book";
    String description = "The " + item + " costs $" + price; // String + String + double ...
    System.out.println(description);

    char a = 'A';
    String message = "The answer is: " + a; // char --> String
    System.out.println(message);

    // String Method (Tool) 1: length()
    String t = "hello";
    System.out.println("The length of t=" + t.length()); // t.length()  --> int

    // check if t length >= 4, if yes, print hello, else goodbye
    if (t.length() >= 4) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }
    
     // Mthod 2: equals()
     String s1 = "hello";
     String s2 = "hello";
     if (s1.equals(s2)) {
      System.out.println("They are having same String value."); // print
     } else {
      System.out.println("They are not with the same value");
     }
     
     if (!s1.equals(s2)) { // ! means "NOT"
      System.out.println("They are not with the same value."); 
     } else {
      System.out.println("They are having same String value."); // print
     }
     if (s1 == s2) {
      System.out.println("They are same object."); //print
     }

     // check if s1 length >= 6 or s1 equals s2, print ...
     if (s1.length() >= 6 || s1.equals(s2)) { // false || true -> true
      System.out.println("hello");
     }

     if (s1.length() >= 6) {
      System.out.println("hellow world");
     } else if (s1.equals(s2)) {
      System.out.println("hello");
     }

     // check if s1 length >= 6 or s1 equals s2, print ...
     // AND
     if (s1.length() >= 6 && s1.equals(s2)) { // false && true -> false
      System.out.println("hello");
     }

     if (s1.length() >= 6) {
        if (s1.equals(s2)) {
          System.out.println("hello");
        }
     }


// Method 3: chatAt(int index), for example, charAt(0)
     String s3="world";
     // 0 means the first character
     // 1 means the second character
     // 4 means the 5th character
     System.out.println("The 1st character of s3=" + s3.charAt(0)); //w
     System.out.println("The 5st character of s3=" + s3.charAt(4)); //d
    
     System.out.println("The last character of s3=" + s3.charAt(s3.length() - 1)); //d
     // System.out.println(s2.charAt(-1)); // java.lang.StringIndexOutOfBoundsException
     // System.out.println(s2.charAt(5)); // java.lang.StringIndexOutOfBoundsException

     // check if the last character is d and length > 5, if yes, print yes.
     String x2 = "hello world";

     if (x2.charAt(x2.length() - 1) == 'd' && x2.length() > 5) {
      System.out.println("Yes");
     }

     // Method 4: substring(int beginIndex, int endIndex) 
     String result = x2.substring(0, 2);
     System.out.println(result); // he

     System.out.println(x2.substring(0, 5)); // "hello"
     System.out.println(x2.substring(3, 8)); // "lo wo"
     System.out.println(x2.substring(0, 0)); // ""
     System.out.println(x2.substring(0, 1)); // "h"
     // System.out.println(x2.substring(0, -1)); // java.lang.StringIndexOutOfBoundsException

     // check if the first three character is "wel", if yes, print yes
     String x3 = "welcome";

     // substring()
     if (x3.substring(0, 3) .equals ("wel")) {
      System.out.println("yes");
     }

     
     // chain method
     System.out.println(x3.substring(0, 3).length()); // 3
     System.out.println(x3.substring(0, 3).charAt(1)); // 'e'

     String x4 = x3.substring(0, 3);
     int l1 = x4.length();
     System.out.println(l1); //3


     // charAt()
     if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == 'l') {
      System.out.println("yes");
     }




     

    }
}

