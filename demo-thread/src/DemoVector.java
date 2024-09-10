import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  public static void main(String[] args) {
    // ArrayList (non thread-safe, better performance) vs Vector (thread-safe, poor performance -> synchronized)
    // 
    List<String> strings = new ArrayList<>(); // ArrayList implementation differs to Vector implementation

    Runnable addStringToArrwayList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("hello");
      }
    }; // run() method implementation

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrwayList);
    Thread thread2 = new Thread(addStringToArrwayList);
    thread1.start(); // call run()
    thread2.start(); 

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime=" + (afterTime - startTime));
      System.out.println("ArrayList.size()=" + strings.size()); // ArrayList.size()=1175251
    } catch (InterruptedException e) {

    }

    // Solution for Multi-threading
    List<String> strings2 = new Vector<>(); // ArrayList implementation differs to Vector implementation

    Runnable addStringToVector = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings2.add("hello");
      }
    }; 

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); // call run()
    thread4.start(); 

    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime=" + (afterTime - startTime));
      System.out.println("Vector.size()=" + strings2.size()); // ArrayList.size()=1175251
    } catch (InterruptedException e) {

    }





    // System.out.println(strings.size()); // NOT OK, main program flow
    System.out.println("Program ends ... ");
  
    // Steps to resize the ArrayList / Array (add element)
    // 1. create a new array (old length + 1)
    // 2. copy of the old array to new array
    // 3. Add the new element at the array
    // 4. reassign the new object ref to the old object ref


  }
}
