package club.banyuan.animal;

public class Tiger extends Animal {

  public Tiger() {
    super(200);
  }

  public Tiger(int heightInCM) {
    super(heightInCM);
  }

  @Override
  public String getType() {
    return "老虎";
  }

  @Override
  public void locked() {
    System.out.println("把尾巴卷起来");
  }
}
