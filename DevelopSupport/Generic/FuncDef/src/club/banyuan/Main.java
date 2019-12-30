package club.banyuan;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String[] strings = new String[5];
    for (int i = 0; i < strings.length; i++) {
      strings[i] = i + "";
    }
    System.out.println(Arrays.toString(strings));
    String s = swap(strings, 1, 3);
    // int a = swap(strings, 1, 3); // 编译错误，检查提供给泛型的数据类型必须一致
    // String b = swap(new Integer[3], 0, 1); // 编译错误，检查提供给泛型的数据类型必须一致
    System.out.println(Arrays.toString(strings));
  }

  /**
   * 交换数组指定位置的两个元素，返回index较大的位置上的元素
   */
  public static <T> T swap(T[] arr, int index1, int index2) {
    if (index1 >= arr.length || index2 >= arr.length) {
      throw new ArrayIndexOutOfBoundsException("操作不合法");
    }
    T temp = arr[index2];
    arr[index2] = arr[index1];
    arr[index1] = temp;
    return index1 > index2 ? arr[index1] : arr[index2];
  }
}
