package club.banyuan;

public class Main {

  public static void main(String[] args) {
    // Box<String> box = new Box<>(); 编译错误，因为现行了只能是Animal的子类，不能是String类型

    // 声明了父类类型的泛型类，是可以接收子类对象的
    Box<Animal> animalBox = new Box<>();
    animalBox.setElement(new Elephant());
    animalBox.getElement().animalMethod();

    BoxHandler.inbox(animalBox, new Elephant());
    // 实际上返回的还是
    Animal animal = BoxHandler.unbox(animalBox);
    // Elephant elephant = BoxHandler.unbox(animalBox); // 编译错误，编译器会进行类型检查，返回的应该是Animal类型无法赋值给Elephant对象
    animal.animalMethod();

    Box<Elephant> elephantBox = new Box<>();
    BoxHandler.inbox(elephantBox, new Elephant());
    // 返回了Elephant对象可以赋值给Animal的引用
    animal = BoxHandler.unbox(elephantBox);
    animal.animalMethod();
  }
}
