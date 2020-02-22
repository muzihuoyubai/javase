package club.banyuan.machine;

public class Gate {

  private boolean isOpen;
  private static int count = 0;

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

  public void gateBroke() throws GateException {
    if (++count == 1) {
      throw new GateException("门坏掉了");
    }
  }
}
