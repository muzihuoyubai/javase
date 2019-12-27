package club.banyuan;

public class Gate implements AutoCloseable {

  private boolean isGateOpen;

  public void open() throws GateBrokeException, GateStatusIllegalException {
    if (isGateOpen) {
      throw new GateStatusIllegalException("门已经打开");
    }
    throwGateBrokeException();
    isGateOpen = true;
    System.out.println("把门打开");
  }

  @Override
  public void close() throws GateBrokeException, GateStatusIllegalException {
    if (!isGateOpen) {
      throw new GateStatusIllegalException("门已经关闭");
    }
    throwGateBrokeException(); // 如果这里抛出异常，则将会被增加到异常的suppress中
    isGateOpen = false;
    System.out.println("把门带上");
  }

  public boolean isGateOpen() {
    return isGateOpen;
  }

  private void throwGateBrokeException() throws GateBrokeException {
    throw new GateBrokeException("门坏掉了");
  }
}
