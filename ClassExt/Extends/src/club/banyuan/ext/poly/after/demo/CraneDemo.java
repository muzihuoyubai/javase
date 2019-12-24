package club.banyuan.ext.poly.after.demo;

import club.banyuan.ext.poly.after.animal.Elephant;
import club.banyuan.ext.poly.after.animal.Lion;
import club.banyuan.ext.poly.after.machine.Crane;
import club.banyuan.ext.poly.after.machine.Fridge;

class CraneDemo {

  public static void main(String[] args) {
    Crane crane = new Crane();
    Fridge fridge = new Fridge();
    Elephant elephant = new Elephant(300);
    elephant.type = "大象";
    crane.liftAnimal(elephant);
    crane.putAnimal(fridge);

    Lion lion = new Lion(200);
    lion.type = "狮子";
    fridge.getAnimal();
    crane.liftAnimal(lion);
    crane.putAnimal(fridge);
  }
}
