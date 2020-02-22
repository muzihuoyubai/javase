package club.banyuan.machine;

import club.banyuan.animal.Animal;
import club.banyuan.animal.Elephant;
import club.banyuan.animal.Lion;
import club.banyuan.animal.Tiger;

public class Main {

  static void putInAnimal(Animal animal, Fridge fridge) {
    System.out.printf("把%d厘米高的%s装进%d厘米高的冰箱\n", animal.getHeightInCM(), animal.getType(),
        fridge.getHeightInCM());
    if (animal.getHeightInCM() >= fridge.getHeightInCM()) {
      System.out.println("冰箱装不下!");
      return;
    }

    try {
      fridge.setAnimal(animal);
      System.out.printf("冰箱里面的%s高度是%d厘米\n", animal.getType(), fridge.getAnimal().getHeightInCM());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.out.println("把" + animal.getType() + "放生");
    }
  }

  public static void main(String[] args) {
    Elephant elephant = new Elephant(300);
    Fridge fridge = new Fridge(500);
    putInAnimal(elephant, fridge);

    Fridge fridgeForLion = new Fridge(500);
    Lion lion = new Lion();
    putInAnimal(lion, fridgeForLion);

    Fridge fridgeForTiger = new Fridge(500);
    Tiger tiger = new Tiger();
    putInAnimal(tiger, fridgeForTiger);

  }
}


