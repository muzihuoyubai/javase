package club.banyuan;

public class ExceptionCodeOrder {

  /**
   * 执行顺序 1 3 4 5
   */
  public void order1() {
    try {
      System.out.print(1);
      throwGateBrokeException();
      System.out.print(2);
    } catch (GateBrokeException e) {
      System.out.print(3);
    } finally {
      System.out.print(4);
    }
    System.out.print(5);
  }

  /**
   * 执行顺序 1 2 4 5
   */
  public void order2() {
    try {
      System.out.print(1);
      System.out.print(2);
      // 不能catch GateBrokeException 因为编译器发现try里面没有方法能抛出GateBrokeException这个异常
      // 因为Exception本身还包含了非受查异常，因此可以通过编译
    } catch (Exception e) {
      System.out.print(3);
    } finally {
      System.out.print(4);
    }
    System.out.print(5);
  }

  /**
   * 执行顺序 1 3 5 6
   */
  public void order3() {
    try {
      System.out.print(1);
      throwGateBrokeException();
      System.out.print(2);
      // 注意这两个顺序不能颠倒，因为下面的包含了上面的，如果颠倒之后，那GateBrokeException 永远也捕获不到
    } catch (GateBrokeException e) {
      System.out.print(3);
    } catch (Exception e) {
      System.out.print(4);
    } finally {
      System.out.print(5);
    }
    System.out.print(6);
  }

  /**
   * 执行顺序 1 3 4 5
   */
  public void order4() {
    try {
      System.out.print(1);
      throwGateBrokeException();
      System.out.print(2);
      return;
    } catch (GateBrokeException e) {
      System.out.print(3);
    } finally {
      System.out.print(4);
    }
    System.out.print(5);
  }

  /**
   * 执行顺序 1 2 4
   */
  public void order5() {
    try {
      System.out.print(1);
      System.out.print(2);
      return;
    } catch (Exception e) {
      System.out.print(3);
    } finally {
      System.out.print(4);
    }
    System.out.print(5);
  }

  /**
   * 执行顺序 1 2 4 返回值是 2
   */
  public int order6() {
    try {
      System.out.print(1);
      System.out.print(2);
      return 1;
    } catch (Exception e) {
      System.out.print(3);
    } finally {
      System.out.print(4);
      return 2;
    }
    // System.out.print(5); // 编译报错了，finally里面代码一定执行，因此这里不能有代码，永远也执行不到
  }

  /**
   * 执行顺序 1 2 5 返回值是 2
   */
  public int order7() throws Exception {
    try {
      System.out.print(1);
      System.out.print(2);
      return 1;
    } catch (Exception e) {
      System.out.print(4);
      // 这里抛出的异常不被外部感知
      throw e;
    } finally {
      System.out.print(5);
      // finally内部写return，把catch中抛出的异常屏蔽了
      return 2;
    }
  }

  public void throwGateBrokeException() throws GateBrokeException {
    throw new GateBrokeException();
  }
}
