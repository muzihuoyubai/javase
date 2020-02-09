package club.banyuan.animal;

public class Elephant {

  private int id;
  private int heightInCM;
  // 最后创建的对象的id，如果一个对象都没有创建，则是0
  public static int lastId = 0;

  public Elephant() {
    this(350);
  }

  public Elephant(int heightInCM) {
    this.heightInCM = heightInCM;
    id = ++lastId;
    System.out.printf("创建一个大象，id是%d,高度%d厘米\n", id, heightInCM);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
}


