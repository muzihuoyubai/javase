package machine;
import animal.Elephant;

class CraneDemo {

  public static void main(String[] args) {
    // 使用定义的类作为数据类型
    // 使用new 创建一个对象（实例）
    Crane crane = new Crane();
    Elephant elephant = new Elephant();

    // 使用. 访问对象的属性，可以对属性赋值或使用
    elephant.heightInCM = 200;
    elephant.weightInKG = 2000;

    // 使用对象的方法
    crane.liftElephant(elephant);
  }
}
