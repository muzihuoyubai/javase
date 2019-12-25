package machine;

import animal.Elephant;

class CraneDemo {

  public static void main(String[] args) {
    Crane crane = new Crane();
    Elephant elephant = new Elephant();

    // 使用方法对属性进行赋值
    elephant.setHeightInCM(200);
    elephant.setWeightInKG(2000);

    crane.liftElephant(elephant);
  }
}
