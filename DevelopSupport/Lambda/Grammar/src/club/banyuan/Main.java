package club.banyuan;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {
    ConcatString concatString = (String one, String two) -> {
      return one + two;
    };

    // 编译器可以根据声明进行推断参数类型，可以将参数类型省略
    concatString = (one, two) -> {
      return one + two;
    };
    /*
    // 编译报错
    ConcatString concatString = () -> {
      // 编译器会根据ConcatString声明的方法的参数列表进行检查，个数和数据类型必须一致
      return "getString";
    };
    */

    GetString getString = () -> {
      // 编译器会根据GetString声明的方法对返回值类型进行检查
      // return 1; // 编译报错,类型不匹配
      return "getString";
    };
  }
}
