package club.banyuan;

public class Outer {

  private String outerPrivateProp = "outerPrivateProp";
  private String outerPropOverride = "outerPropOverride";

  public String getInnerPrivateProp() {
    // 外部类不能直接访问内部类属性，因为外部类对象实例化之后，内部类可能还没有实例化
    // 但是可以实例化一个内部类，使用其私有属性
    return new Inner().innerPrivateProp;
  }

  public class Inner {

    private String innerPrivateProp = "innerPrivateProp";
    private String outerPropOverride = "outerPropOverrideByInner";
    public static final int a = 0;
    public static int b = 2; // 编译错误，非静态内部类中不允许出现静态域，除非是静态常量

    public String getOuterPrivateProp() {
      // 内部类可以直接使用外部类的属性，因为内部类实例化的时候必须使用一个外部类的对象。
      return outerPrivateProp;
    }

    public String getInnerPrivateProp() {
      return innerPrivateProp;
    }

    public String getOuterProp() {
      // 在内部类中使用 外部类.this 指代外部类的对象
      return Outer.this.outerPropOverride;
    }

    public String getInnerProp() {
      // 内部类中this指代内部类的对象
      return this.outerPropOverride;
    }
  }
}
