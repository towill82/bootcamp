public class Quiz01 {
  public static void main(String[] args) {
    
    //Q1
    // int price = 150;
    // int quantity = 10;
    // int discount = 0.9;
    // System.out.println(price * quantity * discount);

    //Q2
    // byte hoursOfDay = 24;
    // byte daysOfWeek = 7;
    // byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek);
    // System.out.println(hoursOfWeek);

    //Q3
    //String str = "Welcome to programming";
    //String newStr = str.replace("WELCOME TO", "");
    //char c = newStr.trim().charAt(2);
    //System.out.println(c);

    //Q4
    //String s = "hello";
    //String newStr = "";
    //if (s.length() > 5 || s.indexOf("he") == 1) {
    //  newStr = s;
    //} else {
    //  newStr += "str";
    //}
    //System.out.println(newStr);

    //Q5
    //String str = "";
    //for (byte i = 127; i < 128; i++) {
    //  str += i;
    //  if ( i < 0) {
    //    break;
    //  }
    //}
    //System.out.println(str);

    //Q6
    //String str = "";
    //for (byte i = 127; i < 128; i++) {
    //  if (i < 0 ) {
    //    continue;
    //  }
    //  str += i;
    //}
    //  System.out.println(str);
      
    //Q7
    //int[] integers = { 20, 10, 40 };
    //byte[] bytes = new byte [] { 2, 4, 1 };
    //int score = 0;

    //for (int i = 0; i < 3; i++) {
    //  if (i % 2 == 1) {
    //    score += integers[i];
    //  } else {
    //    score += bytes[i];
    //  }
    //}
    //System.out.println(score);

    //Q8
      //String [] strings = new String[3];
      //String sum = "";
      //for (int i = 0; i < 4; i++) {
        //strings [i] = String.valueOf(i);
        //sum += strings[i];
      //}
      //System.out.println(sum);

      // Q9
      //int a = 0;
      //while (a < 3) {
       // switch (a) {
         // case 0:
         // System.out.println("0");
         // case 2:
          //System.out.println("2");
       // }
        //a++;
      //}

      //Q10
      int g = 3;
      System.out.println(++g * 8);

  }
}
