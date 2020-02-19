package club.banyuan.animal;

public class Lion extends Animal {

  public Lion() {
    this(200);
  }

  public Lion(int heightInCM) {
    super(heightInCM);
    setHeightInCM(heightInCM);
    System.out.printf("创建一个狮子，高度%d厘米\n", heightInCM);
  }

  @Override
  public void locked() {
    System.out.println("发出吼叫声");
  }

  @Override
  public String getType() {
    return "狮子";
  }
}


