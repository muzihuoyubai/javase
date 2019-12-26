package club.banyuan;

public class Main {

  public static void main(String[] args) {
    // compareTo 比较两个枚举对象的在枚举类中定义的先后顺序,返回一个int
    System.out.println(Season.SPRING.compareTo(Season.AUTUMN)); // -2
    System.out.println(Season.AUTUMN.compareTo(Season.SPRING)); // 2
    System.out.println(Season.SPRING.compareTo(Season.SPRING)); // 0

    // 传入的参数的类型必须和调用的枚举类型一致
    // System.out.println(Season.SPRING.compareTo(Gender.FEMALE)); // 编译报错

    // name() ，返回对象名称的字符串
    System.out.println(Season.SPRING.name()); // SPRING

    // toString()，返回对象名称的字符串，和name()不同的是toString()可以被重写，name()是final，因此不能重写
    System.out.println(Season.SPRING.toString()); // SPRING

    // valueOf() 是静态方法，用于返回一个枚举类对象实例，因为是有限个，所以根据传入的对象名称来返回对应的对象
    // 如果没有找到对应的名称，则会抛出异常
    System.out.println(Season.valueOf("WINTER")); // WINTER

    // ordinal() 返回int，返回枚举值在枚举类中定义顺序的序号，从0起
    System.out.println(Season.SPRING.ordinal());  // 0
    System.out.println(Season.AUTUMN.ordinal());  // 2

  }
}
