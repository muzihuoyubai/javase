package club.banyuan.packtwo;

import club.banyuan.packone.FatherInPackOne;

public class SonInPackTwo extends FatherInPackOne {

  public String sonMethod() {
    System.out.println("sonMethod");
    // 子类内部可以调用父类的protected方法，即便和父类不同包
    return fatherMethod();
  }
}
