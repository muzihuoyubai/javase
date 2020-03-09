package club.banyuan;

class Animal {

}

class Elephant extends Animal {

}

class Lion extends Animal {

}

class Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}

public class Wildcard {

  static Animal unbox(Box<Animal> animalBox) {
    return animalBox.get();
  }

  static Animal wildcardUnbox(Box<? extends Animal> animalBox) {
    return animalBox.get();
  }

  public static void main(String[] args) {
    Box<Elephant> elephantBox = new Box<>();
    Box<Lion> lionBox = new Box<>();

    elephantBox.add(new Elephant());
    lionBox.add(new Lion());

    // unbox(elephantBox); // 编译报错报错，只能接受Box<Animal>
    wildcardUnbox(elephantBox);
  }
}
