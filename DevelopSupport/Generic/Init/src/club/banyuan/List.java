package club.banyuan;

public abstract class List {

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
  protected int elementCount;
  /**
   * 记录一共有多少个可用存储空间
   */
  protected int totalSize = INIT_SIZE;

  /**
   * 查询当前存储元素的个数
   *
   * @return 储存处了多少个元素（注意不是totalSize）
   */
  abstract int size();

  /**
   * 查询集合是否是空的，还没有保存元素
   *
   * @return true 是空的  false 至少保存了一个元素
   */
  abstract boolean isEmpty();

  /**
   * 添加一个元素到集合尾部
   *
   * @param o 被添加的元素
   * @return true 操作成功  false 操作失败
   */
  abstract boolean add(Object o);

  /**
   * 移除指定的元素
   *
   * @param o 被移除的元素
   * @return true 操作成功  false 操作失败
   */
  abstract boolean remove(Object o);

  /**
   * 删除指定位置的元素
   *
   * @param index 元素的位置
   * @return 被删除的元素
   */
  abstract Object remove(int index);

  /**
   * 清空集合
   */
  abstract void clear();

  /**
   * 查询指定位置的元素
   *
   * @param index 注意这里的index有可能不合法，负数或超出了实际保存的元素个数
   * @return 查询到的元素
   */
  abstract Object get(int index);

  /**
   * 替换指定位置的元素
   *
   * @param index   修改的元素位置，有可能不合法
   * @param element 新的元素对象
   * @return 被替换掉的元素对象
   */
  abstract Object set(int index, Object element);


}
