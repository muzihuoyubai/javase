package animal;

public class Elephant {

  private static final int BASE_WEIGHT_IN_KG = 2000;

  public static int type = 1;

  private int weightInKG;
  private int heightInCM;

  // 因为在类的内部，因此可以直接通过变量名使用
  public static int getBaseWeightInKg() {
    // return this.weightInKG;
    // return weightInKG; // 不能在静态方法中访问非静态的属性
    return BASE_WEIGHT_IN_KG;
  }

  public int getWeightInKG() {
    return weightInKG;
  }

  public void setWeightInKG(int weightInKG) {
    if (Elephant.BASE_WEIGHT_IN_KG <= weightInKG) {
      this.weightInKG = weightInKG;
    } else {
      System.out.printf("输入数据可能有误，数据是:%d，低于%d", weightInKG, Elephant.BASE_WEIGHT_IN_KG);
    }
  }

  public int getHeightInCM() {
    return heightInCM;
  }

  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }
}
