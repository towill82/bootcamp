import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  
  // Attributes
  private String firstName;
  private String lastName;
  private double weight; // kg
  private double height;

  // Empty Constructor
  public Person() {

  }

  // All Arguments Constructor
  public Person(String firstName, String lastName, double weight, double height) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.weight = weight;

  }

  // Attributes Presentation
  public String fullName(){
    return this.firstName + " " + this.lastName; 
  }

  public String toString(){
    return "Person (" //
    + "firstName=" + this.firstName //
    + ", lastName=" +
  }

  // Weight / Height ^2 -> BigDecimal
  public double bmi(){
    return BigDecimal.valueOf(this.Weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height,2)),RoundingMode.HALF_UP)
    .doubleValue();
  }

  // Convert bmi() to static method
  public static double bmi(double weight, double height) {
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height,2)),RoundingMode.HALF_UP)
    .doubleValue();
  }


  // getter setter
  public String getFirstName() {
    return this.firstName;
  }

  public String LastName() {
    return this.lastName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }
  
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public static void main(String[] args) {
    // create a person
    // "Person()"
    Person p1 = new Person(); // "new Person() -> create a Person Object in Memory"
    // set lastname
    p1.setLastName("Vincent");
    // set firstname
    p1.setFirstName("Lau");
    // get fullname
    System.out.println(p1.fullName()); // Vincent Lau
    //
    p1.setHeight(1.7);
    p1.setWeight(65);
    System.out.println("p1's bmi=" + p1.bmi());
    System.out.println(p1.toString());
    // Person(firstName=Vincent, lastName=Lau,weight=65.0, height=1.7)

    System.out.println(Person.bmi(65, 1.7)); //22.5

    // Create a person object with given attribute values
    Person p2 = new Person("Jenny", "Chan", 55, 1.7);
    System.out.println(p2.fullName());
    System.out.println(p2.bmi()); //19.0
    p2.setWeight(54);
    System.out.println(p2.bmi); // 18.7


    Person p3 = p1;
    System.out.println(p1.getFirstName()); // Vincent
    System.out.println(p3.getFirstName()); // Vincent
  }




}
