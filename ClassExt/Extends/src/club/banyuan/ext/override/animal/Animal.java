package club.banyuan.ext.override.animal;

public class Animal {

  private int weightInKG;
  private int heightInCM;

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

  private void testOverride() {
    System.out.println("testOverride");
  }
}
