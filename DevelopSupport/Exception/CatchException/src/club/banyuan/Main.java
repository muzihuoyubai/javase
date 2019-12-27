package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Gate gate = new Gate();
    try {
      gate.open();
      gate.close();
    } catch (GateBrokeException | GateStatusIllegalException e) {
      e.printStackTrace();
      // e = new GateBrokeException(); // 编译失败，一次性捕获多级异常的时候，e这个变量为final型
    }

    try {
      gate.open(); // 如果上面open不抛异常，那么这里就抛异常
      gate.close();
      gate.close(); // 如果前面都正常，这里就抛异常
    } catch (GateBrokeException e) {
      e.printStackTrace();
      System.out.println("门坏了");
    } catch (GateStatusIllegalException e) {
      e.printStackTrace();
      System.out.println("门的状态不对");
    }
  }
}
