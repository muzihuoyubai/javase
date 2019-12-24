package club.banyuan;

public class Son extends Father {

  public String sonMethod() {
    System.out.println("sonMethod");
    // 虽然不能访问private属性，但是可以通过父类提供的外部方法，间接访问父类的私有属性
    return getFatherProp(); // 获取到fatherProp
  }
  // 子类内部也不能访问父类的自由方法和属性
/* 编译报错
  public String sonMethodError() {
    String rlt = fatherProp; // 获取不到private 属性
    return fatherMethod(); // 获取不到private 方法
  }*/
}
