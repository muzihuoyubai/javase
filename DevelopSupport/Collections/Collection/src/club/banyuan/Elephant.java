package club.banyuan;

public class Elephant {

  private String id;

  private int heightInCM;

  public Elephant(String id, int heightInCM) {
    this.id = id;
    this.heightInCM = heightInCM;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getHeightInCM() {
    return heightInCM;
  }

  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  @Override
  public String toString() {
    return "Elephant{" +
        "id='" + id + '\'' +
        ", heightInCM=" + heightInCM +
        '}';
  }
}
