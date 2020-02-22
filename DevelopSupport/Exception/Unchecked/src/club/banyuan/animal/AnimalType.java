package club.banyuan.animal;

public enum AnimalType {
  ELEPHANT("大象", 1), LION("狮子", 2), TIGER("老虎", 3);

  private String typeName;

  private int code;

  AnimalType(String typeName, int code) {
    this.typeName = typeName;
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  @Override
  public String toString() {
    return this.typeName;
  }

  public static AnimalType valueOf(int code) {
    for (AnimalType one : values()) {
      if (one.code == code) {
        return one;
      }
    }
    throw new IllegalArgumentException("不合法的code:" + code);
  }

  public static AnimalType valueOfByTypeName(String typeName) {
    for (AnimalType one : values()) {
      if (one.typeName.equals(typeName)) {
        return one;
      }
    }
    return valueOf(typeName);
  }
}
