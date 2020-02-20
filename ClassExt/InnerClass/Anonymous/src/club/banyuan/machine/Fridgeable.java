package club.banyuan.machine;

public interface Fridgeable {

  void locked();

  default void frozen(String name) {
    System.out.println(name + "被冻起来了");
  }
}
