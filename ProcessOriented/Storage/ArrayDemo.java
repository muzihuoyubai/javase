/**
 * 数组操作demo
 *
 * @author www.banyuan.club
 **/
public class ArrayDemo {

  public static void main(String[] args) {
    /*
     *  数组的声明和初始化
     */
    // 和c语言不同，并不是在声明数组的时候就分配了内存空间
    int[] arrInit;
    // 使用new 创建数组
    arrInit = new int[5];

    // 声明变量的时候创建数组并初始化
    // 等价于
    // int[] arrInit1 = new int[]{1, 2, 3, 4, 5};
    int[] arrInit1 = {1, 2, 3, 4, 5};

    // 可以先声明，然后在创建并赋值
    int[] arrInit2;
    arrInit2 = new int[]{1, 2, 3, 4, 5};

    // 如果不赋值，则无法使用，变量必须被初始化之后才能使用
    // int[] nullArray; // 对于下面println的时候将报错
    int[] nullArray = null;
    System.out.println(nullArray); // null
    // System.out.println(nullArray.length); // java.lang.NullPointerException

    /*
     * 数组的长度
     */
    int[] lengthArr = new int[3];
    // 使用length获取数组的长度。
    // length 可以看成是一个数组的成员, 是一个final int 类型
    // 随着new 创建数组后被初始化
    System.out.println(lengthArr.length); // 3

    // 可以创建出一个数组长度为0的数组
    int[] emptyArr = new int[0];

    /*
    // 不允许访问不存在的数组元素，将出现异常
    System.out.println(intArr3[5]); // 运行将报错 ArrayIndexOutOfBoundsException
    */

    // 使用for each遍历数组
    int[] foreachArr = new int[2];
    for (int elem : foreachArr) {
      // 分别输出两个0，数组在创建的时候默认进行了初始化
      System.out.println(elem);
    }

    // 数组变量的相互赋值，是赋值的引用，对其中一个内容进行修改，会被另一个数组变量获取到
    int[] refArr1 = new int[2];
    refArr1[0] = 10;
    refArr1[1] = 10;
    int[] refArr2 = refArr1;
    System.out.println(refArr1[1]); // 输出10
    refArr2[1] = 20;
    System.out.println(refArr1[1]); // 输出20

    /*
     * 数组的初始值
     */
    System.out.println((new int[1])[0]); // 0
    System.out.println((new byte[1])[0]); // 0
    System.out.println((new short[1])[0]); // 0
    System.out.println((new char[1])[0]); // \u0000 空字符
    System.out.println((new boolean[1])[0]); // false
    System.out.println((new float[1])[0]); // 0.0
    System.out.println((new double[1])[0]); // 0.0
    System.out.println((new String[1])[0]); // null
  }

}
