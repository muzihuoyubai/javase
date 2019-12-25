package animal;

public class Elephant {

  // 使用private 禁止其他类对此属性的访问权限
  private int weightInKG;
  private int heightInCM;

  // 提供给外部的属性get和set方法
  public int getWeightInKG() {
    return weightInKG;
  }

  public void setWeightInKG(int weightInKG) {
    this.weightInKG = weightInKG;
  }

  public int getHeightInCM() {
    return heightInCM;
  }

  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }
}
