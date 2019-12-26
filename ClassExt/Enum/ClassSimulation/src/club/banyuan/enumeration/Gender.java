package club.banyuan.enumeration;

public enum Gender {
  MALE("男性"), FEMALE("女性");
  private final String name;

  Gender(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  @Override
  public String toString() {
    return super.toString();
  }
}
