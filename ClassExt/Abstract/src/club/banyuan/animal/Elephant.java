package club.banyuan.animal;

public class Elephant extends Animal {

  public Elephant() {
    this(350);
  }

  public Elephant(int heightInCM) {
    super(heightInCM);
    setHeightInCM(heightInCM);
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
  }

  @Override
  public void locked() {
    System.out.println("把鼻子卷起来");
  }

  @Override
  public String getType() {
    return "大象";
  }
}


