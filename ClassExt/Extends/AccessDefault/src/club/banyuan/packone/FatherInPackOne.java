package club.banyuan.packone;

public class FatherInPackOne {

  // 默认限定只有同包的类才可以访问
  String fatherProp = "fatherProp";

  String fatherMethod() {
    return "fatherMethod";
  }
}
