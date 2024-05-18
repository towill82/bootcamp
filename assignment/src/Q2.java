public class Q2 {
public static void main(String[] args) {
    int a = 10;
    int b = 3 * a % 3;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a < 9 && a >= 0) {
      System.out.println("a is between 0 and 8");
    } else if (a > 9) {
      System.out.println("a > 9");
    } else { 
      System.out.println("a < 0");
    }

    String str = "I love Java. I love coding";
    if (str.length() == 27) { 
      System.out.println("str length = 27");
    } else if (str.length() < 27) {
      System.out.println("str length < 27");
    } else { 
      System.out.println("str length > 27");
    }

    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year:
     * If a year is divisible by 4 and not divisible by 100 or divisible by 400,
     * then, it is a leap year.
     */
    int year1 = 2009;
    if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) { 
      System.out.println("2009 is a leap year.");
    }
    int year2 = 2020;
    if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
      System.out.println("2009 is a leap year.");
    }
    int year3 = 2400;
    if ((year3 % 4 == 0 && year3 % 100 != 0) || (year3 % 400 == 0)) {
      System.out.println("2400 is a leap year.");
    }
    int year5 = 2100;
    if ((year5 % 4 == 0 && year5 % 100 != 0) || (year5 % 400 == 0)) {
      System.out.println("2100 is a leap year.");
    }
  }

}
