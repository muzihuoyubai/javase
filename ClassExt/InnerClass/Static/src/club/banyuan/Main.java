package club.banyuan;

public class Main {

  public static void main(String[] args) {
    // 必须通过外部类名访问静态内部类的静态方法
    Outer.Inner.staticInnerMethod();
  }
}
