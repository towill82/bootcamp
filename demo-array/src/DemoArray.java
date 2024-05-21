import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int x1 = 10;
    int x2 = 20;
    int x3 = -3;

    // When you create an array object, you have to define the length of it.
    int[] arr = new int[3]; // stores int value only, and the length = 3
    // arr[index]
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = -3;
    // arr[0] = "hello"; // Java Compiler knows that "arr" is a int array, which stores int value
    System.out.println(arr[0]); // 10
    System.out.println(arr[1]); // 20
    System.out.println(arr[2]); // -3

    arr[1] = 100;
    System.out.println(arr[1]); // 100

    // Run-time Exception
    // arr[3] = 200; java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    int[] arr2 = new int[] {10, 20, -3};
    System.out.println(arr2[0]); // 10
    System.out.println(arr2[1]); // 20
    System.out.println(arr2[2]); // -3

    // String array -> "hello", "abc", "ijk"
    // print all 3 String values
    String[] strings = new String[] {"hello", "abc", "ijk"};
    System.out.println(strings[0]);
    System.out.println(strings[1]);
    System.out.println(strings[2]);

    byte[] bytes = new byte[] {2, 3, 4};
    long[] values = new long[] {2, 3, 4};
    double[] dl = new double[] {2.0, 3.3, 4};

    // Arrays.
    System.out.println(Arrays.toString(strings)); // [hello, abc, ijk]
    System.out.println(Arrays.toString(arr2)); // [10, 20, -3]

    // 9, -3, -100, 90, 66, -4
    // for loop,print out all


    int[] arr3 = new int[] {9, -3, -100, 90, 66, -4};
    for (int i = 0; i < arr3.length; i++) { // 0,1,2,3,4,5
      System.out.println(arr3[i]);
    }

    // loop
    // find the max value from arr3
    int max = Integer.MIN_VALUE; // the min. value of int
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
      }
    }
    System.out.println("max=" + max);

    // find the min. value from arr3
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < min) {
        min = arr3[i];
      }
    }
    System.out.println("min=" + min);

    //
    char [] arr4 = new char[] {'l', 'e', 'e', 'r', 'q'};
    // 1. count the number of 'e'
    int count = 0;
    for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
      if (arr4[i] == 'e') {
        count++;
      }
    }
    System.out.println("The number of character e= " + count);

    // 2. boolean result to store if 'r' exist
    boolean isrExist = false;
    for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
      if (arr4[i] == 'r') {
        isrExist = true;
        break;
      }
    }
    System.out.println("Does character r exist? " + isrExist);

      // char [] arr4 = new char[] {'l', 'e', 'e', 'r', 'q'};
    // 3. String result to store "qreel"
    String s = "";
    for (int i = arr4.length - 1; i >= 0; i--) {
      s += arr4[i];
    }
    System.out.println("Reversed char[] = " + s);
    
    // 4. Give two char[], result -> append all characters to a String value
    char[] c1 = new char[] {'o', 'a', 'k'};
    char[] c2 = new char[] {'a', 'b', 'f'};
    // 4a. result -> "oakpabft". append all characaters to a String value
    // 4b. result -> "obkt". when even index, get the value from c1. when odd index, get the value from c2




  }
}

