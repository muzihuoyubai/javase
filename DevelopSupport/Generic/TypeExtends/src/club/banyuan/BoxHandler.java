package club.banyuan;

public class BoxHandler {

  public static <T extends Animal> T unbox(Box<T> box) {
    return box.getElement();
  }

  public static <T extends Animal> void inbox(Box<T> box, T animal) {
    box.setElement(animal);
  }
}
