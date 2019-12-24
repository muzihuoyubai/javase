package club.banyuan;

public class Father {

  private String fatherProp;

  // 父类中没有提供默认的构造方法
  public Father(String prop) {
    System.out.println("Father(String prop)");
    this.fatherProp = prop;
  }
}
