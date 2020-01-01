package club.banyuan;

public class Main {

  public static void main(String[] args) {
    LambdaDemo lambdaDemo = new LambdaDemo();
    System.out.println(lambdaDemo.refVariable().get()); // staticStr_string_localStr
    // lambda表达式可以修改实例中的私有变量的值
    System.out.println(lambdaDemo.getStr()); // staticStr_string_localStr
  }
}
