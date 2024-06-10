public class Example_Macbook {
  
  private String model;
  private int screensize;
  private int ram;
  private int harddisk;
  
  public void setModel(String model) {
    this.model = model;
  }

  public void setScreensize(int screensize) {
    this.screensize = screensize;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setHarddisk(int harddisk) {
    this.harddisk = harddisk;
  }

  public String getModel() {
    return this.model;
  }

  public int getScreensize() {
    return this.screensize;
  }

  public int getRam() {
    return this.ram;
  }

  public int getHarddisk() {
    return this.harddisk;
  }

  public String describe(String x) {
    return "The model of this notebook is Macbook" 
    + this.model + ", with " 
    + this.screensize + " inch screen , with " 
    + this.ram + " GB ram, and "
    + this.harddisk + " TB harddisk" + x;
  }

  public static void main(String[] args) {
    Example_Macbook macbook = new Example_Macbook();
    macbook.setModel("Air");
    macbook.setScreensize(13);
    macbook.setRam(16);
    macbook.setHarddisk(1);
    System.out.println(macbook.describe("."));

    Example_Macbook macbook2 = new Example_Macbook();
    macbook2.setModel("Pro");
    macbook2.setScreensize(15);
    macbook2.setRam(32);
    macbook2.setHarddisk(2);
    System.out.println(macbook2.describe("."));
  }
}