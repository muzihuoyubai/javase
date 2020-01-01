package club.banyuan;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {
    Function<String, Integer> str2Int = str -> Integer.valueOf(str);
    System.out.println(str2Int.apply("123")); // 123

    // 编译器会联系当前语义比较，apply的方法和valueOf方法的入参数量是否一致，类型是否一致，返回值类型是否一致
    // 方法引用，因为没有入参描述，因此没有办法对入参进行处理
    Function<String, Integer> str2IntRef = Integer::valueOf;
    System.out.println(str2IntRef.apply("123")); // 123

    Function<String, Integer> strIndexOf = str -> "123456".indexOf(str);
    System.out.println(strIndexOf.apply("2")); // 1
    System.out.println(strIndexOf.apply("7")); // -1

    Function<String, Integer> strIndexOfRef = "123456"::indexOf;
    System.out.println(strIndexOfRef.apply("2")); // 1
    System.out.println(strIndexOfRef.apply("7")); // -1

    BiFunction<String, String, Integer> commStrIndexOf = (target, index) -> target.indexOf(index);
    System.out.println(commStrIndexOf.apply("123456", "2")); // 1
    System.out.println(commStrIndexOf.apply("123456", "7")); // -1

    // 方法引用非静态方法，左侧如果是类名的话，函数接口的第一个参数，将被作为调用方法的对象
    BiFunction<String, String, Integer> commStrIndexOfRef = String::indexOf;
    System.out.println(commStrIndexOfRef.apply("123456", "2")); // 1
    System.out.println(commStrIndexOfRef.apply("123456", "7")); // -1

    // 根据实际对应的抽象方法的入参来确定到底是调用哪个构造函数
    Supplier<Elephant> supplierStr = Elephant::new;
    System.out.println(supplierStr.get().getHeightInCM());

    Function<Integer, Elephant> funcStr = Elephant::new;
    System.out.println(funcStr.apply(350).getHeightInCM());
  }
}
