package club.banyuan.accprivate;

public class Father {

  // 私有属性，外部不可访问，子类也不能用
  private String fatherField = "fatherField";

  // 私有方法，外部不可访问，子类也不能用
  private String fatherMethod() {
    return "fatherMethod";
  }

  // 提供外部方法用来访问私有属性，将属性隐藏起来
  public String getFatherField() {
    return fatherField;
  }
}
