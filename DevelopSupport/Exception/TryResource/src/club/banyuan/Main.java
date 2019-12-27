package club.banyuan;

public class Main {

  public static void main(String[] args) {

    try (Gate gate = new Gate()) {
      gate.open();
    } catch (GateBrokeException | GateStatusIllegalException e) {
      // 如果catch到异常后，资源关闭的时候也出现异常，将会调用 e.addSuppressed();将异常添加到catch到的异常中
      // 使用e.getSuppressed()获取添加进来的异常列表
      e.getSuppressed()[0].printStackTrace();
    }
  }
}
