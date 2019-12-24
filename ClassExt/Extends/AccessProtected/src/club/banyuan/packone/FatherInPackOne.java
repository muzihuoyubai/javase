package club.banyuan.packone;

public class FatherInPackOne {

  // protected 限定只有同包的类或子类才可以访问
  protected String fatherProp = "fatherProp";

  protected String fatherMethod() {
    return "fatherMethod";
  }
}
