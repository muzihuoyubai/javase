package club.banyuan.packone;

import club.banyuan.packtwo.SonInPackTwo;

public class MainInPackOne {

  public static void main(String[] args) {
    FatherInPackOne fatherInPackOne = new FatherInPackOne();

    // 同包下的类可以访问 protected 的属性和方法
    System.out.println(fatherInPackOne.fatherProp);
    System.out.println(fatherInPackOne.fatherMethod());

    SonInPackOne sonInPackOne = new SonInPackOne();
    // 同包下的类可以访问子类继承的 protected 的属性和方法
    System.out.println(sonInPackOne.fatherProp);
    System.out.println(sonInPackOne.fatherMethod());
    System.out.println(sonInPackOne.sonMethod());

    // 和父类同包下的类可以访问不同包子类继承的当前包下的父类的 protected 的属性和方法
    SonInPackTwo sonInPackTwo = new SonInPackTwo();
    System.out.println(sonInPackTwo.fatherProp);
    System.out.println(sonInPackTwo.fatherMethod());
    System.out.println(sonInPackTwo.sonMethod());

  }
}
