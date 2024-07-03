public enum Direction {
  EAST(1), NORTH(2), WEST(-1), SOUTH(-2);

  // Advantage: Able to present some relationship among the enum objects
  public  boolean isOppsite(Direction direction) {
    return this.value + direction.value == 0;
  }

    private int value;

    private Direction(int value) {
      this.value = value;
    }  

  public static void main(String[] args) {
    // Direction -> class / enum
    // Direction.EAST -> object 
    System.out.println(Direction.EAST.isOppsite(Direction.WEST)); // true
    System.out.println(Direction.NORTH.isOppsite(Direction.SOUTH)); // true
    System.out.println(Direction.EAST.isOppsite(Direction.NORTH)); // false
    System.out.println(Direction.WEST.isOppsite(Direction.SOUTH)); // false

  }

}




