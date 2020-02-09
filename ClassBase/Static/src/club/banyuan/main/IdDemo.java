package club.banyuan.main;

import club.banyuan.animal.Elephant;

public class IdDemo {

  public static void main(String[] args) {
    Elephant e1 = new Elephant();
    Elephant e2 = new Elephant(300);
    System.out.printf("lastId=%d\n",Elephant.lastId);
    System.out.printf("lastId=%d",Elephant.lastId);
  }
}
