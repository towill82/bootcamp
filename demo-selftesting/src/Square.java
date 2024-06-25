// public class Password {
  
    //private String password;

    //public Password(String x){
    //  this.password = x;
    //}
  
    //public String getPassword(){
    //  return this.password;
    //}
  

  //public static void main(String[] args) {
    //Password p1 = new Password("ABC");
    //Password p2 = new Password("ABC");
    //Password p3 = new Password("BCD");
    //String s1 = new String("abc");

    //System.out.println(p1 == p2);
    //System.out.println(p2 == p3);
    //System.out.println(p1.getPassword().equals(p2.getPassword()));
    //System.out.println("abc".equals(s1));
  
  //}
//class Password {
  //public static int counter = 2;
 // private String password;

  //public Password(String x) {
    //this.password = x;
    //counter++;
  //}


  //public void setPassword(String password) {
    //this.password = password;
    //counter--;
  //}

  //class Quiz {
    //public static void main(String[] args) {
     // Password p1 = new Password("ABC");
     // Password p2 = new Password("ABC");
     // Password p3 = new Password("BCD");
      //p2.setPassword("password");
      //Password.counter *= Password.counter;

      //System.out.println(Password.counter);
    //}
  //}

  //class Quiz {
    //static int counter = 10;

   // public static void main(String[] args) {
     // for (byte i = 0; i < 128; i--) {
       // counter++;
      //}
      //System.out.println(counter);
   // }
  // }

  //class Password {
   // private String password;

   // public Password(String x) {
    //  this.password = x;
   // }

   // public String getPassword() {
    //  return this.password;
   // }

   // public void setPassword(String password) {
    //  this.password = password;
   // }

   // public void append (Password password) {
    //  password.setPassword("XYZ");
    //  this.password = "BCD";
    // }
 //  }

//  class Quiz {
  //  public static void main(String[] args) {
   //   Password p1 = new Password("ABC");
   //   Password p2 = new Password("BCD");
   //   p1.append(p2);
   //   System.out.println(p1.getPassword() + p2.getPassword());
   //  }
 // }

 //class Password {
 // private String password;

 // public Password(String x) {
 //   this.password = x;
 // }

  //public String getPassword() {
  //  return this.password;
 // }

  //public void setPassword(String password) {
  //  this.password = password;
  //}
// }

  //class Quiz {
   // public static void main(String[] args) {
    //  Password p1 = new Password("ABC");
    //  Password p2 = new Password("ABC");

     // if (p1 == p2 || !p1.getPassword().equals(p2.getPassword())) {
      //  p1.setPassword("DEF");
     // } else if (p1.getPassword().equals(p2.getPassword())) {
     //   p2.setPassword("ABC"); 
     // } else {
     //   p1.setPassword("XYZ");
      //  p2.setPassword("XYZ");
     // }
     // System.out.println(p1.getPassword()+ p2.getPassword());
     // }
   // }

  //class Password {
    //private String password;

    //public static String concat(String x) {
      //return x;
   // }
    
   // public Password(String x) {
    //  this.password = x;
   // }

   // public String concat(String x, String y) {
   //   return y.toLowerCase().toUpperCase();
   // }
 // }

 // class Quiz {
  //  public static void main(String[] args) {
  //    int counter = 0;
  //    Password p1 = new Password("Start") ;
  //    System.out.println(p1.concat("XYZ", "abc"));
  //  }
 // }

 //public class Simple {
 // int x;
 // double y;
 // String z;

 // void add(double c, double d) {
 //   this.y = c + d + 1.0;
 // }

 // void add(int a, int b) {
  //  this.x = a + b;
  //}

  //void add(String e, String f) {
  //  this.z = e + f;
  //}

  //public static void main(String[] args) {
   // Simple simple = new Simple();
   // simple.add(2, 2);
   // simple.add(3.2d, 3.2d);
   // simple.add("5", "3.2");
   // System.out.println(simple.x + " , " + simple.y + " , " + simple.z);
  //}
 //}

 //public class SuperBuilder {
  //public static void main(String[] args) {
   // StringBuilder s = new StringBuilder("abc");
    //boolean bool = s.append("def").startsWith("def");
    //System.out.println(bool);
  //}
 //}


 import java.math.BigDecimal;

 public class Square {
  
  private BigDecimal length;

  public BigDecimal area() {
    return this. length.multiply(this.length);
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public static void main(String[] args) {
    Square s = new Square();
    s.setLength(5.0);
    System.out.println(s.area());
  }
 }


