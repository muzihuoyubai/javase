package club.banyuan;

public enum Gender {
  MALE("男性"), FEMALE("女性");
  private final String type;

  Gender(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }


  @Override
  public String toString() {
    return super.toString();
  }
}
