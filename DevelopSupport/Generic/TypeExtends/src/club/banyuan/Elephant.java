package club.banyuan;

public class Elephant extends Animal {

  public void elephantMethod() {
    System.out.println("elephantMethod");
  }

  // 重写了animalMethod，如果通过子类对象调用，则会调用重写后的方法
  @Override
  public void animalMethod() {
    System.out.println("elephantMethod");
  }
}
