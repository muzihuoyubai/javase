package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Crane crane = new Crane();

    // 接口数据类型性的变量可以接收任意实现了这个接口的类的对象
    Carryable carryable = new Elephant();
    carryable.lifted();
    // 作为参数传入，编译器可以通过，实际类型在运行的时候进行判断并调用实际对象的类中定义的方法
    crane.lift(carryable);
    System.out.println(carryable instanceof Carryable); // true
    System.out.println(carryable instanceof Elephant); // true
    System.out.println(carryable instanceof Lion); // false

    // lion也实现了这个接口，因此可以使用Carryable变量保存
    carryable = new Lion();
    carryable.lifted();
    crane.lift(carryable);

    System.out.println(carryable instanceof Carryable); // true
    System.out.println(carryable instanceof Elephant); // false
    System.out.println(carryable instanceof Lion); // true
  }
}
