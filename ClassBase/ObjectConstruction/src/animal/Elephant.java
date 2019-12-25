package animal;

public class Elephant {

  public static final int BASE_WEIGHT_IN_KG;
  public static final int BASE_HEIGHT_IN_CM;

  private int weightInKG;
  private int heightInCM;

  // 静态代码块
  static {
    BASE_WEIGHT_IN_KG = 2000;
    BASE_HEIGHT_IN_CM = 200;
  }
  // 非静态代码块
  {
    weightInKG = BASE_WEIGHT_IN_KG;
    heightInCM = BASE_HEIGHT_IN_CM;
  }

  public Elephant() {
    // System.out.println("Elephant()"); 编译报错 this构造方法必须出现在第一句
    this(BASE_WEIGHT_IN_KG, BASE_HEIGHT_IN_CM);
    System.out.println("Elephant()");
  }

  // 构造方法，在new 对象的时候调用，根据new 对象的时候传入的参数决定调用哪个构造方法
  public Elephant(int weightInKG, int heightInCM) {
    this.weightInKG = weightInKG;
    this.heightInCM = heightInCM;
    System.out.println("Elephant(int weightInKG, int heightInCM)");
  }

  public int getWeightInKG() {
    return this.weightInKG;
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

  public int getThisHeight() {
    return this.heightInCM;
  }

  public boolean compareThis(Elephant elephant) {
    return this == elephant;
  }
}
