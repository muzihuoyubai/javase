package club.banyuan.machine;

import java.util.Random;

public class Gate {

  // 使用种子保证每次程序运行后，依次生成的随机数是一样的
  private static Random random = new Random(1);
  private boolean isOpen;

  public boolean isOpen() {
    return isOpen;
  }

  public void open() throws GateException {
    randomBroke();
    isOpen = true;
    System.out.println("门开了");
  }

  public void close() throws GateException {
    randomBroke();
    isOpen = false;
    System.out.println("门关了");
  }

  /**
   * 门会随机坏掉
   */
  private void randomBroke() throws GateException {
    int rate = random.nextInt(10);
    if (rate > 7) {
      throw new GateException("门坏掉了");
    }
  }
}
