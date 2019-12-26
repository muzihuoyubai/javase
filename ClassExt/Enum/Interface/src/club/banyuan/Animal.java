package club.banyuan;

public enum Animal implements Carryable {
  Elephant("大象"), Lion("狮子");

  private final String type;

  Animal(String type) {
    this.type = type;
  }

  // 所有的对象都有该行为
  @Override
  public void lifted() {
    System.out.printf("%s被举起\n", this.type);
  }
}
