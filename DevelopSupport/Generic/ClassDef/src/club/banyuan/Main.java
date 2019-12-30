package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Box<String> box = new Box<>();
    // box.setElement(123); // 编译错误，编译器将要检查数据类型发现setElement的类型参数是String而不是int
    box.setElement("123");
    System.out.println(box.getElement());

    // 声明了父类类型的泛型类，是可以接收子类对象的
    Box<Animal> animalBox = new Box<>();
    animalBox.setElement(new Elephant());
    animalBox.getElement().animalMethod();

    // 如果不指定类型参数，则默认是Object，但是编译的时候会报错
    // javac src/club/banyuan/*.java  -Xlint:unchecked
    Box warningBox = new Box();
    warningBox.setElement(123);
    warningBox.setElement("123");
  }
}
