package club.banyuan;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    Fridge fridge = new Fridge();
    fridge.store(new Elephant("1", 400));
    fridge.store(new Elephant("2", 350));
    fridge.store(new Elephant("3", 300));

    // 迭代器的方式进行遍历
    Iterator<Elephant> iterator = fridge.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      iterator.remove();
    }

    // 因为Fridge 实现了Iterable 其中有foreach方法，可以使用这种方式进行遍历
    for (Elephant elephant : fridge) {
      System.out.println(elephant);
    }
  }
}
