package club.banyuan.cls;

import club.banyuan.cls.Gender;

public class ClsMain {

  public static void main(String[] args) {

    Season season = Season.valueOf("SPRING");
    System.out.println(season); // SPRING

    System.out.println(Gender.MALE); // 男性
    System.out.println(Gender.FEMALE); // 女性
    // Gender gender = new Gender(); // 编译报错，因为私有化了构造方法
    // 因为始终都是同一个对象，因此==返回true
    System.out.println(Gender.FEMALE == Gender.valueOf("FEMALE")); // true
    System.out.println(Gender.MALE == Gender.valueOf("MALE")); // true
    System.out.println(Gender.valueOf("not exist")); // null
  }
}
