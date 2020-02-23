package club.banyuan.machine;

import club.banyuan.animal.Animal;
import club.banyuan.animal.AnimalType;
import club.banyuan.animal.Elephant;
import club.banyuan.animal.Lion;
import club.banyuan.animal.Tiger;

public class Main {

  static void putInAnimal(Animal animal, Fridge fridge) {
    System.out.printf("把%d厘米高的%s装进%d厘米高的冰箱\n", animal.getHeightInCM(), animal.getType(),
        fridge.getHeightInCM());
    if (animal.getHeightInCM() < fridge.getHeightInCM()) {
      fridge.setAnimal(animal);
      if (fridge.getAnimal() != null) {
        System.out.printf("冰箱里面的%s高度是%d厘米\n", animal.getType(), fridge.getAnimal().getHeightInCM());
      }
    } else {
      System.out.println("冰箱装不下!");
    }
  }

  static <T extends Animal> void putInAnimal(T animal, GenericFridge<T> fridge) {
    System.out.printf("把%d厘米高的%s装进%d厘米高的冰箱\n", animal.getHeightInCM(), animal.getType(),
        fridge.getHeightInCM());
    if (animal.getHeightInCM() < fridge.getHeightInCM()) {
      fridge.setAnimal(animal);
      if (fridge.getAnimal() != null) {
        System.out.printf("冰箱里面的%s高度是%d厘米\n", animal.getType(), fridge.getAnimal().getHeightInCM());
      }
    } else {
      System.out.println("冰箱装不下!");
    }
  }

  public static void main(String[] args) {
    // Elephant elephant = new Elephant(300);
    // Fridge fridge = new Fridge(500);
    // putInAnimal(elephant, fridge);
    // ((Elephant) fridge.getAnimal()).elephantMethod();
    //
    // Fridge fridgeForLion = new Fridge(500);
    // Lion lion = new Lion();
    // putInAnimal(lion, fridgeForLion);
    // ((Lion) fridgeForLion.getAnimal()).lionMethod();
    //
    // Fridge fridgeForTiger = new Fridge(500);
    // Tiger tiger = new Tiger();
    // putInAnimal(tiger, fridgeForTiger);

    GenericFridge<Elephant> elephantGenericFridge = new GenericFridge<>(500);
    Elephant elephantForGeneric = new Elephant(300);
    putInAnimal(elephantForGeneric, elephantGenericFridge);
    elephantGenericFridge.getAnimal().elephantMethod();

    GenericFridge<Lion> lionGenericFridge = new GenericFridge<>(500);
    Lion lionForGeneric = new Lion();
    putInAnimal(lionForGeneric, lionGenericFridge);
    lionGenericFridge.getAnimal().lionMethod();


  }
}


