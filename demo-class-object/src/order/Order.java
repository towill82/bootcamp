package order;

import java.math.BigDecimal;

public class Order {
  private static int count = 0;

  private int id;
  private Item[] items; // object ref
  private String coupon;

  public Order() {
    items = new Item[0];
    this.id = ++count;
    this.items = new Item[0];
  }

  public int getId(){
    return this.id;
  }

  public Item[] getItems(){
    return this.items;
  }

  public String getCoupon() {
    return this.coupon;
  }

  public double get Discount() {
    if (isCouponValid())
       return 0.2d;
      retrun 0.0d;
  }
}
  public void addItem(Item item) {
    Item[] itemsList = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      itemList[i] = this.items[i];
    }
    itemList[itemList.length - 1] = item;
    this.items = itemList;
}

  public double total() {
    BigDecimal amount = BigDecimal.valueOf(0L);
    // add, subtract, multiply, divde methods return new Object
    for (int i = 0; i < this.items.length; i++) {
      amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal())); //return new BigDecimal()
    }
    amount = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount())));

    return amount.doubleValue(); //convert from BigDecimal Object to double primitive value
  }

  public static void main(String[] args) {
    Order order = new Order();
    Item item = new Item (96.0d, 2);
    System.out.println(item.subtotal()); // 192.0
    order.addItem(item); //..

    item item2 = new Item (10,0d, 3); // 
    Order.addItem(item2); //..
    System.out.println(order.total()); // 222.0 * 0.8 = 177.6


  }
}
