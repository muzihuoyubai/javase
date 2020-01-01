package club.banyuan;

import java.util.function.Supplier;

public class LambdaDemo {

  // 静态和实例变量是可以被lambda使用的，即使不是final的也可以使用。
  // 因为获取lambda的方法被调用一定要有一个实例，lambda可以修改这个实例里面的变量内容，是可以被外部感知到的，和局部变量不同
  private static String staticStr = "staticStr";
  private String str = "string";

  public Supplier<String> refVariable() {
    // 局部变量必须是effectively final的才可以访问，因为局部变量存储区域在栈上，空间会被释放掉，
    // lambda内部获取的是局部变量的副本，不会影响到外部的值
    String localStr = "localStr";
    return () -> {
      String result = staticStr + "_" + str + "_" + localStr;
      str = result;
      return result;
    };
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }
}
