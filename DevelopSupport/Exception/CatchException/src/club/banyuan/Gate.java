package club.banyuan;

import java.util.Random;

public class Gate {

  private boolean isGateOpen;
  private static final Random random = new Random();

  public void open() throws GateBrokeException, GateStatusIllegalException {
    // 如果调用仅改变内置状态的话，可以不抛异常
    // 这里主要是为了说明问题，比如这里如果和外部设备交互的时候，
    // 如果已经开启，再次调用开启则会造成门轴损坏，那这里就需要进行保护
    // 实际上如果这种情况，可以抛出非受检异常，因为调用方需要保证门关闭的时候再调用开启方法
    // 使用受检异常通常是因为调用硬件或其他接口的时候出现问题，比如门把手损坏导致开门失败，这个时候需要抛出受检异常给调用者根据情况进行处理
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
