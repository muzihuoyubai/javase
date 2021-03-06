package club.banyuan.animal;

import club.banyuan.machine.Fridgeable;

public class Elephant extends Animal implements Fridgeable {

  public Elephant() {
    this(350);
  }

  public Elephant(int heightInCM) {
    super(heightInCM);
    setHeightInCM(heightInCM);
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
  }

  @Override
  public void locked() {
    System.out.println("把鼻子卷起来");
  }

  @Override
  public AnimalType getType() {
    return AnimalType.valueOf("ELEPHANT");
  }

  public void elephantMethod() {
    System.out.println("大象独有的方法");
  }
}


