import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Jenny");
    strings.add("Sam");

    // lambda for-each
    strings.forEach(s -> System.out.println(s));

    for (int i = 0; i < strings.size(); i++) {
      strings.set(i, strings.get(i).toLowerCase());
    }
    System.out.println(strings); //[john, jenny, sam]

    List<String> capNames = strings.stream() // List<String> -> Stream<String>
      .map(s -> s.toUpperCase()) // Stream<String>
      .collect(Collectors.toList()); // List<String> (new object)
      System.out.println(strings);
      System.out.println(capNames);

    capNames.add("SAM");
    System.out.println(capNames);

    Set<String> capNames2 = capNames.stream() // 
      .map(s -> {
          String newStr = s.toLowerCase() + s.toUpperCase();
          return newStr + "!!!";
      }).collect(Collectors.toSet()); 
  
    System.out.println(capNames2); // [johnJOHN!!!, jennyJENNY!!!, samSAM!!!]
  }
}
