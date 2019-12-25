package club.banyuan;

public abstract class Animal {

  private int heightInCM;

  public Animal(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  public int getHeightInCM() {
    return heightInCM;
  }

  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  public abstract String getType();
}
