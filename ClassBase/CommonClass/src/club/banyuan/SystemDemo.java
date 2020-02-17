package club.banyuan;

public class SystemDemo {

  public static void main(String[] args) {
    /**
     * 获取系统当前毫秒值，获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
     */
    System.out.println(System.currentTimeMillis());

    /**
     * 复制数组 System.arraycopy(src, srcPos, dest, destPos, length);
     * src:源数组；
     * srcPos:源数组要复制的起始位置；
     * dest:目的数组；
     * destPos:目的数组放置的起始位置；
     * length:复制的长度。
     */
    int[] src = {1, 2, 3, 4, 5, 6, 7};
    int[] dest = {11, 22, 33};
    // dest[] = {3,4,33}
    System.arraycopy(src, 2, dest, 0, 2);
    for (int i = 0; i < dest.length; i++) {
      System.out.print(dest[i]);
    }

    /**
     * 结束正在运行的Java程序, 传入0正常退出，其他值异常退出
     */
    System.exit(0);
  }
}
