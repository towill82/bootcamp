public class Quiz1 {
 public static void main(String[] args) {
  //int price = 150;
  //int quantity = 10;
  //int discount = 0.9;
  //System.out.println(price * quantity * discount);

  //byte hoursOfDay = 24;
  //byte daysOfWeek = 7;
  //byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek);
  //System.out.println(hoursOfWeek); 


  //String str = "Welcome to programming";
  //String newStr = str.replace("WELCOME TO", "");
  //char c = newStr.trim().charAt(2);
  //System.out.println(c);


  //String s ="hello";
  //String newStr = "";
  //if (s.length() > 5 || s.indexOf("he") == 1) {
  //  newStr = s; 
  //} else {
  //  newStr += "str";
  //} 
  //System.out.println(newStr); //str


    //String str = "";
    //for (byte i = 127; i < 128; i++) {
     // str += i;
     // if (i < 0) {
     //   break;
     // }
   // }
    //System.out.println(str); // 127-128

      String str = "";
      for (byte i = 127; i < 128; i++) {
        if (i < 0) {
          continue;
        }
        str += i;
      }
      System.out.println(str);


 } 
}