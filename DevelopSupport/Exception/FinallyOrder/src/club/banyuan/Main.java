package club.banyuan;

public class Main {

  // 执行顺序 1 3 4 5
  public static void main(String[] args) {
    ExceptionCodeOrder exceptionCodeOrder = new ExceptionCodeOrder();
    exceptionCodeOrder.order1();
    System.out.println();
    exceptionCodeOrder.order2();
    System.out.println();
    exceptionCodeOrder.order3();
    System.out.println();
    exceptionCodeOrder.order4();
    System.out.println();
    exceptionCodeOrder.order5();
    System.out.println();
    int result = exceptionCodeOrder.order6();
    System.out.println();
    System.out.println(result);
    try {
      exceptionCodeOrder.order7();
    } catch (Exception e) {
      // order7中finally中return了值，导致catch抛出的异常不会被抛出到函数外部了
      e.printStackTrace();
    }
  }
}
