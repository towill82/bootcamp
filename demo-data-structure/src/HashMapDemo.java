import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    // key & value pair
    HashMap<Integer, String> nameMap = new HashMap<>(); // key -> Integer, value -> String
    nameMap.put(100, "Vincent");
    // nameMap.put("Vincent", 100); // NOT OK, violate the hashmap defintion

    // We can get value by key

    System.out.println(nameMap.get(100)); // "Vincent"

    // You CANNOT get key by VALUE
    System.out.println(nameMap.get("Vincent")); // 100

    // No ordering
    nameMap.put(1010, "Cindy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45)); //Sally

    // Key + Value -> Entry 
    // A map consists of many entries

    // For LOOP -> HashMap.class
    // Loop for entries
    for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
      System.out.println("key=" + entry.getKey() //
          + ",value=" + entry.getValue());
    }

    // Handle duplicated key -> overwrite the value if the key exists
    nameMap.put(1010, "Peter");
    System.out.println(nameMap);

    // null key
    nameMap.put(null, "Oscar"); // OK
    System.out.println(nameMap);

    // null value
    nameMap.put(-45, null);
    System.out.println(nameMap);

    // 
    nameMap.remove(1010);
    System.out.println(nameMap);

    //
    String oldValue = nameMap.remove(-45); // remove entry by key
    System.out.println(nameMap);
    System.out.println(oldValue);
  }
}
