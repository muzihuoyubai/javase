package club.banyuan;

public class Son extends Father {

  // 当子类自己定义了一个属性和父类继承的属性同名
  public String fatherPropOverride = "fatherPropOverrideInSon";

  public void accessFatherProp() {
    // 当子类没有覆盖属性的时候 fatherProp 就是 super.fatherProp
    System.out.println(fatherProp); // 输出 fatherProp
    System.out.println(super.fatherProp); // 输出 fatherProp

    // fatherPropOverride 表示子类的属性存储区
    System.out.println(fatherPropOverride); // 输出 fatherPropOverrideInSon

    // super.fatherPropOverride 表示父类的属性存储区
    System.out.println(super.fatherPropOverride); // 输出 fatherPropOverride
  }
}
