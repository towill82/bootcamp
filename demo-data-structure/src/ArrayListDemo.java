import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) throws Exception {
     Integer[] integers = new Integer[] {2, 10, -4};
     // for-each
     int sum = 0;
     for (Integer i : integers) {
        sum += i;
     }
     System.out.println(sum);

     // Arraylist
     ArrayList<Integer> integers2 = new ArrayList<Integer>(); // call constructor of ArrayList.class
     integers2.add(2);
     integers2.add(10);
     integers2.add(-4);
     sum = 0;
     for (Integer i : integers2) {
        sum += i;
     }
     System.out.println(sum); // 8

     // 1. remove 10
     integers[1] = null; // [2, null, -4]

     // 2. remove 10, and re-create array -> [2, -4]
     Integer [] arr = new Integer[integers.length -1];
     // ...

     // Difference between Integer[] and ArrayList<Integer>
     // 1. Initialization: Array (fixed length), ArrayList (variable length)
     // 2. Underlying structure: Array is a raw data structure in Java, ArrayList is a class (array)
    
     System.out.println(integers2.size()); // 3
     integers2.remove(1); // 10
     System.out.println(integers2); // [2, -4]

     integers2.set(1, -100);
     System.out.println(integers2); // [2, -100]
     System.out.println(integers2.contains(2)); //true
     System.out.println(integers2.indexOf(-100)); // 1
     System.out.println(integers2.indexOf(-1000)); // -1

     integers2.add(2); // [2, -100, 2]
     System.out.println(integers2.indexOf(2)); // 0

     System.out.println(integers2.lastIndexOf(2)); // 2

     System.out.println(integers2.subList(1, 3)); // from index 1 to index 2 -> [-100, 2]

     System.out.println(integers2); // [2, -100, 2]

     // addAll()
     ArrayList<Integer> integers3 = new ArrayList<Integer>();
     System.out.println(integers3.isEmpty()); // true
     integers3.addAll(integers2);
     System.out.println(integers3.isEmpty()); // false

     System.out.println(integers3); // [2, -100, 2]

     ArrayList<String> strings = new ArrayList<> (); 
     // You can skip the type declaration when you create the arraylist object
     // by default it follow the type specified at the left hand side

     strings.add("hello");
     strings.add("abc");
     strings.add("world");
     strings.remove(1); // remove "abc" -> ["hello", "world"]

     strings.add("hello"); // add "hello" -> ["hello", "world", "hello"]
     System.out.println(strings);
     strings.remove("hello"); // remove "hello" -> ["world"]
     System.out.println(strings); // [world, hello]


     // get by index: get()
     System.out.println(strings.get(0)); //world

     // Question 1: Give String[], remove those string with length <= 3
     String[] stringArray = new String [] {"anc", "a", "", null, "aaaa"};
     ArrayList<String> result = new ArrayList<>();
      for (String s : stringArray) {
         if (s != null && s.length() > 3) {
            result.add(s);
         }
      }
     System.out.println(result); // ["aaaa"]

     // Question 2: Given Customer[], retrieve all person object with age > 30 or
     // name startsWith "J"
     Customer[] customers = new Customer[] {new Customer(40, "Mary") //
     , new Customer(31, "John") //
     , new Customer(29, "Jason") //
     , new Customer(29, "Cindy")};
     // loop
     ArrayList<Customer> customerList = new ArrayList<>();
     for (Customer c : customers){
      if (c.getAge() > 30 || (c.getName() != null && c.getName().startsWith("J"))){
         customerList.add(c);
      }
     }

     System.out.println(customerList);

     ArrayList<Object> objects = new ArrayList<>();
     objects.add("abc");
     objects.add(1);
     objects.add(LocalDate.of(2024, 5, 22));
     // print
     // check if the objects equals to xxx... 
     // Compare the difference between ArrayList<Object> and ArrayList<String>
    }
   }


