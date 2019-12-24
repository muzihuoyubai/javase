package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Father father = new Son();

    // 获取到了fatherPropOverride 并不是子类的属性值，说明属性不具备多态性
    System.out.println(father.fatherPropOverride);

    // 不能通过父类引用调用子类方法，就算是持有的是子类对象
    // 因为编译器认定父类中没有sonMethod, 察觉到实际对象具备这个方法的时候是在运行时候的事
    father.sonMethod(); // 编译报错
  }
}
