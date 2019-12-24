package club.banyuan.ext.poly.before.demo;

import club.banyuan.ext.poly.before.machine.Fridge;
import club.banyuan.ext.poly.before.animal.Elephant;
import club.banyuan.ext.poly.before.machine.Crane;

public class CraneDemo {

  public static void main(String[] args) {
    Crane crane = new Crane();
    Fridge fridge = new Fridge();
    Elephant elephant = new Elephant(300);
    crane.liftElephant(elephant);
    crane.putElephant(fridge);
  }
}
