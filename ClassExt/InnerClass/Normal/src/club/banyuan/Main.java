package club.banyuan;

import club.banyuan.Outer.Inner;

public class Main {

    public static void main(String[] args) {
      Outer outer = new Outer();
      System.out.println(outer.getInnerPrivateProp()); // innerPrivateProp

      // 内部类对象创建需要使用外部类对象
      Inner inner = outer.new Inner();

      System.out.println(inner.getOuterPrivateProp()); // outerPrivateProp
      System.out.println(inner.getInnerPrivateProp()); // innerPrivateProp
      System.out.println(inner.getOuterProp()); // outerPropOverride
      System.out.println(inner.getInnerProp()); // outerPropOverrideByInner


    }
}
