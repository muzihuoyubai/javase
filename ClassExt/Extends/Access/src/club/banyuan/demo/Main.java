package club.banyuan.demo;

import club.banyuan.Elephant;

public class Main {

  public static void main(String[] args) {
    Elephant elephant = new Elephant();

    // 使用属性，这个属性是继承自父类的
//    elephant.heightInCM = 300;

    // 使用方法，这个方法是继承自父类的
//    elephant.getAnimalType();

    Lion lion = new Lion();
    lion.heightInCM = 300;
  }
}
