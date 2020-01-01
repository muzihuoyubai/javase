package club.banyuan;

import java.util.Iterator;

public class Fridge implements Iterable<Elephant> {

  private Elephant[] storage = new Elephant[10];
  private int storageSize = 0;

  public void store(Elephant elephant) {
    if (storage.length > storageSize) {
      storage[storageSize] = elephant;
      storageSize++;
    } else {
      throw new UnsupportedOperationException("冰箱满了");
    }
  }

  @Override
  public Iterator<Elephant> iterator() {
    return new Iterator<>() {
      int curPoint = 0;

      @Override
      public boolean hasNext() {
        return storageSize > curPoint;
      }

      @Override
      public Elephant next() {
        if (!hasNext()) {
          throw new ArrayIndexOutOfBoundsException("没有元素");
        }
        return storage[curPoint++];
      }

      @Override
      public void remove() {
        // 将后面的元素依次左移，覆盖掉这个位置上面的元素
        // 因为调用next后curPoint已经增加了，所以这里需要按照  curPoint - 1 的位置进行计算
        if (storageSize >= curPoint) {
          System.arraycopy(storage, curPoint, storage, curPoint - 1, storageSize - curPoint);
        }
        storageSize--;
        curPoint--;
        storage[storageSize] = null;// 移除最后一个元素的引用，方便垃圾回收器回收
      }
    };
  }
}
