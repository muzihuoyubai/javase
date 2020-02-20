package club.banyuan;

import club.banyuan.animal.Animal;
import club.banyuan.machine.Fridge;
import club.banyuan.machine.Fridgeable;

public class Main {

  public static void main(String[] args) {

    // 匿名类的声明，相当于定义了一个Animal的子类，并进行了实例化
    // 因为匿名类声明和实例化在一起，所以无法声明一个抽象类并且同时实现一个接口
    Animal animal = new Animal(300) {
      @Override
      public String getType() {
        return "匿名动物";
      }
    };
    Fridge fridge = new Fridge(500);
    fridge.setAnimal(animal);

    // 匿名内部类，使用接口创建
    Fridgeable fridgeable = new Fridgeable() {
      @Override
      public void locked() {
        System.out.println("匿名被关起来");
      }
    };

    // 匿名内部类中如果使用了外部的局部变量，需要保证该局部变量是final的
    // java8之前，需要显示指定变量是final的，java8之后，编译器可以自动在变量前增加final，被称作Effectively Final
    String type = "大象";
    // type = "大象"; // 这里再次对变量赋值的话，说明这一定不是final类型的变量，编译器无法增加final修饰，会导致匿名内部类里面报错
    new Animal(300) {
      @Override
      public String getType() {
        return type;
      }

    };

  }
}
