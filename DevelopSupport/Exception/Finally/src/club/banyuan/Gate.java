package club.banyuan;

import java.util.Random;

public class Gate {

  private boolean isGateOpen;
  private static final Random random = new Random();

  public void open() throws GateBrokeException, GateStatusIllegalException {
    if (isGateOpen) {
      throw new GateStatusIllegalException("门已经打开");
    }
    randomBroke();
    isGateOpen = true;
    System.out.println("把门打开");
  }

  public void close() throws GateBrokeException, GateStatusIllegalException {
    if (!isGateOpen) {
      throw new GateStatusIllegalException("门已经关闭");
    }
    randomBroke();
    isGateOpen = false;
    System.out.println("把门带上");
  }

  public boolean isGateOpen() {
    return isGateOpen;
  }

  private void randomBroke() throws GateBrokeException {
    if (random.nextInt(5) == 0) {
      throw new GateBrokeException("门坏掉了");
    }
  }
}
