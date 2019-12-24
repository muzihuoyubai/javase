package club.banyuan.ext.access.aprotected.demo;

import club.banyuan.ext.access.aprotected.animal.Animal;
import club.banyuan.ext.access.aprotected.animal.Elephant;

public class AnimalDemo {

  public static void main(String[] args) {
    Elephant elephant = new Elephant();
    // 父类的protected属性和方法在不同包下的，其他类都不可以访问
//    elephant.setHeightInCM(300);  // 编译报错
  }
}
