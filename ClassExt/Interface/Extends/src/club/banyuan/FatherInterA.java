package club.banyuan;

public interface FatherInterA {

  default void defaultMethod() {
    System.out.println("FatherInterADefault");
  }

  void sameName();
}
