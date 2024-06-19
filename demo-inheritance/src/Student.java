public class Student extends Person {
  private int studentId;
  // private String name;
  // private int age;

  // constructor -> the process of constructing student object
  public Student(int studentId, String name, int age) {
    // calling Parent class constructor ...
    // 1. create Parent object inside Student Object (heap object)
    super(name,age); 
    this.studentId = studentId;
    // this.name = name;
    // this.age = age;
  }

  public int getStudentId() {
    return this.studentId;
  }

  // public String getName() {
  //  return this.name;
  // }

  // public int getAge() {
  // return this.age;
  // }

  public static void main(String[] args) {
    Student s = new Student(1, "Vincent", 13); // Student object in heap money
    System.out.println(s.getStudentId());
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }
}
