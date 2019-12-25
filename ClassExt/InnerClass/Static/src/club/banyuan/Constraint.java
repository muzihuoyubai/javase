package club.banyuan;

/**
 * 使用如下方式声明一组常量，可以使用内部接口将这些常量归类
 */
public interface Constraint {

  // 内部接口默认就是public static
  // 接口的属性默认是public static final
  interface Animal {

    String TIGER = "tiger";
    String LION = "lion";
  }

  interface Machine {

    String CRANE = "crane";
    String FRIDGE = "fridge";
  }
}
