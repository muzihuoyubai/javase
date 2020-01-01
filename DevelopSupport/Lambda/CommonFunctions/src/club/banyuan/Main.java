package club.banyuan;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {

    // 定义这样的行为，接收一个整数，返回这个整数+1，one相当于参数名字，可以任意定义
    Function<Integer, Integer> addOne = one -> one + 1;
    // apply 是Function唯一的抽象方法，上面的lambda相当于实现了这个抽象方法
    // 受到泛型的约束，apply必须接收一个Integer，返回一个Integer
    System.out.println(addOne.apply(2)); // 3

    // 第一个泛型表示传入的数据类型，第二个泛型表示返回的数据类型
    // Function<String, Integer> addTwo = one -> one + 1; // 编译报错，这里one的数据类型是String，但是返回值必须是Integer
    Function<String, Integer> addTwo = one -> Integer.parseInt(one) + 1;
    System.out.println(addTwo.apply("3")); // 4

    // 判断String是否为null或空字符串
    Predicate<String> stringIsBlank = str -> str == null || str.isEmpty();
    System.out.println(stringIsBlank.test("")); // true
    System.out.println(stringIsBlank.test(null)); // true
    System.out.println(stringIsBlank.test("123")); // false

    Supplier<Integer> randomPercent = () -> new Random().nextInt(100);
    System.out.println(randomPercent.get()); // 100以内的随机数

    Consumer<String> printConsumer = value -> System.out.println("consume " + value);
    printConsumer.accept("你好"); // consume 你好
  }
}
