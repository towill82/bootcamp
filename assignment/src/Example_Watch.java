import java.time.LocalDate;

public class Example_Watch {
  
  private String brand;
  private String model;
  private int value;
  private LocalDate ld;

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setLd(LocalDate ld) {
    this.ld = ld; 
  }

  public String getBrand() {
    return this.brand;
  }

  public String getModel() {
    return this.model;
  }

  public int getValue() {
    return this.value;
  }

  public LocalDate getLd() {
    return this.ld;
  }

  public String describe(String x) {
    return "The watch is " + this.brand + " (" + this.model + ") " 
    + ", with the market price HKD" + this.value + " in " + this.ld; 
  }

  public static void main(String[] args) {
    
    Example_Watch example_Watch = new Example_Watch();
    example_Watch.setBrand("Rolex");
    example_Watch.setModel("Submariner");
    example_Watch.setValue(90000);
    example_Watch.setLd(LocalDate.of(2023,12,1));
    System.out.println(example_Watch.describe("."));

    Example_Watch example_Watch2 = new Example_Watch();
    example_Watch2.setBrand("Rolex");
    example_Watch2.setModel("Daytona");
    example_Watch2.setValue(189800);
    example_Watch2.setLd(LocalDate.of(2024,04,9));
    System.out.println(example_Watch2.describe("."));


  }
 }
