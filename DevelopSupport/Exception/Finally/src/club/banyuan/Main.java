package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Gate gate = new Gate();
    // try {
    //   gate.open();
    //   gate.close();
    // } catch (GateBrokeException | GateStatusIllegalException e) {
    //   e.printStackTrace();
    // } finally {
    //   if (gate.isGateOpen()) {
    //     try {
    //       gate.close();
    //     } catch (GateBrokeException | GateStatusIllegalException e) {
    //       e.printStackTrace();
    //     }
    //   }
    // }

    // 以上的方式可以写成这样，finally专门用来关闭资源，外层try catch 用来处理异常
    try {
      try {
        gate.open();
        gate.close();
      } finally {
        if (gate.isGateOpen()) {
          gate.close();
        }
      }
    } catch (GateBrokeException | GateStatusIllegalException e) {
      e.printStackTrace();
    }
  }
}
