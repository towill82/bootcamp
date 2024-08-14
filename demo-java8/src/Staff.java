public class Staff {
  private String department;
  private String name;
  private int salary;

  public Staff(String department, String name) {
    this.department = department;
    this.name = name;
  }
  
  public Staff(String department, String name, int salary) {
    this.department = department;
    this.name = name; 
    this.salary = salary;
  }
  
  public int getSalary() {
    return this.salary;
  }

  public String getDepartment() {
    return this.department;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString(){
    return "Staff(" //
    + "department = " + this.department //
    + ", name = " + this.name //
    + " )";
 
    }
  }

