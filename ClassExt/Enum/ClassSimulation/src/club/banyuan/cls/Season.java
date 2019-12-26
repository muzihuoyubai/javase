package club.banyuan.cls;

public class Season {

  public static final Season SPRING = new Season();
  public static final Season SUMMER = new Season();
  public static final Season AUTUMN = new Season();
  public static final Season WINTER = new Season();

  // 私有化构造器，类不能被其他类继承，类在别的类中无法实例化对象
  private Season() {
  }

  @Override
  public String toString() {
    if (this == SPRING) {
      return "SPRING";
    } else if (this == SUMMER) {
      return "SUMMER";
    } else if (this == AUTUMN) {
      return "AUTUMN";
    } else {
      return "WINTER";
    }
  }

  public static Season valueOf(String type) {
    switch (type) {
      case "SPRING":
        return SPRING;
      case "SUMMER":
        return SUMMER;
      case "AUTUMN":
        return AUTUMN;
      case "WINTER":
        return WINTER;
    }
    return null;
  }
}
