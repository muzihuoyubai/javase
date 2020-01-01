package club.banyuan;

public class Elephant extends Animal implements Storeable{

  public Elephant(int heightInCM) {
    super(heightInCM);
  }

  @Override
  public String getType() {
    return "大象";
  }

  @Override
  public Animal store(String where) {
    return null;
  }
}
