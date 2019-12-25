package club.banyuan;

public interface Carryable {

  void lifted();

  /**
   * 提供默认的方法实现，实现类可以选择使用默认方法的实现，不自己实现。也可以重写该方法
   */
  default void move() {
    System.out.println("移动");
  }

  void dropped();
}
