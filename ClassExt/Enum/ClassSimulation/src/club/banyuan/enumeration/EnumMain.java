package club.banyuan.enumeration;

import club.banyuan.cls.Season;

public class EnumMain {

  public static void main(String[] args) {
    Season season = Season.valueOf("SPRING");
    System.out.println(season); // SPRING

    // 枚举类型默认重写了toString()方法 返回枚举类型定义时的对象的名字
    System.out.println(Gender.MALE); // 男性
    System.out.println(Gender.FEMALE); // 女性
    // Gender gender = new Gender(); // 编译报错，枚举类型默认将构造方法私有化
    // 因为始终都是同一个对象，因此==返回true
    // 提供了默认的valueOf方法，返回枚举值
    System.out.println(Gender.FEMALE == Gender.valueOf("FEMALE")); // true
    System.out.println(Gender.MALE == Gender.valueOf("MALE")); // true
    System.out.println(Gender.valueOf("not exist")); // 这里的行为不太一样，会抛出异常，将在后续说明
  }
}
