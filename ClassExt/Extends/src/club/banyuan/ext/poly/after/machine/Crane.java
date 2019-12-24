package club.banyuan.ext.poly.after.machine;

import club.banyuan.ext.poly.after.animal.Animal;

public class Crane {

  private Animal animal;

  public void liftAnimal(Animal animal) {
    this.animal = animal;
  }

  public void putAnimal(Fridge fridge) {
    fridge.setAnimal(animal);
    animal = null;
  }
}
