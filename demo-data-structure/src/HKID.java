import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HKID {
  private String value;

  public HKID(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  @Override
  public String toString(){
    return "HKID(" //
    + "value=" + this.value//
    + ")";
  }

  // if you don't override equals() and hashCode(),
  // it extends them from Object.class
  // so, we compare "hkid object 1" and "hkid object 2"

  // if you override equals() and hashCode(),
  // if implies that you want to define their condition to be eqaul yourself.

  @Override
  public boolean equals (Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof HKID))
    return false;
    HKID hkid = (HKID) obj;
    return Objects.equals(this.value, hkid.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }


  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567", 34, "John"
    // "H2345678", 18, "Jenny"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));

    HKID hkid = new HKID ("H2345678");
    Customer customer = new Customer(18, "Jenny");
    customerMap.put(hkid, customer); // put() logic: compare existing keys and the new key


    // duplicated key
    // put one more customer with same key -> "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(21, "Oscar"));
    System.out.println(customerMap); // 3 entries. 
    
    // Why? How to solve?
    // Solution: Override equals() and hashCode() in Key.class (HashMap<Key, Value>)

    System.out.println(new HKID("1234").equals(new HKID("1234"))); 
    // true, just because you override equals() and hashCode()

    // put() -> use equals() and hashCode()
    // objectives of equals() & hashCode(): identify if they are same object
    // HashMap.class equals() & hashcode() is to identify if they are same key

    // put() program flow: hashmap.put(key, value) -> calls key.equals() & key.hashCode()

    // How about HashMap<String, String> ?
    // String .class is already done. you cannot change the implementation fo equals() and hashCode()
    // so String.equals() compares the value itself to determine if they are the same object

    // How about HashMap<Integer, String> ?
    // Integer .class is already done. you cannot change the implementation fo equals() and hashCode()
    // so String.equals() compares the value itself to determine if they are the same object
    System.out.println(new Integer(129).equals(new Integer(129))); // true
    System.out.println(new Integer(129) == (new Integer(129))); // false
  }
}
