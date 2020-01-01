package club.banyuan;

import java.util.Arrays;

public class ArrayList {

  /**
   * 初始化空间，如果空间不够用，再增加这么多空间
   */
  protected static final int INIT_SIZE = 20;

  /**
   * 用来保存数据的数组，如果数组满了，就重新创建一个数组，长度为当前数组长度+INIT_SIZE
   */
  protected Object[] objects = new Object[INIT_SIZE];
  /**
   * 记录保存了多少个元素
   */
  private int elementCount;
  /**
   * 记录一共有多少个可用存储空间
   */
  protected int totalSize = INIT_SIZE;

  int size() {
    return elementCount;
  }

  boolean isEmpty() {
    return elementCount == 0;
  }

  boolean add(Object o) {
    // 如果数组满了，进行扩容
    if (elementCount == totalSize) {
      objects = Arrays.copyOf(objects, totalSize + INIT_SIZE);
      totalSize += INIT_SIZE;
    }
    objects[elementCount] = o;
    elementCount++;
    return true;
  }

  boolean remove(Object o) {
    for (int i = 0; i < elementCount; i++) {
      if (objects[i] == o) {
        // 如果找到这个元素，则将后面的元素依次左移，覆盖掉这个位置上面的元素
        // 不需要手动释放元素的存储空间，因为由垃圾回收器处理
        if (elementCount - 1 - i >= 0) {
          System.arraycopy(objects, i + 1, objects, i, elementCount - 1 - i);
        }
        elementCount--;
        objects[elementCount] = null;// 移除最后一个元素的引用，方便垃圾回收器回收
        return true;
      }
    }
    return false;
  }

  // 如果横向看的话，重载了remove，如果纵向看的话，就是重写了父类方法
  Object remove(int index) {
    // 抛出非受检异常，不需要catch，用来提醒调用者传入的参数不合法
    if (index < 0 || index >= elementCount) {
      throw new ArrayIndexOutOfBoundsException("index不合法：" + index);
    }
    // 直接调用已经实现好的方法
    return remove(objects[index]);
  }

  void clear() {
    // 新建一个数组，原始的存储区域由垃圾回收器回收
    objects = new Object[INIT_SIZE];
    totalSize = INIT_SIZE;
    elementCount = 0;
  }

  Object get(int index) {
    if (index < 0 || index >= elementCount) {
      throw new ArrayIndexOutOfBoundsException("index不合法：" + index);
    }
    return objects[index];
  }

  Object set(int index, Object element) {
    if (index < 0 || index >= elementCount) {
      throw new ArrayIndexOutOfBoundsException("index不合法：" + index);
    }
    Object result = objects[index];
    objects[index] = element;
    return result;
  }
}
