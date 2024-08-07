public interface DemoEnum {
  
  // Constant (finite)
  // Weekday
  public static final String monday = new String ("MONDAY");
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thursday = "THURSDAY";
  public static final String friday = "FRIDAY";

  public static void main(String[] args) {
    System.out.println(DemoEnum.monday); // MONDAY

    // what happen in heap memory?
    // Answer: static variable would not point to object

    // Before executing, the main method, it loads enum class 
    System.out.println(Weekday.MONDAY); // sysout -> calling Weekday MONDAY toString()
    // by deafult Weekday.class already @Override toString()
    System.out.println(Weekday.THURSDAY);
    System.out.println(Weekday.WEDNESDAY);
    System.out.println(Weekday.THURSDAY);
    System.out.println(Weekday.FRIDAY);

    // Other example ?
    // NORTH, SOUTH, EAST, WEST

    Direction d = Direction.EAST;
    if (d ==  Direction.SOUTH) { // compare object address directly
    System.out.println(d);
  }

  }
}
