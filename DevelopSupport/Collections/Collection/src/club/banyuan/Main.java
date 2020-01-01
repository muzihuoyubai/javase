package club.banyuan;

import java.util.Arrays;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {
    CollectionImpl<String> collection = new CollectionImpl<>();

    System.out.println(collection.isEmpty());
    collection.add("1");
    collection.add("2");
    System.out.println(collection.size());
    collection.add("3");
    collection.add("4");
    collection.add("5");
    System.out.println(collection.isEmpty());

    Collection<String> other = new CollectionImpl<>();
    other.add("a");
    other.add("b");
    other.add("c");
    System.out.println(collection.addAll(other));
    System.out.println(collection);

    System.out.println(collection.containsAll(other));
    other.add("d");
    System.out.println(collection.containsAll(other));
    other.remove("d");
    System.out.println(collection.containsAll(other));

    collection.retainAll(other);
    System.out.println(collection);

    System.out.println(Arrays.toString(collection.toArray(new String[10])));
    System.out.println(Arrays.toString(collection.toArray(new String[0])));
    System.out.println(Arrays.toString(collection.toArray()));

    collection.clear();
    System.out.println(collection);
  }
}
