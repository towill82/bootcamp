public class DemoBlock {
  
  private static int number;
  private static int number2;
  private String name;

  // static block
  // 1. triggered once only, no matter the numbe rof static variable(s).

  static {
    System.out.println("start static block.");
    // number = 3;
    System.out.println("end static block.");
  }
  public DemoBlock(String name) {
    System.out.println("calling all args constructor ...");
    this.name = name;
  }

  // instance book
  // 1. it is triggered when there is new object created
  // 2. it is triggered before constructor
  // 3. Usage: common logic between constructors
  {
    System.out.println("start instance block.");
    this.name = "John";
    System.out.println("end instance block.");
    number = 10;
  }

  public DemoBlock() {
    System.out.println("calling constructor ... ");
  }

  public static void main(String[] args) {
    System.out.println("start.");
    System.out.println(DemoBlock.number); // 3
    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock("Vincent");
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number); //10
    System.out.println("end.");
  }
}
