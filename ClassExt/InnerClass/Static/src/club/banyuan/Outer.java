package club.banyuan;

public class Outer {

  public static String staticOuterProp = "staticOuterProp";
  public String outerProp = "staticOuterProp";

  public static void staticOuterMethod() {
    System.out.println("staticOuterMethod");
    Inner.staticInnerMethod();
  }

  public void outerMethod() {
    System.out.println("outerMethod");
  }

  public static class Inner {

    public static void staticInnerMethod() {
      System.out.println("staticInnerMethod");
      // 静态内部类中可以直接调用外部类的静态方法或属性
      System.out.println(staticOuterProp);
      // System.out.println(outerProp); // 编译报错，不能访问非静态的外部类属性
    }

    public void innerMethod() {
      System.out.println("innerMethod");
    }
  }
}
