package club.banyuan.accprotected.packone;

public class SonInPackOne extends FatherInPackOne {

  public String sonMethod() {
    System.out.println("sonMethod");
    // 子类内部可以调用父类的protected方法
    return fatherMethod();
  }
}
