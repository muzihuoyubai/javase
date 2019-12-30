package club.banyuan;

public class Box<E extends Animal> {

  private E element;

  public E getElement() {
    return element;
  }

  public void setElement(E element) {
    this.element = element;
  }
}
