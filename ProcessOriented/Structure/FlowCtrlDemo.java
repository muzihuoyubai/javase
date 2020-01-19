/**
 * 流程控制演示
 *
 * @author www.banyuan.club
 **/
public class FlowCtrlDemo {

  public static void main(String[] args) {
    // 不允许在代码块内部定义和外部同名的变量
    int intOne = 5;
    boolean flag = true;
    if (flag) {
      // int intOne = 6; // 编译报错
    }

    /*
     * foreach 遍历数组
     */
    // 使用for each遍历数组
    int[] foreachArr = new int[2];
    foreachArr[0] = 1;
    foreachArr[1] = 20;
    // 依次输出foreachArr[0]和foreachArr[1]的内容
    for (int elem : foreachArr) {
      System.out.println(elem);
    }
  }
}
