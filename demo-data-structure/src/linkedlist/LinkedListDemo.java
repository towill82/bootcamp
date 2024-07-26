package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array vs ArrayList
    // 1.Underlying structure of Arraylist is array
    // 2. array -> fixed length -> a range of continous memory locations 

    Cat cat = new Cat(Color.BLUE);
    // Heap 
    // Step 1: Cat Object 
    // Step 2: Eye Array Object
    // Step 3: Two Eye objects
    // Step 4: 3 color objects (created when you execute the main method)

    cat.getEyes(); // cat object -> get Eye Array Object
    cat.getLeftEyes(); // Cat object -> Eye Array Object -> Eye Object

    Eye[] eyes = cat.getEyes(); // backup the array object memory location
    Eye rightEye = eyes[1];

    // What is the relationship between the memory location of cat, eyes, rightEye?
    // 1. LeftEye vs RightEye
    // 2. Cat object vs Eye[] object
    // 3. Cat object vs eye object
    
    String [] strings = new String[1000000];

    LinkedList<String> strings2 = new LinkedList<>();
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    strings2.add("D");
    for (String s : strings2) {
      System.out.println(s);
    }

    System.out.println(strings2.isEmpty()); // false
  }
}
