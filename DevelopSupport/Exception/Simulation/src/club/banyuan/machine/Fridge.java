package club.banyuan.machine;

import club.banyuan.animal.Animal;

public class Fridge {

  private int heightInCM;
  private Animal animal;
  private Gate gate = new Gate();

  public Fridge() {
    this(200);
  }

  public Fridge(int heightInCM) {
    this.heightInCM = heightInCM;
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
  }

  public void setAnimal(Animal animal) {
    if (animal instanceof Fridgeable) {
      this.animal = animal;
      Fridgeable fridgeable = (Fridgeable) animal;
      fridgeable.locked();
      fridgeable.frozen(animal.getType());
    } else {
      // System.out.println(animal.getType() + "不能被放入冰箱");
      throw new IllegalArgumentException(animal.getType() + "不能被放入冰箱");
    }
  }

  public void openGate() throws GateException {
    gate.open();
  }

  public void closeGate() throws GateException {
    gate.close();
  }

  public boolean isGateOpen() {
    return gate.isOpen();
  }

  public Animal getAnimal() {
    return animal;
  }

  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  public int getHeightInCM() {
    return heightInCM;
  }

}


