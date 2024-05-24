public class DemoMethod {
  public static void main(String[] args) {
    
    // Method: you put something into the box, and then it return something to you.
    // Calling method
    System.out.println("hello");

    // Call method (sum)
    int result = sum(10,3);
    System.out.println("result=" + result);

    System.out.println(lastChar("hello")); //o

    char[] arr = new char[] {'a', 'b', 'c'};
    System.out.println(toString(arr));

    System.out.println(max(new int[] {3, 10, 7})); // 10

    System.out.println(isSubstring("hello","ll")); // true

  } 


  public static int sum(int x, int y) {
    // if your method is with return type, the method content should contain a key word "return"
    return x + y; // int + int -> int
  }

  public static char lastChar(String s) {
    return s.charAt(s.length() - 1);
  }

  public static String toString(char[] arr) {
    // Approach 1:
    // String result = "";
    // for (int i = 0; i < arr.length; i++) {
    // result += arr[i];
    // }
    // return result;

    // Approach 2:
    return String.valueOf(arr);
  }

  public static int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];

      }
    }
    return max;
  }

    public static boolean isElderly(int age) {
      // > 65
      //if (age > 65) {
      //  return true;
      //}
      //return false;
    //}

     // Approach 2:
     return age > 65;
    }


     public static boolean isSubstring(String str, String substr) {
      // check if substr is a substring of str

      // Approach 1:
      // return str.contains(substr);

      // Approach 2:
      // indexOf() method returns an int index, which is index position substring
      // if it returns -1, means not exists.
      // return str.indexOf(substr) != -1;

      // Approach 3:
      // helllo, llll
      boolean isSubstring = false;
      for (int i = 0; i < str.length() - substr.length(); i++) {
        for (int j = 0; j < substr.length(); j++) {
          if (str.charAt(i + j) != substr.charAt(j)) {
            break;
          }
          if (j == substr.length() - 1) {
            return true;
          }
        }
      }
      return false;
  }
}
