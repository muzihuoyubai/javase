package club.banyuan.anonymous;

import club.banyuan.animal.Animal;
import club.banyuan.animal.Elephant;
import club.banyuan.machine.Fridge;

public class Main {

  public static void main(String[] args) {
    String type = "外部声明的类型";
    // type = "";
    Animal animal = new Animal(300) {
      @Override
      public String getType() {
        return type;
      }
    };

    Elephant elephant = new Elephant() {
      @Override
      public String getType() {
        return "匿名大象子类";
      }
    };

    Fridge fridgeForAnimal = new Fridge(500);
    club.banyuan.machine.Main.putInAnimal(animal, fridgeForAnimal);

    Fridge fridgeForElephant = new Fridge(500);
    club.banyuan.machine.Main.putInAnimal(elephant, fridgeForElephant);
  }
}
