package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Son son = new Son();

    // 使用属性，这个属性是继承自父类的
    System.out.println(son.familyName);

    // 使用方法，这个方法是继承自父类的
    System.out.println(son.getFamilyFeature());
  }
}
