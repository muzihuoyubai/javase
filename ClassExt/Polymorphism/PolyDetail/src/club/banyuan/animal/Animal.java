package club.banyuan.animal;

public class Animal {

  private int heightInCM;

  public String getType() {
    return "动物";
  }

  public Animal(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  public void setHeightInCM(int heightInCM) {
    if (heightInCM <= 0) {
      System.out.println("传入的高度不合法!");
      return;
    }

    this.heightInCM = heightInCM;
  }

  public int getHeightInCM() {
    return heightInCM;
  }

  public void locked() {
    System.out.println("动物被关了起来");
  }
}


