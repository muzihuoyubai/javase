package club.banyuan.cls;

public class Gender {

  private String name;

  public static final Gender MALE = new Gender("男性");
  public static final Gender FEMALE = new Gender("女性");

  // 私有化构造器，类不能被其他类继承，类在别的类中无法实例化对象
  private Gender(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    if (this == MALE) {
      return "MALE";
    } else {
      return "FEMALE";
    }
  }

  public String getName() {
    return name;
  }

  public static Gender valueOf(String type) {
    switch (type) {
      case "MALE":
        return MALE;
      case "FEMALE":
        return FEMALE;
    }
    return null;
  }
}
