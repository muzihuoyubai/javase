package club.banyuan.packtwo;

import club.banyuan.packone.FatherInPackOne;
import club.banyuan.packone.SonInPackOne;

public class MainInPackTwo {

  public static void main(String[] args) {
    FatherInPackOne fatherInPackOne = new FatherInPackOne();

    // 不同包下的类不能访问 protected 的属性和方法
    /* 编译报错
    System.out.println(fatherInPackOne.fatherProp);
    System.out.println(fatherInPackOne.fatherMethod());
*/
    SonInPackOne sonInPackOne = new SonInPackOne();
    // 不同包下的类不能访问 子类继承的protected 的属性和方法
  /*  编译报错
    System.out.println(sonInPackOne.fatherProp);
    System.out.println(sonInPackOne.fatherMethod());
    */
    // 虽然不能直接访问protected方法，以通过子类的public方法间接访问
    System.out.println(sonInPackOne.sonMethod());

    SonInPackTwo sonInPackTwo = new SonInPackTwo();
    // 不同包下的类不能访问 子类继承的protected 的属性和方法，就算和当前子类同包和不行
  /*
    // 编译报错
    System.out.println(sonInPackTwo.fatherProp);
    System.out.println(sonInPackTwo.fatherMethod());
    */
    // 虽然不能直接访问protected方法，以通过子类的public方法间接访问
    System.out.println(sonInPackTwo.sonMethod());
  }
}
