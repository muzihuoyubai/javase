package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Carryable carryable = new Elephant();

    carryable.lifted();
    carryable.move();
    carryable.dropped();
  }
}
