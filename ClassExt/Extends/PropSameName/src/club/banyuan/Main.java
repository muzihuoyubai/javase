package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Son son = new Son();

    // 输出从父类继承过来的属性值
    System.out.println(son.fatherProp);

    // 输出子类自定义的属性值，父类的属性值因为变量命名相同进而无法从外部访问
    System.out.println(son.fatherPropOverride);
    son.accessFatherProp();
  }
}
