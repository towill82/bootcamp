package form;

public class Address {
  private String line1;
  private String line2;
  private String line3;

  // all arguments constructor, getter
  public Address(String line1, String line2, String line3) {
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String getLine1() {
    return this.line1;
  }

  public String getLine2() {
    return this.line2;
  }

  public String getLine3() {
    return this.line3;
  }

  public String toString() {
    return "Address("
    + "line1=" + this.line1 //
    + ", line2=" + this.line2 //
    + ", line3=" + this.line3 //
    + ")";
  }

  public static void main(String[] args) {
    // Create a Form Object, with Address object
    Address address = new Address("abc", "ijk", "def");
    Form form = new Form ("Vincent", "Lau", address);
    System.out.println(form);

    // Form.class -> toString()
    // Form()

    System.out.println();

    Form form2 = new Form("Jenny", "Wong", address);
    System.out.println(form2.getAddress().getline2());

    // why both form address and form2 address was changed to xyz?
  }

}
