package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Son son = new Son();

    // 通过子类对象访问父类中定义的成员
    System.out.println(son.familyName);

    // 通过子类对象访问父类中定义的方法
    System.out.println(son.getFamilyFeature());
  }
}
