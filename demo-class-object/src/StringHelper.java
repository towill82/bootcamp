public class StringHelper {
  
  private String str; // attribute
  public StringHelper(String str) {
    this.str = str;
  }

  // instance method
  public StringHelper setCharAt(int index, char ch) {
    String s = new String("");
    for (int i = 0; i < this.str.length(); i++) {
      if(i == index)
      s += ch;
      else
      s += this.str.charAt(i);
    }
      this.str = s;
      return this;
  }
    public String toString() {
      return this.str;
    }

    public StringHelper append(String s) {
      this.str += s;
      return this;
    }

    public String subString(int startIdx, int endIdx) {
      String s = "";
      for (int i = startIdx; i < endIdx; i++) {
        s += this.str.charAt(i);
      }
      // this.str = s; no adding this code, no replace itself
      return s;
    }


  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setCharAt(3, 'a');
    System.out.println(sh.toString()); // helao

    sh.append("world");
    System.out.println(sh.toString()); // helaoworld

    sh.append("!!!").append(" I'm Vincent.").setCharAt(10, '#');
    System.out.println(sh.toString()); // helaoworld#!! I'm Vincent.

    "hello".charAt(1); // nothing

    System.out.println(sh.subString(2, 5)); // lao
  }
}
