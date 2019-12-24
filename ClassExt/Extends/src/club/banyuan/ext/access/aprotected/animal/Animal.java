package club.banyuan.ext.access.aprotected.animal;

public class Animal {

  protected int weightInKG;
  protected int heightInCM;

  protected int getWeightInKG() {
    return weightInKG;
  }

  protected void setWeightInKG(int weightInKG) {
    this.weightInKG = weightInKG;
  }

  protected int getHeightInCM() {
    return heightInCM;
  }

  protected void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }
}
