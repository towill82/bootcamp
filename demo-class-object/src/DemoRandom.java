import java.util.Random;
import javax.swing.event.SwingPropertyChangeSupport;

public class DemoRandom {
  
  private int baseSalary = 6000;

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  private int z;
  public static void main(String[] args) {
    // JDK
    // random -> usually integer
    int random = new Random().nextInt(3); // 0-2
    System.out.println(random);
    int random2 = new Random().nextInt(3) + 1; // 1-3
    System.out.println(random2);
    int random3 = new Random().nextInt(3 - 1) + 1; // 0-1 + 1 -> 1-2
    System.out.println(random3);


    // how to make (49 or 50)
   
    DemoRandom dr = new DemoRandom();
    System.out.println(dr.sum(2, 3)); // 5
    System.out.println(DemoRandom.sum(2, 3)); // 5

    DemoRandom dr2 = new DemoRandom();
    System.out.println(dr2.sum2(2, 3));


  }

  public int getSalary(int bonus) {
    return this.baseSalary + bonus;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public int sum2(int x, int y) {
    return x + y;
  }

}
