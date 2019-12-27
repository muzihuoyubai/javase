package club.banyuan;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {
  }

  // 只有受查异常才需要声明抛出
  public void checkedExceptionMethod() throws IOException {

  }

  // 非受查异常不需要声明抛出，虽然编译不报错，但是没有必要这么写
  public void uncheckedExceptionMethod() throws RuntimeException {
    throw new RuntimeException();
  }

  // 一次抛出多个异常，使用逗号隔开
  public void checkedMultipleExceptionMethod() throws IOException, SQLException {

  }

  // 受查异常需要方法声明抛出的异常类
  public void setHeight(int height) throws HeightNotRightException {
    if (height <= 0) {
      throw new HeightNotRightException();
    }
  }

  // 非受查异常不需要方法声明
  public void setWeight(int weight) {
    if (weight <= 0) {
      throw new WeightNotRightException();
    }
  }
}
