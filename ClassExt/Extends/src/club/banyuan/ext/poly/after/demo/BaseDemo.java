package club.banyuan.ext.poly.after.demo;

import club.banyuan.ext.poly.after.animal.Animal;
import club.banyuan.ext.poly.after.animal.Elephant;

public class BaseDemo {

  public static void main(String[] args) {
    Animal animal = new Elephant(300);
    // 编译的时候是Animal类型，实际运行的时候调用Elephant对象的方法
    animal.getType(); // 输出大象
  }
}
