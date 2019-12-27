package club.banyuan;

// 继承自RuntimeException 非受查异常，抛出的时候不需要方法进行声明
public class WeightNotRightException extends RuntimeException {

  public WeightNotRightException() {
  }

  public WeightNotRightException(String message) {
    super(message);
  }
}
