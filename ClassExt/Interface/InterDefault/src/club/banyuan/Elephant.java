package club.banyuan;

public class Elephant implements Carryable {

  @Override
  public void lifted() {
    System.out.println("大象被举起");
  }

  @Override
  public void dropped() {
    System.out.println("大象被放下");
  }
}
