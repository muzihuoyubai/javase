package club.banyuan.field;

public class Son extends Father {

  // 当子类自己定义了一个属性和父类继承的属性同名
  public String fatherFieldOverride = "fatherFieldOverrideInSon";

  public void accessFatherField() {
    // 当子类没有覆盖属性的时候 fatherField 就是 super.fatherField
    System.out.println(fatherField); // fatherField
    System.out.println(super.fatherField); // fatherField

    // fatherFieldOverride 表示子类的属性存储区
    System.out.println(fatherFieldOverride); // fatherFieldOverrideInSon

    // super.fatherFieldOverride 表示父类的属性存储区
    System.out.println(super.fatherFieldOverride); // fatherFieldOverride
  }
}
