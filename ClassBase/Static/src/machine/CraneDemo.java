package machine;

import animal.Elephant;

class CraneDemo {

  public static void main(String[] args) {
    // 直接通过类名的方式调用静态方法
    System.out.println(Elephant.getBaseWeightInKg());

    Crane crane = new Crane();
    Elephant elephant1 = new Elephant();
    Elephant elephant2 = new Elephant();

    // 使用方法对属性进行赋值
    elephant1.setHeightInCM(200);
    elephant1.setWeightInKG(2000);

    elephant2.setHeightInCM(300);
    elephant2.setWeightInKG(3000);

    elephant1.type = 12;
    elephant2.type = 16;
    System.out.printf("type is:%d\n", elephant1.type); // 输出16

    crane.liftElephant(elephant1);
    crane.liftElephant(elephant2);
  }
}
