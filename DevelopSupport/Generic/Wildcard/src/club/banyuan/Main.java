package club.banyuan;

public class Main {

  public static void main(String[] args) {

    Box<Elephant> elephantBox = new Box<>();
    elephantBox.setElement(new Elephant());

    // BoxHandler.inboxAnimal(elephantBox,new Elephant()); // 编译报错，必须保证类型参数和方法声明的一致
    // BoxHandler.unboxAnimal(elephantBox); // 编译报错，必须保证类型参数和方法声明的一致
    BoxHandler.unbox(elephantBox); // 编译报错，必须保证类型参数和方法声明的一致

  }
}
