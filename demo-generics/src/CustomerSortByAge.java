import java.util.Comparator;

public class CustomerSortByAge implements Comparator<Customer> {

  public static CustomerSortByAge () {
    return new CustomerSortByAge();
  }

  @Override
  public int compare(Customer c1, Customer c2) {
    // -1 represents c1 object, 1 reprsents c2 object
    return c1.getAge() > c2.getAge() ? -1 : 1;
  }
}
