package club.banyuan.ext.override.animal;

public class Elephant extends Animal {

  private static final int BASE_HEIGHT_IN_CM = 300;

  public void setHeightInCM(int heightInCM) {
    if (BASE_HEIGHT_IN_CM <= heightInCM) {
      super.setHeightInCM(heightInCM);
    } else {
      System.out.printf("输入数据可能有误，数据是:%d，低于%d", heightInCM, Elephant.BASE_HEIGHT_IN_CM);
    }
  }
}
