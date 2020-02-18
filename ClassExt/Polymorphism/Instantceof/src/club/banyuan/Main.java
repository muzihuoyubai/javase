package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Father sonToFather = new Son();

    // 打印父类的成员变量值
    System.out.println(sonToFather.fatherPropOverride);
    // 编译器不允许父类引用调用子类方法
    // sonToFather.sonMethod(); // 编译报错

    // true， 子类对象 instanceof 父类 是true
    System.out.println(sonToFather instanceof Son);
    Son son = (Son) sonToFather;
    // 打印子类的成员变量值
    System.out.println(son.fatherPropOverride);
    // 类型转换后就可以进行子类方法调用了
    son.sonMethod();

    Father father = new Father();
    // false， 父类对象 instanceof 子类是false
    System.out.println(father instanceof Son);
    // 可以通过编译，在运行的时候报错 java.lang.ClassCastException
    Son fatherToSon = (Son) father; // 运行时报错

  }
}
