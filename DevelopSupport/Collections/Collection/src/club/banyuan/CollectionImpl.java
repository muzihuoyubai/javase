package club.banyuan;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionImpl<E> implements Collection<E> {

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

  @Override
  public int size() {
    return elementCount;
  }

  @Override
  public boolean isEmpty() {
    return elementCount == 0;
  }

  @Override
  public boolean contains(Object o) {
    for (E e : this) {
      // 如果添加了null到集合中，需要进行判断，否则会出现空指针异常
      if (e == null) {
        if (o == null) {
          return true;
        } else {
          continue;
        }
      }
      if (e.equals(o)) {
        return true;
      }
    }
    return false;
  }

  /**
   * 通过内部类实现了迭代器
   */
  @Override
  public Iterator<E> iterator() {
    return new Iterator<>() {
      int curPoint = 0;

      @Override
      public boolean hasNext() {
        return elementCount > curPoint;
      }

      // 转换之前没有类型检查，但是这里可以通过泛型保证类型安全，使用该注解不产生警告
      @SuppressWarnings("unchecked")
      @Override
      public E next() {
        if (!hasNext()) {
          throw new ArrayIndexOutOfBoundsException("没有元素");
        }
        return (E) objects[curPoint++];
      }

      @Override
      public void remove() {
        // 将后面的元素依次左移，覆盖掉这个位置上面的元素
        // 因为调用next后curPoint已经增加了，所以这里需要按照  curPoint - 1 的位置进行计算
        if (elementCount >= curPoint) {
          System.arraycopy(objects, curPoint, objects, curPoint - 1, elementCount - curPoint);
        }
        elementCount--;
        curPoint--;
        objects[elementCount] = null;// 移除最后一个元素的引用，方便垃圾回收器回收
      }
    };
  }

  @Override
  public Object[] toArray() {
    return Arrays.copyOf(objects, elementCount);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T[] toArray(T[] a) {
    if (a.length < elementCount) {
      return (T[]) Arrays.copyOf(objects, elementCount, a.getClass());
    }
    System.arraycopy(objects, 0, a, 0, elementCount);
    if (a.length > elementCount) {
      a[elementCount] = null;
    }
    return a;
  }


  @Override
  public boolean add(E o) {
    // 如果数组满了，进行扩容
    if (elementCount == totalSize) {
      objects = Arrays.copyOf(objects, totalSize + INIT_SIZE);
      totalSize += INIT_SIZE;
    }
    objects[elementCount] = o;
    elementCount++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return removeIf(e -> e.equals(o));
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    for (Object o : c) {
      if (!contains(o)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    if (c == null || c.isEmpty()) {
      return false;
    }
    c.forEach(this::add);
    return true;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    if (c == null || c.isEmpty()) {
      return false;
    }

    return removeIf(c::contains);
  }

  /**
   * 只保留集合里面出现的元素 原始集合发生了变化，返回true，否则返回false
   */
  @Override
  public boolean retainAll(Collection<?> c) {
    if (c == null || c.isEmpty()) {
      return false;
    }

    return removeIf(t -> !c.contains(t));
  }

  @Override
  public void clear() {
    // 新建一个数组，原始的存储区域由垃圾回收器回收
    objects = new Object[INIT_SIZE];
    totalSize = INIT_SIZE;
    elementCount = 0;
  }

  @Override
  public String toString() {
    if (elementCount == 0) {
      return "empty";
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < elementCount; i++) {
      builder.append(
          String.format("[%d]=%s ", i, objects[i] == null ? "null" : objects[i].toString()));
    }
    builder.append("\n");
    return builder.toString();
  }
}
