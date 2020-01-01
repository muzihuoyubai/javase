package club.banyuan;

public class Fridge {

  private Animal animal;

  public void store(Storeable storeable) {
    animal = storeable.store("冰箱");
  }
}
