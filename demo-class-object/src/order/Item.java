package order;

public class Item {
  private double price;
  private int quantity;

  public item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }
  
  public double getQuantity() {
    return this.quantity;
  }

  public double subtotal() {
    return this.price * this.quantity; // double * int -> double * double  -> 3.333 * 2.0
  }

}
