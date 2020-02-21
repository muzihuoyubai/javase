package club.banyuan.clsenum;

public class AnimalType {

  public static final AnimalType ELEPHANT = new AnimalType("大象", 1);
  public static final AnimalType LION = new AnimalType("狮子", 2);
  public static final AnimalType TIGER = new AnimalType("老虎", 3);

  private String typeName;
  private int code;

  private AnimalType(String typeName, int code) {
    this.typeName = typeName;
    this.code = code;
  }

  @Override
  public String toString() {
    return this.typeName;
  }

  public int getCode() {
    return code;
  }

  public static AnimalType valueOf(String typeName) {
    if (ELEPHANT.typeName.equals(typeName)) {
      return ELEPHANT;
    }
    if (LION.typeName.equals(typeName)) {
      return LION;
    }
    if (TIGER.typeName.equals(typeName)) {
      return TIGER;
    }
    return null;
  }

  public static AnimalType valueOf(int code) {
    if (ELEPHANT.code == code) {
      return ELEPHANT;
    }
    if (LION.code == code) {
      return LION;
    }
    if (TIGER.code == code) {
      return TIGER;
    }
    return null;
  }
}
