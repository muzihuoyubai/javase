package club.banyuan;

public class Main {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    // 可以同时放不同数据类型的元素，没有约束
    list.add(12);
    list.add("String");
    list.add(new Elephant());
    System.out.println(list.get(1));

    // 查询出来的元素都是Object，想要使用的时候需要类型转换
    Object object = list.get(2);
    if (object instanceof Elephant) {
      Elephant elephant = (Elephant) object;
      elephant.elephantMethod();
    }
  }
}
