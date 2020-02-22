package club.banyuan.machine;

public class Gate {

  private boolean isOpen;
  private static int openCount = 0;

  public boolean isOpen() {
    return isOpen;
  }

  public void open() throws GateException {
    gateBroke();
    isOpen = true;
    System.out.println("门开了");
  }

  public void close() throws GateException {
    gateBroke();
    isOpen = false;
    System.out.println("门关了");
  }

  /**
   * 第二次操作门的时候，抛出异常
   */
  private void gateBroke() throws GateException {
    if (++openCount == 2) {
      throw new GateException("门坏掉了");
    }
  }
}
