package club.banyuan;

public class Elephant extends Animal {

  public Elephant(int heightInCM) {
    super(heightInCM);
  }

  @Override
  public String getType() {
    return "大象";
  }
}
