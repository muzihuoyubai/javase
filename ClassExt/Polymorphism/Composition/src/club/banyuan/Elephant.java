package club.banyuan;

public class Elephant {

  // 持有一个私有的父类的引用，这个引用需要先实例化出来
  private Animal animal;

  public Elephant(Animal animal) {
    this.animal = animal;
  }

  public int getHeightInCM() {
    return animal.getHeightInCM();
  }

  public void setHeightInCM(int heightInCM) {
    animal.setHeightInCM(heightInCM);
  }

}
