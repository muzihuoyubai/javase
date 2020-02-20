package club.banyuan;

public interface SonInter extends FatherInterA, FatherInterB {
  // 如果两个接口有一个提供了默认方法，子接口必须重写方法解决冲突
  @Override
  default void defaultMethod() {
    FatherInterA.super.defaultMethod();
  }
}
