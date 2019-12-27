package club.banyuan;

public class HeightNotRightException extends Exception {

  // 自定义异常类通常会提供两个构造方法
  public HeightNotRightException() {
  }

  // 这个message是在调用toString的时候显示的，用于说明异常信息使用
  public HeightNotRightException(String message) {
    super(message);
  }
}
