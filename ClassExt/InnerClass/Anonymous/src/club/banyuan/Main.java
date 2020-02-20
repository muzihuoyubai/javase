package club.banyuan;

import club.banyuan.animal.Animal;
import club.banyuan.animal.Elephant;
import club.banyuan.machine.Fridge;
import club.banyuan.machine.Fridgeable;

public class Main {

  public static void main(String[] args) {

    // 匿名类的声明，相当于定义了一个Animal的子类，并进行了实例化
    // 因为匿名类声明和实例化在一起，所以无法声明一个抽象类并且同时实现一个接口
    Animal animal = new Animal(300) {
      @Override
      public String getType() {
        return "匿名动物子类";
      }
    };

    Elephant elephant = new Elephant(350) {
      @Override
      public String getType() {
        return "大象匿名子类";
      }
    };

    // animal的匿名子类无法装入冰箱，因为没有实现Fridgeable接口，匿名类也不支持同时实现接口
    Fridge fridgeAnimal = new Fridge(500);
    club.banyuan.machine.Main.putInAnimal(animal, fridgeAnimal);

    Fridge fridgeElephant = new Fridge(500);
    club.banyuan.machine.Main.putInAnimal(elephant, fridgeElephant);

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
    Animal animalLocal = new Animal(300) {
      @Override
      public String getType() {
        // type = "匿名大象"; // 编译报错，因为是final不能被赋值
        return type;
      }
    };

    System.out.println(animalLocal.getType());
  }
}
