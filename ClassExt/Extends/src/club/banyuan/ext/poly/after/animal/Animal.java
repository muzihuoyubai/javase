package club.banyuan.ext.poly.after.animal;

public final class Animal {

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

  public String getType() {
    return "动物";
  }
}
