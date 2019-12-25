package club.banyuan;

public interface OuterInter {

  // 内部接口，默认就是public
  interface InnerInter {

    // 属性是public static的，而且必须要初始化
    String innerInterProp = "innerInterProp";
  }
}
