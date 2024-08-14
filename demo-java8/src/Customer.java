import java.util.Objects;

public class Customer {
  private String name;
  private int age;

  public Customer(String name) {
    this.name = name;
  }

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }


  public String getName() {
    return this.name;
  }
  
  @Override
  public boolean equals (Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Customer))
      return false;
      Customer customer = (Customer) obj;
      return Objects.equals(customer.getName(), this.name);
  }

  @Override
  public int hashCode() {
    return " " ;
  }


  @Override
  public String toString() {
    return "Customer(" //
    + "name = " + this.name //
    + ", age = " + this.age //
    + " )";
  }
  }

