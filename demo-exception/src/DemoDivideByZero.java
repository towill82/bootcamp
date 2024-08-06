public class DemoDivideByZero {
  public static void main(String[] args) {
    int amount = 0;
    System.out.println(divide(10, 3)); // 3

    // Approach 1
    if (amount != 0) {
      System.out.println(divide(10, amount));
    } else {
      System.out.println(0);
    }

    // Approach 2 Handle Exception
    // Unchecked Exception (Runtime Exception) - Implicitly
    try {
    divide(10, 2);
    // ... lines of code...
    String s = "hello";
    s = null;
    System.out.println(s.charAt(2)); // // NullPointerException 
    } catch (ArithmeticException e) {
      // send email to teammate ...
      // insert to database ...
      System.out.println("hello! Divide by Zero" + 10 + " / " + amount);
    } catch (NullPointerException e) {
      System.out.println("NPE: Please check.");
    }


    try {
    double averageExpense = CalculateExpensePerEmpolyee2();
    } catch (ArithmeticException e) {
      System.out.println("something to fix ...");
    }

    // main() -> CalculateExpensePerEmpolyee() -> getDepartmentExpense() & 
    // getEmployeeCount()

    try {
      CalculateExpensePerEmpolyee3();
    } catch(EmployeeCountZeroException e) {
      // specific handling for employee count = 0 ...
  }
}


  // return int
  // throw ArithmeticException (Implicitly)

  public static int divide(int x, int y) {
    return x / y;
  }

  // Approach 1
  public static int CalculateExpensePerEmpolyee() {
    try {
    return getDepartmentExpense() / getEmployeeCount(); // bug
    } catch (ArithmeticException e) {
    return getDepartmentExpense(); // fix
    }
  }

    // Approach 2
    // When a method throw unchecked exception without handling, the exception will be thrown back to caller.
    public static int CalculateExpensePerEmpolyee2() {
      return getDepartmentExpense() / getEmployeeCount();
    }

    // Approach 3
    public static int CalculateExpensePerEmpolyee3() {
      try {
      return getDepartmentExpense() / getEmployeeCount();
      } catch (ArithmeticException e) {
        throw new EmployeeCountZeroException();
      }
    }




  public static int getEmployeeCount() {
    return 0;
  }

  public static int getDepartmentExpense() {
    return 140000;
  }
}
