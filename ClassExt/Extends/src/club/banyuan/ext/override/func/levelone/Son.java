package club.banyuan.ext.override.func.levelone;

public class Son extends Father {

  public String fatherPropOverride = "fatherPropOverrideInSon";

  public void accessFatherProp() {
    // 当子类没有覆盖属性的时候 fatherProp 就是 super.fatherProp
    System.out.println(fatherProp); // 输出 fatherProp
    System.out.println(super.fatherProp); // 输出 fatherProp

    // 当子类自己定义了一个父类属性的时候
    // fatherPropOverride 表示子类的存储区
    // super.fatherPropOverride 表示父类的存储区
    System.out.println(fatherPropOverride); // 输出 fatherPropOverrideInSon
    System.out.println(super.fatherPropOverride); // 输出 fatherPropOverride
  }

  public void accessFatherMethod() {
    fatherMethodOverride();
    fatherMethod();
  }

  @Override
  public void fatherMethodOverride() {
    System.out.println("fatherMethodOverrideInSon");
  }
}
