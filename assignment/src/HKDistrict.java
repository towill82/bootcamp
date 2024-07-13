public enum HKDistrict {
  NT("New Territory", 1),
  KLN("Kowloon", 2),
  HK("Hong Kong Island",3),
  ;

  // instance variable
  private String district;
  private int DValue;
  

  // Constructor
  private HKDistrict(String district, int DValue) {
    this.district = district;
    this.DValue = DValue;
  }

  public String getDistrict(){
    return this.district;
  }

  public int getDValue(){
    return this.DValue;
  }

  @Override
  public String toString() {
    return "HKDistrict(" //
    + "district = " + this.district //
    + "DValue = " + this.DValue //
    + ")";
  }

  public static HKDistrict get(int DValue) {
    for (HKDistrict hkdistrict : HKDistrict.values()) {
      if (DValue == hkdistrict.getDValue()) {
        return hkdistrict;
      }
      return null; // throw exception (will be teach later)
    }

  public static int get(HKDistrict hkdistrict) {
    return hkdistrict.getDValue();
  }

  }


}
