package club.banyuan;

public class Main {

  public static void main(String[] args) {
    // 无法直接实例化接口
    Carryable carryable = new Carryable(); // 编译报错

    // 使用接口的引用
    Carryable elephant = new Elephant();
    elephant.lifted();

    // 将接口作为参数，当然也可以作为返回值
    new Crane().lift(elephant);
  }
}
