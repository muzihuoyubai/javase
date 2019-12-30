package club.banyuan;

public class BoxHandler {

  public static Animal unbox(Box<? extends Animal> box) {
    return box.getElement();
  }

  public static Animal unboxAnimal(Box<Animal> box) {
    return box.getElement();
  }

  public static void inboxAnimal(Box<Animal> box, Animal animal) {
    box.setElement(animal);
  }

  // 这里不能这样写，应为box可以接收任意Animal的子类，所以这里不能保证 ElephantBox可以装Animal
  // public static void inbox(Box<? extends Animal> box, Animal animal) {
  //   box.setElement(animal);
  // }
}
